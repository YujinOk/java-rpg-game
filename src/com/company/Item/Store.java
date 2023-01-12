package com.company.Item;
import com.company.Character.Player;
import com.company.GameStart;
import java.util.ArrayList;
import java.util.Scanner;

public class Store {
    ArrayList<Edible> foodList = new ArrayList<Edible>();
    ArrayList<Weapon> weaponList = new ArrayList<Weapon>();
    ArrayList<Wearable> clothesList = new ArrayList<Wearable>();
    Scanner sc=new Scanner(System.in);
    Player player;
    GameStart gameStart;

    public Store(Player player, GameStart gameStart){
        this.player=player;
        this.gameStart=gameStart;
    }

    public void addFoodList(){
        this.foodList.add(new Edible(5,"Chocolate", 5));
        this.foodList.add(new Edible(5, "Cake", 5));
        this.foodList.add(new Edible(10, "Sweet potato", 10));
        this.foodList.add(new Edible(10, "Milk", 10));
        this.foodList.add(new Edible(5, "Banana", 5));
    }

    public void addWeaponList(){
        this.weaponList.add(new Weapon(10, "Shot gun", 10));
        this.weaponList.add(new Weapon(20, "Hammer", 20));
        this.weaponList.add(new Weapon(15, "Sword", 15));
        this.weaponList.add(new Weapon(15, "Knife", 15));
        this.weaponList.add(new Weapon(10, "Baseball bat", 10));
    }

    public void addClothesList(){
        this.clothesList.add(new Wearable(5, "Bullet proof vest", 5));
        this.clothesList.add(new Wearable(5, "Leather jacket", 5));
        this.clothesList.add(new Wearable(5, "Bikini", 5));
    }

    public void showFoodListToChoose(){
        for(int i=0; i<this.foodList.size(); i++){
            System.out.println(i+1 + ". " + foodList.get(i).name+ ": $"+ foodList.get(i).price);
        }
    }

    public void showWeaponListToChoose(){
        for(int i=0; i<this.weaponList.size(); i++){
            System.out.println(i+1 + ". " + weaponList.get(i).name+ ": $"+ weaponList.get(i).price);
        }
    }

    public void showClothesListToChoose(){
        for(int i=0; i<this.clothesList.size(); i++){
            System.out.println(i+1 + ". " + clothesList.get(i).name+ ": $"+ clothesList.get(i).price);
        }
    }

    public void storeChoice(){
        System.out.println("1. Buy food/ drinks");
        System.out.println("2. Buy a weapon");
        System.out.println("3. Buy a clothes");
        System.out.println("4. Exit the store");

        int storeChoice=sc.nextInt();

        if(this.player.money<=0 && storeChoice==1||this.player.money<=0 && storeChoice==2||this.player.money<=0 &&storeChoice==3 ) {
            System.out.println("\uD83D\uDEAB  You don't have enough money to buy an item");
            return;
        }
        if(storeChoice==1){
            System.out.println("-----------------------------------");
            System.out.println("Currently I have $" + player.money);
            System.out.println("-----------------------------------");
            this.addFoodList();
            this.showFoodListToChoose();

            int itemNum= sc.nextInt();
            int itemIndex=itemNum-1;
            Item itemToBuy=this.foodList.get(itemIndex);

            if(this.player.money >= itemToBuy.price){
                this.player.energyFromFood+=itemToBuy.price;
                this.player.money= this.player.money-itemToBuy.price;
                System.out.println("Energy: "+ this.player.energyFromFood);
                System.out.println("Money: "+ this.player.money);
            }else{
                System.out.println("\uD83D\uDEAB You don't have enough money to buy this item");
            }


        }else if(storeChoice==2){
            System.out.println("-----------------------------------");
            System.out.println("Currently I have $" + player.money);
            System.out.println("-----------------------------------");
            this.addWeaponList();
            this.showWeaponListToChoose();
            int itemNum= sc.nextInt();
            int itemIndex=itemNum-1;
            Weapon itemToBuy=this.weaponList.get(itemIndex);
            if(this.player.money>=itemToBuy.price){
                this.player.buyAnItem(itemToBuy);
                this.player.storageList.weaponStorage.add(itemToBuy);
                System.out.println("1. Equip a weapon immediately");
                System.out.println("2. Leave the weapon in the Inventory");

                int wearTheItemOrNot=sc.nextInt();
                if(wearTheItemOrNot==1){
                    this.player.storageList.showWeaponList();
                    int itemToWear=sc.nextInt();
                    int itemToWearIndex=itemToWear-1;
                    this.player.wearAnItemWithPowerAndDefense(itemToWearIndex, "Weapon");
                }else if(wearTheItemOrNot==2){
                    this.player.showStoredItem();
                }
            }else{
                System.out.println("\uD83D\uDEAB You don't have enough money to buy this item");
            }


        }else if(storeChoice==3){
            System.out.println("-----------------------------------");
            System.out.println("Currently I have $" + player.money);
            System.out.println("-----------------------------------");
            this.addClothesList();
            this.showClothesListToChoose();
            int itemNum= sc.nextInt();
            int itemIndex=itemNum-1;
            Wearable itemToBuy=this.clothesList.get(itemIndex);
            player.buyAnItem(itemToBuy);
            this.player.storageList.clothesStorage.add(itemToBuy);

            System.out.println("1. Wear clothes immediately");
            System.out.println("2. Leave the clothes in the Inventory");

            int wearOrNot=sc.nextInt();
            if(wearOrNot==1){
                this.player.storageList.showClothesList();
                int itemToWear=sc.nextInt();
                int itemToWearIndex=itemToWear-1;
                player.wearAnItemWithPowerAndDefense(itemToWearIndex, "Clothes");
            }
            return;
        }else{
            return;
        }
    }
}

