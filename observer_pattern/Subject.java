package observer_pattern;

import java.util.ArrayList;

public abstract class Subject {
    protected String action;
    //同事列表
    protected ArrayList<Observer> observers = new ArrayList<>();

    public abstract void attach(Observer o);
    public abstract void detch(Observer o);
    public abstract void notifyObserver();

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }
    
    
}