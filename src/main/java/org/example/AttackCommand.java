package org.example;

public class AttackCommand implements Action{
    Pokemon p1;
    Pokemon p2;
    public AttackCommand(Pokemon _p1, Pokemon _p2){
        p1 = _p1;
        p2 = _p2;
    }
    @Override
    public void act() {
        Pokemon.attack(p1, p2);
    }
}
