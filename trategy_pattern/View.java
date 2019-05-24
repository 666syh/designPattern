//商场收银软件
public class View{
    private double price;   //单价
    private int num;        //数量
    public double totle;    //总计

    int choice_info = 0;    //模拟选择的打折信息

    //添加打折信息
    private enum account{
        FIVE_ACOUNT,
        EIGHT_ACOUNT,
        NINE_ACOUNT
    }

    //点击ok按钮
    private void btnOK_Click(){
        //double totlePrices = getPrice() * getNum();
        double totlePrices = 0d;
        switch(choice_info){
            case 9:
                totlePrices = getPrice() * 0.9 * getNum();
                break;
            case 8:
                totlePrices = getPrice() * 0.8 * getNum();
                break;
            case 5:
                totlePrices = getPrice() * 0.5 * getNum();
                break;   
        }
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