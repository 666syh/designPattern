package adapter_pattern;
//适配器
public class Translator extends Player {
    private ForeignCenterPlayer cp = new ForeignCenterPlayer();
    public Translator(String name) {
        super(name);
        cp.setName(name);
    }

    @Override
    public void attack() {
        cp.进攻();
    }

    @Override
    public void defense() {
        cp.防守();
    }
    
}