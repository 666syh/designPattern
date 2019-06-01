package template_pattern;
public class Template_Main{
    public static void main(String[] args) {
        System.out.println("学生A答案：");
        TestPaper tA = new TestPaperA();
        tA.TestQuestion1();
        tA.TestQuestion2();
        tA.TestQuestion3();

        System.out.println("\n学生B答案：");
        TestPaper tB = new TestPaperB();
        tB.TestQuestion1();
        tB.TestQuestion2();
        tB.TestQuestion3();
    }
}