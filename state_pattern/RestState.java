package state_pattern;
public class RestState extends State{

    @Override
    public void writeProgram(Work w) {
        System.out.printf("当前时间：%d时 下班回家了\n", w.getHour());
    }
    
}