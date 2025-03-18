package org.example;

public class CancelAttackCommand implements Action {
    Pokemon p1;
    Pokemon p2;
    public CancelAttackCommand(Pokemon _p1, Pokemon _p2){
        p1 = _p1;
        p2 = _p2;
    }

    public void act() {
        Pokemon.cancelAttack(p1, p2);
    }
    public void undo(){
        Pokemon.attack(p1, p2);
    }
}
