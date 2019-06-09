package adapter_pattern;
public class AdapterMain{
    public static void main(String[] args) {
        Player a = new ForwardPlayer("詹姆斯");
        a.attack();
        Player b = new GuardPlayer("库里");
        b.attack();
        Player c = new CenterPlayer("恩比德");
        c.defense();
        Player d = new Translator("姚明");
        d.attack();
    }
    
}