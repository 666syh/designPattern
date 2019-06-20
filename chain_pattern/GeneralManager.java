package chain_pattern;
public class GeneralManager extends Manager{

    public GeneralManager(String name) {
        super(name);
    }

    @Override
    public void RequestApplications(Request r) {
        if(r.getRequestType().equals("请假")){
            System.out.printf("%s:%s 数量 %d 被批准\n", this.name, r.getRequestContent(), r.getNumber());
        }
        else if(r.getRequestType().equals("加薪") && r.getNumber()<=500){
            System.out.printf("%s:%s 数量 %d 被批准\n", this.name, r.getRequestContent(), r.getNumber());
        }
        else{
             System.out.printf("%s:%s 数量 %d 再说吧\n", this.name, r.getRequestContent(), r.getNumber());
        }
 
    }
    
}