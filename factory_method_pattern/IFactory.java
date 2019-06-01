package factory_method_pattern;
//工厂接口
public interface IFactory {
    Operator createOperator();
}
//加法工厂
class AddFactory implements IFactory {

    @Override
    public Operator createOperator() {
        return new OperatorAdd();
    }
    
}
//减法工厂
class SubFactory implements IFactory {

    @Override
    public Operator createOperator() {
        return new OperatorSub();
    }
    
}
//乘法工厂
class MulFactory implements IFactory {

    @Override
    public Operator createOperator() {
        return new OperatorMul();
    }
    
}
//除法工厂
class DivFactory implements IFactory {

    @Override
    public Operator createOperator() {
        return new OperatorDiv();
    }
    
}