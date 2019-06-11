package iterator_pattern;

import java.util.ArrayList;
import java.util.List;

public class ConcreteAggregate extends Aggregate{
    private List<Object> items = new ArrayList<>();

    @Override
    public IteratorMy createIterator() {
        return new ConcreteIterator(this);
    }

    public int count(){
        return items.size();
    }
    public void insert(Object o){
        items.add(o);
    }
    public Object get(int index){
        return items.get(index);
    }
    
}