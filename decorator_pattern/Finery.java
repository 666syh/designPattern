//装饰器抽象类，中封装一个component（可以是component的具体实现，也可以是其他装饰器）
public class Finery extends Person {
    protected Person component;

    public void decorate(Person component) {
        this.component = component;
    }

    @Override
    public void Show() {
        if(component!=null){
            component.Show();
        }
    }

}

//具体装饰器
class TShirt extends Finery{
    public void Show(){
        System.out.print("TShirt\t");
        super.Show();
    }
}
class BigTrouser extends Finery{
    public void Show(){
        System.out.print("BigTrouser\t");
        super.Show();
    }
}
class RedHat extends Finery{
    public void Show(){
        System.out.print("RedHat\t");
        super.Show();
    }
}
class OverCoat extends Finery{
    public void Show(){
        System.out.print("OverCoat\t");
        super.Show();
    }
}
class Vest extends Finery{
    public void Show(){
        System.out.print("Vest\t");
        super.Show();
    }
}
class BlueShoe extends Finery{
    public void Show(){
        System.out.print("BlueShoe\t");
        super.Show();
    }
}