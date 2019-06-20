package mediator_pattern;
public class USA extends Country{

    public USA(UnitedNations mediator) {
        super(mediator);
    }
    @Override
    public void getMsg(String msg){
        System.out.println("美国得到的消息是 "+msg);
    }
}