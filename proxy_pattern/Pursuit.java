package proxy_pattern;
//被代理者，不被客户端直接请求，而通过代理者实现客户端请求
public class Pursuit implements GiveGift {
    SchoolGirl mm;

    public Pursuit(SchoolGirl mm) {
        this.mm = mm;
    }

    @Override
    public void GiveChocolate() {
        System.out.println(mm.getName()+" 送你巧克力");
    }

    @Override
    public void GiveDolls() {
        System.out.println(mm.getName()+" 送你洋娃娃");
    }

    @Override
    public void GiveFlowers() {
        System.out.println(mm.getName()+" 送你鲜花");
    }
    
}