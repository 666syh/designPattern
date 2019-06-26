package visitor_pattern;
public class Failure extends Action{

    @Override
    public void getMaleConclusion(Male concreteMale) {
        System.out.println("男人失败时，闷头喝酒，谁也不用劝");
    }

    @Override
    public void getFemaleConclusion(Female concreteFemale) {
        System.out.println("女人失败时，眼泪汪汪，谁也劝不动");
    }
    
}