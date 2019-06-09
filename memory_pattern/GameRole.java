package memory_pattern;
public class GameRole{
    private int vit;
    private int atk;
    private int def;

    public void showState(){
        System.out.println("状态显示：");
        System.out.printf("体力：%d\n", vit);
        System.out.printf("攻击力：%d\n", atk);
        System.out.printf("防御力：%d\n", def);
    }
    public void getInitState(){
        vit = 100;
        atk = 100;
        def = 100;
    }
    public void fight(){
        vit = 0;
        atk = 0;
        def = 0;
    }
    public int getVit() {
        return vit;
    }

    public void setVit(int vit) {
        this.vit = vit;
    }

    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }
    
}