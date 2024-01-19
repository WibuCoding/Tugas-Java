package Latihan1;

public class Pemain {
    String Name;
    double Health;
    String Weapon;
    double attack;
    String Armor;
    double defense;
    Pemain(String Name, double Health, String Weapon, double attack, String Armor, double defense) {
        this.Name = Name;
        this.Health = Health;
        this.Weapon = Weapon;
        this.attack = attack;
        this.Armor = Armor;
        this.defense = defense;
    }
    public void displayInfo() {
        System.out.println("Name   : " + Name);
        System.out.println("Health : " + Health + " hp");
        System.out.println("Weapon : " + Weapon + ", attack : " + attack);
        System.out.println("Armor  : " + Armor + ", defense " + defense);
        System.out.println();
    }
    public static void main(String[] args) {
        Pemain player1 = new Pemain("Player1", 100.0, "pedang", 15.0, "diamond chest", 100.0);

        Pemain player2 = new Pemain("Player2", 45.0, "pedang iron", 25.0, "leather chest", 10.0);

        System.out.println("Player 1:");
        player1.displayInfo();

        System.out.println("Player 2:");
        player2.displayInfo();
    }
}

