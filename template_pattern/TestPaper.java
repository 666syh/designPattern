//试卷
public abstract class TestPaper{
    public void TestQuestion1(){
        System.out.println("题目一");
        System.out.println("答案："+Answer1());
    }
    public void TestQuestion2(){
        System.out.println("题目二");
        System.out.println("答案："+Answer2());
    }
    public void TestQuestion3(){
        System.out.println("题目三");
        System.out.println("答案："+Answer3());
    }
    public abstract String Answer1();
    public abstract String Answer2();
    public abstract String Answer3();
}