package flyweight_pattern;
//具体享元类是继承享元超类或实现享元接口，并为内部状态增加存储空间
public class ConcreteWebSite extends WebSite{

	public ConcreteWebSite(String name) {
		super(name);
	}

	@Override
	public void use(User user) {
		System.out.println("网站分类："+name+"用户："+user.getName());
	}
    
}