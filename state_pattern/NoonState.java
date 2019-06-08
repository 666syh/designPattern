package state_pattern;
public class NoonState extends State{

    @Override
    public void writeProgram(Work w) {
        if(w.getHour()<13){
            System.out.printf("当前时间：%d时 中午午睡，困\n", w.getHour());
        }else{
            w.setState(new AfternoonState());
        }
    }

}