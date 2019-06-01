package observer_pattern;

public class StockObserver extends Observer {
    public StockObserver(String name, Secretary sub) {
        super(name, sub);
    }

    @Override
    public void updata() {
        System.out.printf("%s,%s关闭股票行情，继续工作\n", sub.getAction(), name);
    }
}