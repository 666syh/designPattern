package builder_pattern;
public class Builder_Main{
    public static void main(String[] args) {
        PersonBuilder ptb = new PersonThinBuilder();
        PersonDirector pd = new PersonDirector(ptb);
        pd.createPerson();
    }
}