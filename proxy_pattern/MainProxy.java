package proxy_pattern;
public class MainProxy{
    public static void main(String[] args) {
        SchoolGirl jj = new SchoolGirl();
        jj.setName("jj");
        //通过代理对象访问
        Proxy p = new Proxy(jj);
        p.GiveChocolate();
        p.GiveDolls();
        p.GiveFlowers();
    }
}