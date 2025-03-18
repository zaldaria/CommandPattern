package org.example;

public class SimpleGame{
    Action step;
    public SimpleGame(){}
    public void setAction(Action act){
        step = act;
    }
    public void doAction(){
        step.act();
    }
}
