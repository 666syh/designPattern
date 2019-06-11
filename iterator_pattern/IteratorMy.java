package iterator_pattern;
//迭代器抽象类
public abstract class IteratorMy{
    public abstract Object First();
    public abstract Object Next();
    public abstract boolean IsDone();
    public abstract Object CurrentItem();
}