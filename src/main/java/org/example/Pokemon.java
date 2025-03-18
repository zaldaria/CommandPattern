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

    public String toString() {
        return "\nPokemon:\nName -- " + name + "\nType -- " + type + "\nHealth -- " + health + "\nDefense -- " + defense + "\nAttack -- " + attack;
    }
}
