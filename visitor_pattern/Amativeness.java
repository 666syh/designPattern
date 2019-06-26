package visitor_pattern;
public class Amativeness extends Action{

    @Override
    public void getMaleConclusion(Male concreteMale) {
        System.out.println("男人恋爱时，凡事不懂也要装懂");
    }

    @Override
    public void getFemaleConclusion(Female concreteFemale) {
        System.out.println("女人恋爱时，遇事懂也装作不懂");
    }
    
}