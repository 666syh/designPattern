package state_pattern;
public class EveningState extends State{

    @Override
    public void writeProgram(Work w) {
        if(w.isFinish()){
            w.setState(new RestState());
        }else{
            if(w.getHour()<21){
                System.out.printf("当前时间：%d时 加班中，劳累之极\n", w.getHour());
            }
            else{
                w.setState(new SleepState());
            }
        }
    }
    
}