package flyweight_pattern;
//是所有具体享元类的超类或接口，通过这个接口，享元可以接受并作用于外部状态
public abstract class WebSite{
    protected String name = "";

    public WebSite(String name) {
        this.name = name;
    }
    public abstract void use(User user);
}