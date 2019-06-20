package mediator_pattern;
public class MediatorMain{
    public static void main(String[] args) {
        UnitedNations unsc = new SecurityCouncil();
        Country usa = new USA(unsc);
        Country iraq = new Iraq(unsc);

        unsc.setC1(usa);
        unsc.setC2(iraq);
        usa.declare("不许研制核武器,否则发动战争");
        iraq.declare("我们没有核武器，也不怕战争");
    }
}