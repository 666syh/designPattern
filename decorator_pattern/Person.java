package decorator_pattern;
//component， 用于被装饰器装饰，装饰器也是component，所以装饰器可以装饰装饰器
//这里的component实际上是具体的component与抽象类component的结合
public class Person{
    public Person(){
        this.name = "default";
    }
    private String name;
    public Person (String name){
        this.name = name;
    }
    public void Show(){
        System.out.println("装扮的"+this.name);
    }
}

