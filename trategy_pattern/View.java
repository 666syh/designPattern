//商场收银软件
public class View{
    private double price;   //单价
    private int num;        //数量
    public double totle;    //总计
    //点击ok按钮
    private void btnOK_Click(){
        double totlePrices = getPrice() * getNum();
        totle += totlePrices;
        System.out.println(getPrice()+"元\t"+getNum()+"个\t总计："+totle+"元");
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}