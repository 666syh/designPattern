package state_pattern;
public class SleepState extends State{

    @Override
    public void writeProgram(Work w) {
        System.out.printf("当前时间：%d时 不行了，睡着了\n", w.getHour());
    }
    
}