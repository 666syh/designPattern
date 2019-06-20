package mediator_pattern;
public class SecurityCouncil extends UnitedNations{
    
    
    @Override
    public void declare(String msg, Country country) {
        if(country == c1){
            c2.getMsg(msg);
        }else{
            c1.getMsg(msg);
        }
    }

    
    
}