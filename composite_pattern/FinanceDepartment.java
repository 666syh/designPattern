package composite_pattern;
public class FinanceDepartment extends Company{

    public FinanceDepartment(String name) {
        super(name);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void add(Company c) {

    }

    @Override
    public void remove(Company c) {

    }

    @Override
    public void display(int depth) {
        for(int i=0;i<depth;i++){
            System.out.print('-');
        }
        System.out.println(this.name);
    }

    @Override
    public void lineOfDuty() {
        System.out.printf("%d 公司财务收支管理", name);
    }
    
}