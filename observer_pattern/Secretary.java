package observer_pattern;

import java.util.ArrayList;
//修改为针对接口编程，减少了耦合
public class Secretary{
    
    private String action;
    //同事列表
    private ArrayList<Observer> observers = new ArrayList<>();

    public void Attach(Observer so){
        observers.add(so);
    }

    public void notifyObserver(){
        for (Observer so : observers) {
            so.updata();
        }
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }
    
}