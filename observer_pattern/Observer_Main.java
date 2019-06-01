package observer_pattern;
public class Observer_Main{
    public static void main(String[] args) {
        Subject s = new Secretary();

        Observer so1 = new StockObserver("cxk", s);
        Observer so2 = new NBAObserver("zjl", s);

        s.attach(so1);
        s.attach(so2);

        s.setAction("老板回来了");
        s.notifyObserver();
    }
}