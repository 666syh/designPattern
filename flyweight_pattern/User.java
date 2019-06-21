package flyweight_pattern;
//外部状态
public class User{
    private String name;

    public User(String name) {
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
}