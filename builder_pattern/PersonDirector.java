package builder_pattern;
//指挥类，用来控制建造过程，也用来隔离用户与建造的关系
//目的：根据用户的选择来一步一步建造小人，而建造过程在指挥者这里完成了，用户就不需要知道，而且这个过程的每一步是一定要做的
public class PersonDirector{
    private PersonBuilder pd;
    public PersonDirector(PersonBuilder pBuilder){
        this.pd = pBuilder;
    }
    public void createPerson(){
        pd.buildHead();
        pd.buildBody();
        pd.buildArmLeft();
        pd.buildArmRight();
        pd.buildLegLeft();
        pd.buildLegRight();
    }
}