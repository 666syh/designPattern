package chain_pattern;
public class ChainMain{
    public static void main(String[] args) {
        Manager cManager = new CommonManager("Mr.A");
        Manager major = new Majordomo("Mr.B");
        Manager gManager = new GeneralManager("Mr.C");
        //责任链
        cManager.setTupeior(major);
        major.setTupeior(gManager);

        Request r1 = new Request();
        r1.setRequestType("请假");
        r1.setRequestContent("小S请假");
        r1.setNumber(1);
        cManager.RequestApplications(r1);

        Request r2 = new Request();
        r2.setRequestType("请假");
        r2.setRequestContent("小S请假");
        r2.setNumber(4);
        cManager.RequestApplications(r2);

        Request r3 = new Request();
        r3.setRequestType("加薪");
        r3.setRequestContent("小S加薪");
        r3.setNumber(400);
        cManager.RequestApplications(r3);

        Request r4 = new Request();
        r4.setRequestType("加薪");
        r4.setRequestContent("小S加薪");
        r4.setNumber(1000);
        cManager.RequestApplications(r4);
    }
}