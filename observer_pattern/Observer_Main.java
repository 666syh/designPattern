package observer_pattern;
public class Observer_Main{
    public static void main(String[] args) {
        Secretary s = new Secretary();

        StockObserver so1 = new StockObserver("cxk", s);
        StockObserver so2 = new StockObserver("zjl", s);

        s.Attach(so1);
        s.Attach(so2);

        s.setAction("老板回来了");
        s.notifyObserver();
    }
}