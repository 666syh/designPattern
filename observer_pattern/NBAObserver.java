package observer_pattern;
public class NBAObserver extends Observer {
    public NBAObserver(String name, Subject sub){
        super(name, sub);
    }
    @Override
    public void updata() {
        System.out.printf("%s,%s关闭nba直播，继续工作\n", sub.getAction(), name);
    }
    
}