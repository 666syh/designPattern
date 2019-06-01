package observer_pattern;
public class Observer_Main{
    public static void main(String[] args) {
        Secretary s = new Secretary();

        Observer so1 = new StockObserver("cxk", s);
        Observer so2 = new NBAObserver("zjl", s);

        s.Attach(so1);
        s.Attach(so2);

        s.setAction("老板回来了");
        s.notifyObserver();
    }
}