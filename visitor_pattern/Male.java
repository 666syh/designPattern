package visitor_pattern;
public class Male extends Person{

    @Override
    public void getConclusion() {
        switch (action) {
            case "成功":
                System.out.println("男人成功时，背后多半有一个伟大的女人");
                break;
            case "失败":
                System.out.println("男人失败时，闷头喝酒，谁也不用劝");
                break;
            case "恋爱":
                System.out.println("男人恋爱时，凡是不懂也要装懂");
                break;
            
        
            default:
                break;
        }
    }
    
}