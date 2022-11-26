// Nama : Andika Kavin Septiano
// NIM  : M0521011

import java.util.ArrayList;
import java.util.HashMap;


// ==> Definisikan setiap class sesuai urutan di bawah ini

// IInfusable
interface IInfusable {
  public abstract void infuse(String element);
}

// Item
abstract class Item {
  String name;
}

// Weapon
abstract class Weapon extends Item {
  public int damage;

  public void normalAttack() {
    System.out.println("Player deals "+ this.damage +" damage using "+this.name);
  };

  public abstract void specialMove();
}


// Sword
class Sword extends Weapon implements IInfusable {

  Sword(String name, int damage) {
    this.name = name;
    this.damage = damage;
  }
  
  @Override
  public void infuse(String element) {
    System.out.println(this.name+ " is infused with " + element + ", enhancing its thrust!!");
  }

  @Override
  public void specialMove() {
    System.out.println("Player performs a Forward Thrust with their Sword!");
  }
  
}

// Axe
class Axe extends Weapon implements IInfusable {

  Axe(String name, int damage) {
    this.name = name;
    this.damage = damage;
  }

  @Override
  public void infuse(String element) {
    System.out.println(this.name+ " is infused with " + element + ", enhancing its power!");
  }

  @Override
  public void specialMove() {
    System.out.println("Player performs a Jump Charge with their Axe!");
  }
  
}

// Bow
class Bow extends Weapon {

  Bow(String name, int damage) {
    this.name = name;
    this.damage = damage;
  }

  @Override
  public void specialMove() {
    System.out.println("Player is now in Focus state!");
    
  }

  public void reload() {
    System.out.println("Player reloads the bow");
  }
}

// Consumable
class Consumable extends Item {

  public int recoverHelth;

  public Consumable(String name, int recoverHelth) {
    this.name = name;
    this.recoverHelth = recoverHelth;
  }

  public void consume() {
    System.out.println("Player consumes "+ this.name +" and restored "+ this.recoverHelth +" HealthPoint");
  }
}

// !! Tidak perlu memodifikasi code di bawah ini !!
public class PPBO_09_Latihan1 {
    public static void main(String[] args) {
        var inventory = generateInventory();

        inventory.forEach((key, value)->{
            if(key == "Weapons"){
                value.forEach((item)->{
                    System.out.println(">>>>>>>>>>");

                    Weapon weapon = (Weapon) item;
                    weapon.normalAttack();
                    if(weapon instanceof Sword){
                        Sword sword = (Sword) weapon;
                        sword.specialMove();
                        sword.infuse("Crystal");
                    }
                    else if(weapon instanceof Axe){
                        Axe axe = (Axe) weapon;
                        axe.specialMove();
                        axe.infuse("Ember");
                    }
                    else if(weapon instanceof Bow){
                        Bow bow = (Bow) weapon;
                        bow.specialMove();
                        bow.reload();
                    }
                    
                    System.out.println("<<<<<<<<<<");
                });
            }
            else if(key == "Consumables"){
                value.forEach((item)->{
                    System.out.println(">>>>>>>>>>");

                    Consumable consumable = (Consumable) item;
                    consumable.consume();

                    System.out.println("<<<<<<<<<<");
                });
            }
        });
    }


    static HashMap<String, ArrayList<Item>> generateInventory(){
        ArrayList<Item> weapons = new ArrayList<Item>();
        weapons.add(new Sword("Lothric Knight Sword", 100));
        weapons.add(new Axe("Dragon King Greataxe", 150));
        weapons.add(new Bow("Darkmoon Longbow", 80));

        ArrayList<Item> consumables = new ArrayList<Item>();
        consumables.add(new Consumable("Sweet Madame", 50));
        consumables.add(new Consumable("Teyvat Egg", 15));

        HashMap<String, ArrayList<Item>> inventory = new HashMap<String, ArrayList<Item>>(); 
        inventory.put("Weapons", weapons);
        inventory.put("Consumables", consumables);

        return inventory;
    }
}

/*
Output yang diharapkan:

>>>>>>>>>>
Player consumes Sweet Madame and restored 50 HealthPoint
<<<<<<<<<<
>>>>>>>>>>
Player consumes Teyvat Egg and restored 15 HealthPoint
<<<<<<<<<<
>>>>>>>>>>
Player deals 100 damage using Lothric Knight Sword
Player performs a Forward Thrust with their Sword!
Lothric Knight Sword is infused with Crystal, enhancing its thrust!
<<<<<<<<<<
>>>>>>>>>>
Player deals 150 damage using Dragon King Greataxe
Player performs a Jump Charge with their Axe!
Dragon King Greataxe is infused with Ember, enhancing its power!
<<<<<<<<<<
>>>>>>>>>>
Player deals 80 damage using Darkmoon Longbow
Player is now in Focus state!
Player reloads the bow
<<<<<<<<<<

 */