package observer_pattern;

import java.util.ArrayList;

public class Secretary{
    
    private String action;
    //同事列表
    private ArrayList<StockObserver> observers = new ArrayList<>();

    public void Attach(StockObserver so){
        observers.add(so);
    }

    public void notifyObserver(){
        for (StockObserver so : observers) {
            so.Update();
        }
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }
    
}