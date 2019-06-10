package composite_pattern;

public class CompositeMain{
    public static void main(String[] args) {
        ConcreteCompany root = new ConcreteCompany("北京总公司");
        root.add(new HRDepartment("总公司人力资源部"));
        root.add(new FinanceDepartment("总公司财务部"));

        ConcreteCompany comp1 = new ConcreteCompany("上海分公司");
        comp1.add(new HRDepartment("上海分公司人力资源部"));
        comp1.add(new FinanceDepartment("上海分公司财务部"));
        root.add(comp1);

        ConcreteCompany comp2 = new ConcreteCompany("南京分公司");
        comp2.add(new HRDepartment("南京分公司人力资源部"));
        comp2.add(new FinanceDepartment("南京分公司财务部"));
        root.add(comp2);

        ConcreteCompany comp3 = new ConcreteCompany("杭州分公司");
        comp3.add(new HRDepartment("杭州分公司人力资源部"));
        comp3.add(new FinanceDepartment("杭州分公司财务部"));
        root.add(comp3);

        root.display(1);
    }
}