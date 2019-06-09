package adapter_pattern;
//中锋
public class CenterPlayer extends Player{

    public CenterPlayer(String name) {
        super(name);
        
    }

    @Override
    public void attack() {
        System.out.printf("中锋 %s 进攻\n", name);
    }

    @Override
    public void defense() {
        System.out.printf("中锋 %s 防守\n", name);
    }
    
}