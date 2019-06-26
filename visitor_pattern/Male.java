package visitor_pattern;
public class Male extends Person{

    @Override
    public void Accept(Action visitor) {
        visitor.getMaleConclusion(this);
    }

    
}