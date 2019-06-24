package interpreter_pattern;
public abstract class Expression{
    public void Interpret(PlayContext context){
        if(context.getText().length()==0){
            return;
        }
        else{
            String playHead = context.getText().substring(0, 1);
            context.setText(context.getText().substring(2));
            double playValue = Double.valueOf(context.getText().substring(0, context.getText().indexOf(" ")));
            context.setText(context.getText().substring(context.getText().indexOf(" ")+1));
            excute(playHead, playValue);
        }
    }
    public abstract void excute(String key, double value);
}