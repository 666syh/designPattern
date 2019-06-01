package observer_pattern;

import java.util.ArrayList;
//修改为针对接口编程，减少了耦合
public class Secretary extends Subject{

    public void Attach(Observer so){
        observers.add(so);
    }

    public void notifyObserver(){
        for (Observer so : observers) {
            so.updata();
        }
    }

    @Override
    public void attach(Observer o) {
        observers.add(o);
    }

    @Override
    public void detch(Observer o) {
        observers.remove(o);
    }
    
}