package org.example;

public class Pokemon{
    String name;
    String type;
    int health;
    int defense;
    int attack;
    public Pokemon(){}
    public Pokemon(String _name, String _type, int _health, int _defense, int _attack){
        name = _name;
        type = _type;
        health = _health;
        defense = _defense;
        attack = _attack;
    }
    public static void attack(Pokemon attacker, Pokemon defender){
        defender.health -= attacker.attack;
        System.out.println("\nPokemon " + attacker.name + " attacked " + defender.name + " successfully!");
        System.out.println(defender.name + " health points decreased to " + defender.health);
    }
    public static void cancelAttack(Pokemon attacker, Pokemon defender){
        defender.health += attacker.attack;
        System.out.println("\n" + defender.name + "'s health points restored to " + defender.health);
    }
    public String toString() {
        return "\nPokemon:\nName -- " + name + "\nType -- " + type + "\nHealth -- " + health + "\nDefense -- " + defense + "\nAttack -- " + attack;
    }
}
