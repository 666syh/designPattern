package chain_pattern;
public class CommonManager extends Manager{

    public CommonManager(String name) {
        super(name);
    }

    @Override
    public void RequestApplications(Request r) {
        if(r.getRequestType().equals("请假") && r.getNumber()<=2){
            System.out.printf("%s:%s 数量 %d 被批准\n", this.name, r.getRequestType(), r.getNumber());
        }
        else{
            if(this.superior!=null){
                this.superior.RequestApplications(r);
            }
        }
    }
    
}