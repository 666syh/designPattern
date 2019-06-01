package builder_pattern;

public class PersonThinBuilder extends PersonBuilder {

    @Override
    public void buildArmLeft() {
        System.out.println("绘制瘦人左胳膊");
    }

    @Override
    public void buildArmRight() {
        System.out.println("绘制瘦人右胳膊");
    }

    @Override
    public void buildBody() {
        System.out.println("绘制瘦人身体");
    }

    @Override
    public void buildHead() {
        System.out.println("绘制瘦人头部");
    }

    @Override
    public void buildLegLeft() {
        System.out.println("绘制瘦人左腿");
    }

    @Override
    public void buildLegRight() {
        System.out.println("绘制瘦人右腿");
    }
    
}