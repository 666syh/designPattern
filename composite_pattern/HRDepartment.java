package composite_pattern;
//叶子节点
public class HRDepartment extends Company{

    public HRDepartment(String name) {
        super(name);
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
        System.out.printf("%d 员工招聘培训管理", name);
    }
    
}