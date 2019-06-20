package chain_pattern;
public abstract class Manager{
    protected String name;
    protected Manager superior; //上级
    public Manager(String name) {
        this.name = name;
    }
    public void setTupeior(Manager superior){
        this.superior = superior;
    }
    public abstract void RequestApplications(Request r);
}