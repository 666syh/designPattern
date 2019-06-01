package proxy_pattern;
//封装被代理者对象,通过代理访问被代理者的方法，实现请求
public class Proxy implements GiveGift {
    Pursuit gg;

    public Proxy(SchoolGirl mm) {
        gg = new Pursuit(mm);
    }
    
    @Override
    public void GiveChocolate() {
        gg.GiveChocolate();
    }

    @Override
    public void GiveDolls() {
        gg.GiveDolls();
    }

    @Override
    public void GiveFlowers() {
        gg.GiveFlowers();
    }
    
}