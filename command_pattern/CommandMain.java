package command_pattern;
public class CommandMain{
    public static void main(String[] args) {
        Barbecuer boy = new Barbecuer();
        boy.BakeMutton();
        boy.BakeMutton();
        boy.BakeMutton();

        boy.BakeChicken();
        boy.BakeMutton();
        boy.BakeChicken();
    }
}