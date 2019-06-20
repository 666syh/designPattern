package mediator_pattern;
public abstract class UnitedNations{
    protected Country c1;
    protected Country c2;
    public abstract void declare(String msg, Country country);
    public Country getC1() {
        return c1;
    }

    public void setC1(Country c1) {
        this.c1 = c1;
    }

    public Country getC2() {
        return c2;
    }

    public void setC2(Country c2) {
        this.c2 = c2;
    }
}