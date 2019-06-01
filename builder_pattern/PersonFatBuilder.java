package builder_pattern;

public class PersonFatBuilder extends PersonBuilder {

    @Override
    public void buildArmLeft() {
        System.out.println("绘制畔人左胳膊");
    }

    @Override
    public void buildArmRight() {
        System.out.println("绘制畔人右胳膊");
    }

    @Override
    public void buildBody() {
        System.out.println("绘制畔人身体");
    }

    @Override
    public void buildHead() {
        System.out.println("绘制畔人头部");
    }

    @Override
    public void buildLegLeft() {
        System.out.println("绘制畔人左腿");
    }

    @Override
    public void buildLegRight() {
        System.out.println("绘制畔人右腿");
    }
    
}