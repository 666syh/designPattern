package visitor_pattern;

import java.util.ArrayList;
import java.util.List;

public class ObjectStructure {
    List<Person> p = new ArrayList<>();
    public void attach(Person ps){
        p.add(ps);
    }
    public void detach(Person ps){
        p.remove(ps);
    }
    public void display(Action a){
        for (Person ps : p) {
            ps.Accept(a);
        }
    }
}