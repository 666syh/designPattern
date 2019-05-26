public class Prototype_Main{
    public static void main(String[] args) throws CloneNotSupportedException{
        Resume a = new Resume("dn");
        a.setPersonalInfo("male", "20");
        a.setWorkExperience("2015-1018", "xx");

        Resume b = (Resume)a.clone();
        b.setWorkExperience("2014-2017", "yy");

        Resume c = (Resume)b.clone();
        c.setPersonalInfo("male", "21");

        a.disPlay();
        b.disPlay();
        c.disPlay();
    }
}