package command_pattern;
public class CommandMain{
    public static void main(String[] args) {
        Barbecuer boy = new Barbecuer();
        Command bakeMuttoCommand = new BakeMuttonCommand(boy);
        Command bakeChickeCommand = new BakeChickenCommand(boy);
        Waiter girl = new Waiter();

        girl.setOrder(bakeMuttoCommand);
        girl.Notify();
        girl.setOrder(bakeMuttoCommand);
        girl.Notify();
        girl.setOrder(bakeChickeCommand);
        girl.Notify();
    }
}