package org.example;
import java.util.Stack;

public class SimpleGame{
    Action step;
    Stack<Action> actions;

    public SimpleGame(){
        actions = new Stack<>();
    }
    public void setAction(Action act){
        step = act;
    }
    public void doAction(){
        step.act();
        actions.push(step);
    }
    public void undoAction(){
        actions.pop().undo();
    }
}
