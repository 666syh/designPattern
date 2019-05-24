
public class OperationFactory{
    public static Operation createOperation(String operation){
        Operation op = null;
        if(operation.equals("+")){
            op = new OperationAdd();
        }
        else if(operation.equals("-")){
            op = new OperationSub();
        }
        else if(operation.equals("*")){
            op = new OperationMul();
        }
        else if(operation.equals("/")){
            op = new OperationDiv();
        }
        return op;
    }
}