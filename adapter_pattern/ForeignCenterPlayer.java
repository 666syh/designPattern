package adapter_pattern;
public class ForeignCenterPlayer{
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void 进攻(){
        System.out.printf("外籍中锋 %s 进攻\n", name);
    }
    public void 防守(){
        System.out.printf("外籍中锋 %s 防守\n", name);
    }
}