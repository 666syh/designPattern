abstract class Operation {
    private double _numberA = 0;
    private double _numberB = 0;

    public double get_numberA() {
        return _numberA;
    }

    public void set_numberA(double _numberA) {
        this._numberA = _numberA;
    }

    public double get_numberB() {
        return _numberB;
    }

    public void set_numberB(double _numberB) {
        this._numberB = _numberB;
    }

    public abstract double GetResult();

}

//加法操作
class OperationAdd extends Operation {

    @Override
    public double GetResult() {
        return get_numberA() + get_numberB();
    }
}

//减法操作
class OperationSub extends Operation {

    @Override
    public double GetResult() {
        return get_numberA() - get_numberB();
    }

}

//乘法操作
class OperationMul extends Operation {

    @Override
    public double GetResult() {
        return get_numberA() * get_numberB();
    }

}

//除法操作
class OperationDiv extends Operation{

    @Override
    public double GetResult() {
        if(get_numberB() == 0){
            throw new Exception("除数不能为0!");
        }
        return get_numberA()/get_numberB();
    }
    
}
