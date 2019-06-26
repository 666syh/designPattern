package visitor_pattern;

public class Success extends Action{

    @Override
    public void getMaleConclusion(Male concreteMale) {
        System.out.println("男人成功时，背后多半有一个伟大的女人");
    }

    @Override
    public void getFemaleConclusion(Female concreteFemale) {
        System.out.println("女人成功时，背后大多有一个不成功的男人");
    }
    
}