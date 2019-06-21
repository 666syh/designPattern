package flyweight_pattern;

import java.util.HashMap;
import java.util.Map;
//享元工厂，用来创建并管理享元对象。它主要是用来确保合理地共享享元类，当用户请求一个享元时，享元工厂对象提供一个已建立的实例或者创建一个（如果不存在的话）
public class WebSiteFactory{
    private Map<String, WebSite> flyweight = new HashMap<>();
    public WebSite getWebSiteCategory(String key){
        if(!flyweight.containsKey(key)){
            flyweight.put(key, new ConcreteWebSite(key));
        }
        return flyweight.get(key);
    }
    public int getWebSiteCount(){
        return flyweight.size();
    }
}