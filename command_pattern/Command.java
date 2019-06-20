package command_pattern;

public abstract class Command {
    protected Barbecuer receiver;

    public Command(Barbecuer receiver) {
        this.receiver = receiver;
    }

    // 执行命令
    public abstract void ExcuteCommand();

    @Override
    public String toString() {
        return getClass().getName();
    }
}

class BakeMuttonCommand extends Command {

    public BakeMuttonCommand(Barbecuer receiver) {
        super(receiver);
    }

    @Override
    public void ExcuteCommand() {
        receiver.BakeMutton();
    }
    
}

class BakeChickenCommand extends Command{

    public BakeChickenCommand(Barbecuer receiver) {
        super(receiver);
    }

    @Override
    public void ExcuteCommand() {
        receiver.BakeChicken();
    }
    
}