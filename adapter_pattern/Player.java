package adapter_pattern;
//运动员接口
public abstract class Player{
    String name;
    public Player(String name){
        this.name = name;
    }
    public abstract void attack();
    public abstract void defense();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}