package interpreter_pattern;
public class InterpreterMain{
    public static void main(String[] args) {
        PlayContext context = new PlayContext();
        System.out.println("上海滩");
        context.setText("T 500 O 2 E 0.5 G 0.5 A 3 E 0.5 G 0.5 D 3 E 0.5 G 0.5 A 0.5 O 3 C 1 O 2 A 0.5 G 1 C 0.5 E 0.5 D 3 ");
        Expression expression = null;
        try {
            //由于增加扩展对客户端也有影响，因此应把下述代码应用简单工厂模式，并利用反射原理实现解耦
            while(context.getText().length() > 0){
                String str = context.getText().substring(0, 1);
                switch (str) {
                    case "O":
                        expression = new Scale();
                        break;
                    case "T":
                        expression = new Speed();
                        break;
                    case "C":
                    case "D":
                    case "E":
                    case "F":
                    case "G":
                    case "A":
                    case "B":
                        expression = new Note();
                        break;
                    default:
                        break;
                }
                expression.Interpret(context);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}