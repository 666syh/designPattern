package mediator_pattern;
public abstract class Country{
    protected UnitedNations mediator;

    public Country(UnitedNations mediator) {
        this.mediator = mediator;
    }
    public void declare(String msg){
        mediator.declare(msg, this);
    }
    public abstract void getMsg(String msg);
}