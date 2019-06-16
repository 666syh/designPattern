package singleton_pattern;
public class SingletonMain{
    public static void main(String[] args) {
        Singleton s1 = Singleton.GetInstance();
        Singleton s2 = Singleton.GetInstance();
        if(s1 == s2){
            System.out.println("两个对象是相同的实例");
        }else{
            System.out.println("两个对象不是相同的实例");
        }
    }
}