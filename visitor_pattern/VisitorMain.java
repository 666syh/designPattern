package visitor_pattern;


public class VisitorMain {
    public static void main(String[] args) {
        ObjectStructure o = new ObjectStructure();
        o.attach(new Male());
        o.attach(new Female());
        Action s = new Success();
        o.display(s);
        Action f = new Failure();
        o.display(f);
        
    }
}