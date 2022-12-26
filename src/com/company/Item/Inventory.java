package com.company.Item;
import com.company.Character.Player;
import java.util.ArrayList;

public class Inventory {
    public ArrayList<Item> storage = new ArrayList<Item>();
    public ArrayList<Weapon> weaponStorage= new ArrayList<>();
    public ArrayList<Wearable> clothesStorage= new ArrayList<>();
    Player player;
    public Inventory(Player player){
        this.player=player;
    }

    public void showWeaponList(){
        System.out.println("Stored Item/s: ");
        for(int i=0; i<this.weaponStorage.size(); i++){
            if(this.weaponStorage.get(i).name==this.player.equippedItemName){
                System.out.println(i+1 +". "+ this.weaponStorage.get(i).name+ "( Currently wearing)");
            }else{
                System.out.println(i+1 +". "+ this.weaponStorage.get(i).name);
            }
        }
    }


    public void showClothesList(){
        System.out.println("Stored Item/s: ");
        for(int i=0; i<this.clothesStorage.size(); i++){
            if(this.clothesStorage.get(i).name==this.player.equippedItemName){
                System.out.println(i+1 +". "+ this.clothesStorage.get(i).name+ " ( Currently wearing)");
            }else{
                System.out.println(i+1 +". "+ this.clothesStorage.get(i).name);
            }

        }
    }
}
