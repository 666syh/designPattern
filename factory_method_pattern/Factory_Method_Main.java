public class Factory_Method_Main{
    public static void main(String[] args) {
        Operator op;
        IFactory f = new AddFactory();
        op = f.createOperator();
        try{
            op.setNumberA(13.5);
            op.setNumberB(24.5);
            System.out.println(op.getResult());
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}