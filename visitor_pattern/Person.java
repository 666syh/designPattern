package visitor_pattern;
public abstract class Person{
    public abstract void Accept(Action visitor);
}