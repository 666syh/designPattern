package visitor_pattern;
public class Female extends Person{

    @Override
    public void Accept(Action visitor) {
        visitor.getFemaleConclusion(this);
    }


}