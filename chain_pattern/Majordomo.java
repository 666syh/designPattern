package chain_pattern;
public class Majordomo extends Manager{

    public Majordomo(String name) {
        super(name);
    }

    @Override
    public void RequestApplications(Request r) {
        if(r.getRequestType().equals("请假") && r.getNumber()<=5){
            System.out.printf("%s:%s 数量 %d 被批准\n", this.name, r.getRequestType(), r.getNumber());
        }else{
            if(this.superior!=null){
                this.superior.RequestApplications(r);
            }
        }

    }
    
}