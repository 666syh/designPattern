package observer_pattern;
public class StockObserver{
    private String name;
    private Secretary sub;
    public StockObserver(){
    }
    public StockObserver(String name, Secretary sub){
        this.name = name;
        this.sub = sub;
    }

    public void Update(){
        System.out.printf("%s,%s关闭股票行情，继续工作\n", sub.getAction(), name);
    }
}