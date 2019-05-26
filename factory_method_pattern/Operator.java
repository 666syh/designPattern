public abstract class Operator {
    double numberA;
    double numberB;

    public double getNumberA() {
        return numberA;
    }

    public void setNumberA(double numberA) {
        this.numberA = numberA;
    }

    public double getNumberB() {
        return numberB;
    }

    public void setNumberB(double numberB) {
        this.numberB = numberB;
    }

    public abstract double getResult();
}

class OperatorAdd extends Operator {

    @Override
    public double getResult() {
        return numberA+numberB;
    }
    
}
class OperatorSub extends Operator {

    @Override
    public double getResult() {
        return numberA-numberB;
    }
    
}
class OperatorMul extends Operator {

    @Override
    public double getResult() {
        return numberA*numberB;
    }
    
}
class OperatorDiv extends Operator {

    @Override
    public double getResult() {
        if (numberB!=0){
            return numberA/numberB;
        }
        else{
            throw new Exception("除0异常！");
        }
    }
}