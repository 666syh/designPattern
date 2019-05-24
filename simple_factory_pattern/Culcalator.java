public class Culcalator{
    public static void main(String args[]){
        Operation op;
        try{
            op = OperationFactory.createOperation("+");
            op.set_numberA(12.4);
            op.set_numberB(23.6);
            System.out.println(op.GetResult());
        }catch(Exception e){
            e.printStackTrace();
        }
        
        return;
    }
}