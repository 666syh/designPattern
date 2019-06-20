package mediator_pattern;
public class Iraq extends Country{

    public Iraq(UnitedNations mediator) {
        super(mediator);
    }

    @Override
    public void getMsg(String msg) {
        System.out.println("伊拉克得到的消息是 "+msg);
    }
    
}