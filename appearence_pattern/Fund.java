public class Fund{
    Stock st1;
    Stock st2;
    Stock st3;

    public Fund(){
        st1 = new Stock1();
        st2 = new Stock2();
        st3 = new Stock3();
    }

    public void buyFund(){
        st1.buy();
        st2.buy();
        st3.buy();
    }

    public void sellFund(){
        st1.sell();
        st2.sell();
        st3.sell();
    }
}