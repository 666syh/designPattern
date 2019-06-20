package command_pattern;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Waiter{
    //Command command;
    private List<Command> orders = new ArrayList<>();
    public void setOrder(Command command){
        //this.command = command;
        if(command.toString().equals("command_pattern.BakeChickenCommand")){
            System.out.println("服务员：鸡翅没有了，请点别的烧烤");
        }
        else{
            orders.add(command);
            System.out.println("增加订单："+command.toString()+" 时间："+LocalTime.now());
        }
    }
    public void cancelOrder(Command command){
        orders.remove(command);
        System.out.println("取消订单："+command.toString()+" 时间："+LocalTime.now());
    }
    public void Notify(){
        for (Command c : orders) {
            c.ExcuteCommand();
        }
    }
}