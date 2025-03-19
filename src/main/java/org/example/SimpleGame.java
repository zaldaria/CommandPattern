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
        if (!actions.empty()) {
            actions.pop().undo();
        }
        else
            System.out.println("There no actions to cancel!");
    }
}
