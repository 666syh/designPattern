package state_pattern;
public class Work{
    private int hour;
    private boolean finish;

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public boolean isFinish() {
        return finish;
    }

    public void setFinish(boolean finish) {
        this.finish = finish;
    }
    public void writeProgram(){
        if(hour<12){
            System.out.printf("当前时间：%d 点 上午工作，精神百倍\n", hour);
        }
        else if(hour<13){
            System.out.printf("当前时间：%d 点 中午午睡，吃饭\n", hour);
        }
        else if(hour<17){
            System.out.printf("当前时间：%d 点 下午状态不错，继续努力\n", hour);
        }
        else{
            if(finish){
                System.out.printf("当前时间：%d 点 下班回家了\n", hour);
            }
            else{
                if(hour<21){
                    System.out.printf("当前时间：%d 点 加班，劳累之极\n", hour);
                }else{
                    System.out.printf("当前时间：%d 点 不行了，睡着了\n", hour);
                }
            }
        }
    }
}