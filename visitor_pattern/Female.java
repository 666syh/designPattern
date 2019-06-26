package visitor_pattern;
public class Female extends Person{

    @Override
    public void getConclusion() {
        switch (action) {
            case "成功":
                System.out.println("女人成功时，背后大多有一个不成功的男人");
                break;
            case "失败":
                System.out.println("女人失败时，眼泪汪汪，谁也劝不动");
                break;
            case "恋爱":
                System.out.println("女人恋爱时，遇事懂也装作不懂");
                break;
                
        
            default:
                break;
        }
    }


}