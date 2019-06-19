package command_pattern;
public class Waiter{
    Command command;
    public void setOrder(Command command){
        this.command = command;
    }
    public void Notify(){
        command.ExcuteCommand();
    }
}