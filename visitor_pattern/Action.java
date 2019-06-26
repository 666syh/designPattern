package visitor_pattern;
public abstract class Action{
    public abstract void getMaleConclusion(Male concreteMale);
    public abstract void getFemaleConclusion(Female concreteFemale);
}