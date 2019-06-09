package adapter_pattern;
//前锋
public class ForwardPlayer extends Player{

    public ForwardPlayer(String name) {
        super(name);
    }

    @Override
    public void attack() {
        System.out.printf("前锋 %s 进攻\n", name);
    }

    @Override
    public void defense() {
        System.out.printf("前锋 %s 防守\n", name);
    }
    
}