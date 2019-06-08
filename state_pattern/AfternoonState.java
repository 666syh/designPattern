package state_pattern;
public class AfternoonState extends State {

    @Override
    public void writeProgram(Work w) {
        if(w.getHour()<17){
            System.out.printf("当前时间：%d时 下午状态不错，继续努力\n", w.getHour());
        }else{
            w.setState(new EveningState());
        }
    }

}