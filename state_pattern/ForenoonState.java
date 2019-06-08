//上午工作状态
package state_pattern;
public class ForenoonState extends State{

    @Override
    public void writeProgram(Work w) {
        if(w.getHour()<12){
            System.out.printf("当前时间：%d时 上午工作，精神百倍\n", w.getHour());
        }else{
            w.setState(new NoonState());
        }
    }

}