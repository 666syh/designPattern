package decorator_pattern;
public class Main{
    public static void main(String[] args) {
        Person xc = new Person("xc");   //光着身子的xc
        System.out.println("装饰：");

        TShirt ts = new TShirt();
        BigTrouser bt = new BigTrouser();
        BlueShoe bs = new BlueShoe();

        ts.decorate(xc);    //用TShirt来装饰光着身子的xc（穿着ts的xc）
        bt.decorate(ts);    //用BigTrouser来装饰穿着ts的xc（穿着bt和ts的xc）
        bs.decorate(bt);    //用BlueShoe来装扮穿着bt和ts的xc
        bs.Show();  //调用顺序：bs.show, Finery.show, bt.show, Finery.show, ts.show, Finery.show, xc.show
    }
}