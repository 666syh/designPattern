package factory_method_pattern;
import java.lang.Exception;

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

    public abstract double getResult() throws Exception;
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
    public double getResult() throws Exception {
            return numberA/numberB;
    }
}