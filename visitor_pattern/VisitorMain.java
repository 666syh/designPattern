package visitor_pattern;

import java.util.ArrayList;
import java.util.List;

public class VisitorMain {
    public static void main(String[] args) {
        List<Person> p = new ArrayList<>();
        Person man1 = new Male();
        man1.setAction("成功");
        p.add(man1);
        Person woman1 = new Female();
        woman1.setAction("成功");
        p.add(woman1);
        Person man2 = new Male();
        man2.setAction("失败");
        p.add(man2);
        Person woman2 = new Female();
        woman2.setAction("失败");
        p.add(woman2);
        for (Person person : p) {
            person.getConclusion();
        }
    }
}