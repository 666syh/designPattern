//java的clone父类是java.lang.cloneable
package prototype_pattern;
public class Resume implements Cloneable {
    private String name;
    private String sex;
    private String age;
    //private String timeArea;
    //private String company;
    private WorkExperience work;

    public Resume(String name) {
        this.name = name;
        work = new WorkExperience();
    }

    //添加需要clone的类
    public Resume(WorkExperience work) throws CloneNotSupportedException{
        this.work = (WorkExperience)work.clone();
    }

    public void setPersonalInfo(String sex, String age){
        this.sex = sex;
        this.age = age;
    }

    public void setWorkExperience(String timeArea, String company){
        //this.timeArea = timeArea;
        //this.company = company;
        work.setTimeArea(timeArea);
        work.setCompany(company);
    }

    public void disPlay(){
        System.out.println(name+" "+sex+" "+age);
        //System.out.println(timeArea+" "+company);
        System.out.println(work.getTimeArea()+" "+work.getCompany());
    }
    //强克隆，除了克隆值字段，还要克隆对象字段
    @Override
    protected Object clone() throws CloneNotSupportedException {
        //return (Resume)super.clone();

        Resume obj = new Resume(this.work); //让工作经历完成克隆
        //克隆其他字段
        obj.setName(this.name);
        obj.setPersonalInfo(this.sex, this.age);
        return obj;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}