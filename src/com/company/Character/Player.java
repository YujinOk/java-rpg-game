package com.company.Character;

import com.company.Enemy.Enemy;
import com.company.Item.Inventory;
import com.company.Item.Item;
import com.company.Level;
import com.company.RandomGenerator;
import com.company.SuperPower.SuperPower;

import java.util.Scanner;

public class Player extends Character {
    public int intelligence = 0;
    public int physicalPower = 0;
    public int energyFromFood=5;
    public int energyFromRest=5;
    int itemWornIndex;
    boolean isEquipped=false;
    public String equippedItemName;
    public boolean hasWon=false;
    public boolean gotPrincess=false;
    public Inventory storageList;
    Scanner in= new Scanner(System.in);
    public SuperPower superPower;
    public Enemy enemy;

    public Player(int itemWornIndex, Level level) {
        super("", 20, 0, 0, 0, 10,level);
        this.itemWornIndex = itemWornIndex;
        this.storageList= new Inventory(this);
    }

    public void setItemWorn(int itemWornIndex){
        this.itemWornIndex=itemWornIndex;
    }

    public void setAttackPower(int attackPower){
        this.attackPower=attackPower;
    }

    public void setDefenseRate(int defenseRate){
        this.defenseRate=defenseRate;
    }

    public void setExp(int exp){
        this.exp=exp;
    }

    public void setIntelligence(int intelligence){
        this.intelligence=intelligence;
    }

    public void setPhysicalPower(int physicalPower){
        this.physicalPower=physicalPower;
    }

    public void seeMyInfo(SuperPower superPower){
        System.out.println("");
        System.out.println("My name is "+ this.name);
        System.out.println("My super power: "+ superPower.name);
        System.out.println("My health point: "+ this.hp);
        System.out.println("");
    }

@Override
    public void run() {

    game=true;
    while(game){
        try{
            this.attack();
            Thread.sleep(2000);
            if(this.hp<=0 || this.enemy.hp<=0){
                game=false;
                break;
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }
      }




    public void attack(){
        System.out.println("");
        System.out.println("         " + this.name + " Attack!");
        System.out.println("==========================================");

        if(this.attackPower>0 && this.attackPower> this.enemy.attackPower){
            System.out.println(this.name+ " is using attack power 🤺");
            this.enemy.hp-=RandomGenerator.randomGenerator(3);
        }else {
            this.enemy.hp-=RandomGenerator.randomGenerator(2);
        }
        if(this.energyFromFood==0 && this.energyFromRest==0){
            System.out.println("🪫 Your energy running low, it's going to consume your health point 🪫");
            this.hp--;
        }
        if(this.enemy.hp<=0){
            this.enemy.setHp(0);
        }

        System.out.println(this.name + " HP: "+ this.hp);
        System.out.println(enemy.name + " HP: " + enemy.hp);
    }


    public void princessEncounter(){
        System.out.println("Hello...you...must be the princess...? 🤯");
    }
    public void inventoryChoice(){
        System.out.println("1. Check my inventory");
        System.out.println("2. Equip a weapon");
        System.out.println("3. Wear clothes");
        System.out.println("4. Remove item");

        int inventoryChoice= in.nextInt();

        if(inventoryChoice==1 ){
            if(this.storageList.storage.size()==0){
                System.out.println("\uD83D\uDEAB️ You don't have any item stored");

            }else{
                this.showStoredItem();
            }

        }else if(inventoryChoice==2){
            this.storageList.showWeaponList();
            int itemToWear=in.nextInt();
            int itemToWearIndex=itemToWear-1;
            this.wearAnItemWithPowerAndDefense(itemToWearIndex, "Weapon");

        }else if(inventoryChoice==3){
            this.storageList.showClothesList();
            int itemToWear=in.nextInt();
            int itemToWearIndex=itemToWear-1;
            this.wearAnItemWithPowerAndDefense(itemToWearIndex, "Clothes");
        }else if(inventoryChoice==4){
            this.isEquipped=false;
            System.out.println("You successfully removed the "+ this.equippedItemName);
            this.equippedItemName="";

        }

    }

    public boolean upgradeTheLevel() {
        if(this.level.name=="Ground"){
            if(this.exp>=1 && this.intelligence >= 20 && this.physicalPower >= 20){
                System.out.println("You are one step closer to rescue the princess! \uD83D\uDC51");
                System.out.println("You are going to have to kill the enemy who is stronger than others you fought before");
                System.out.println("Good luck! \uD83C\uDF89");
                this.level.name="Gold";
                return true;
            }else{
                int neededIntelligence=20-this.intelligence;
                int neededPhysicalPower=20-this.physicalPower;
                int neededExp=1-this.exp;
                System.out.println("--------------------------------------------------------------");
                System.out.println("\uD83D\uDEAB You don't meet the requirements to change your occupation");
                System.out.println("Requirements for changing occupation ✅");
                System.out.println("");
                if(neededExp>0 && neededExp<=3){
                    System.out.println("Needed Exp 🤺: "+ neededExp);
                }
                if(neededIntelligence>0 && neededIntelligence<=20){
                    System.out.println("Needed Intelligence \uD83D\uDCDA: "+ neededIntelligence);
                }
                if(neededPhysicalPower>0 && neededPhysicalPower<=20){
                    System.out.println("Needed Physical Power 💪: "+ neededPhysicalPower  );
                }
                return false;
            }
        }

        return false;
    }

    public void attackWithAttackPower(Character opponent) {
        if (this.attackPower > opponent.attackPower) {
            int randHp = RandomGenerator.randomGenerator(5);
            opponent.hp -= randHp;
            opponent.damageTaken += randHp;
            System.out.println("==========================================");
            System.out.println(this.name + " Attack Power: " + this.attackPower);
            System.out.println(opponent.name + " Damage Taken: " + opponent.damageTaken);

        } else if (opponent.attackPower > this.attackPower) {
            int randHp = RandomGenerator.randomGenerator(5);
            this.hp -= randHp;
            this.damageTaken += randHp;
            System.out.println(opponent.name + " Attack Power: " + opponent.attackPower);
            System.out.println(this.name + " Damage Taken: " + this.damageTaken);
        } else {
            int randHp = RandomGenerator.randomGenerator(3);
            opponent.hp -= randHp;
            opponent.setHp(opponent.hp -= randHp);
            opponent.damageTaken += randHp;
        }
    }
    public void energyAndRest(){
        this.energyFromFood-=5;
        this.energyFromRest-=5;
        System.out.println(" ⚠️ Please don't forget to eat some food and rest to recover!");
        System.out.println("Energy from food: "+ this.energyFromFood);
        System.out.println("Energy from rest: "+ this.energyFromRest);
        System.out.println("");
    }

    public void showStoredItem(){
        if(this.isEquipped && this.storageList.storage.size()==0){
            System.out.println("No items stored");
        }
        System.out.println("Stored Item/s: ");

        for(int i=0; i<this.storageList.storage.size(); i++){
            if(this.storageList.storage.get(i).name==this.equippedItemName){
                System.out.println(i+1 +". "+ this.storageList.storage.get(i).name+ "( Currently wearing)");
            }else{
                System.out.println(i+1 +". "+ this.storageList.storage.get(i).name);
            }

        }
    }
    public void energyAffectingHp(){
        if(this.energyFromRest==0|| this.energyFromFood==0){
            this.hp-=10;
            System.out.println("You are running low \uD83E\uDEAB");
            System.out.println(" ⚠️ Please don't forget to eat some food and rest to recover!");
            System.out.println("\uD83D\uDEAB Otherwise, you will die shortly");

        }
    }


    public void buyAnItem(Item chosenItem){
        this.storageList.storage.add(chosenItem);

    }

    public void wearAnItemWithPowerAndDefense(int itemToWear, String typeOfItem){
        if(typeOfItem=="Weapon" && this.isEquipped==false){
            this.setItemWorn(itemToWear);
            int playerEarnedAttackPower=this.storageList.weaponStorage.get(itemToWear).price;
            this.setAttackPower( playerEarnedAttackPower);
            System.out.println("");
            System.out.println("Successfully equipped "+ this.storageList.weaponStorage.get(itemToWear).name+ "\uD83E\uDD73");
            this.equippedItemName=this.storageList.weaponStorage.get(itemToWear).name;
            System.out.println("Attack Power: "+ this.attackPower);
            this.isEquipped=true;
            System.out.println("");
        }else if(typeOfItem=="Clothes" &&this.isEquipped==false ){
            this.setItemWorn(itemToWear);
            int playerEarnedDefenseRate=this.storageList.storage.get(itemToWear).price;
            this.setDefenseRate(playerEarnedDefenseRate);
            System.out.println("Successfully equipped "+ this.storageList.clothesStorage.get(itemToWear).name + "\uD83E\uDD73");
            this.equippedItemName=this.storageList.clothesStorage.get(itemToWear).name;
            System.out.println("Defense Rate: "+ this.defenseRate);
            this.isEquipped=true;
            System.out.println("");
        }else if(this.isEquipped==true){
            System.out.println("🙅‍♀️You cannot wear two items at the same time! please remove one item and try another!");
        }
    }


}
