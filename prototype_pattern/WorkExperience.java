//若要实现深克隆，需要将要克隆的对象也实现cloneable接口
public class WorkExperience implements Cloneable {
    private String timeArea;
    private String company;

    public String getTimeArea() {
        return timeArea;
    }

    public void setTimeArea(String timeArea) {
        this.timeArea = timeArea;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    //克隆本对象中的所有字段
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return (WorkExperience)super.clone();
    }

    
}