package appearence_pattern;
public abstract class Stock{
    public abstract void sell();
    public abstract void buy();
}

class Stock1 extends Stock{
    public void sell(){
        System.out.println("股票一卖出");
    }
    public void buy(){
        System.out.println("股票一买入");
    }
}
class Stock2 extends Stock{
    public void sell(){
        System.out.println("股票二卖出");
    }
    public void buy(){
        System.out.println("股票二买入");
    }
}
class Stock3 extends Stock{
    public void sell(){
        System.out.println("股票三卖出");
    }
    public void buy(){
        System.out.println("股票三买入");
    }
}