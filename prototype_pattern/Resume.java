//java的clone父类是java.lang.cloneable

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
    //拷贝对象直接使用父类的clone()方法
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return (Resume)super.clone();
    }


}