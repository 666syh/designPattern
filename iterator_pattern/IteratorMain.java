package iterator_pattern;
public class IteratorMain{
    public static void main(String[] args) {
        ConcreteAggregate a = new ConcreteAggregate();
        a.insert( "小A");
        a.insert("小B");
        a.insert("小C");
        a.insert("小D");
        a.insert("小F");
        a.insert("小E");

        IteratorMy i = new ConcreteIterator(a);
        Object item = i.First();
        while(!i.IsDone()){
            System.out.printf("%s，你好\n", (String)i.CurrentItem());
            i.Next();
        }
    }
}