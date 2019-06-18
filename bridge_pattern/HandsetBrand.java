package bridge_pattern;
public abstract class HandsetBrand {
    public abstract void run();
    protected HandsetSoft soft;
    public void setHandsetSoft(HandsetSoft soft){
        this.soft = soft;
    }
}