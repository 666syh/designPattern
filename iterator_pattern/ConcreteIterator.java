package iterator_pattern;
public class ConcreteIterator extends IteratorMy{
    
    private int current = 0;
    private ConcreteAggregate aggregate;

    @Override
    public Object First() {
        return aggregate.get(0);
    }

    @Override
    public Object Next() {
        Object ret = null;
        current++;
        if(current<aggregate.count()){
            ret = aggregate.get(current);
        }
        return ret;
    }

    @Override
    public boolean IsDone() {
        return current>=aggregate.count()?true:false;
    }

    @Override
    public Object CurrentItem() {
        return aggregate.get(current);
    }

    public ConcreteIterator(ConcreteAggregate aggregate) {
        this.aggregate = aggregate;
    }

}