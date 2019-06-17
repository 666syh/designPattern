package bridge_pattern;

public class HandsetBrandM extends HandsetBrand {
    public void run() {
        System.out.println("运行M品牌");
    }
}

class HandsetBrandMGame extends HandsetBrandM {

    @Override
    public void run() {
        System.out.println("运行M品牌游戏");
    }
    
}
class HandsetBrandMAddressList extends HandsetBrandM {

    @Override
    public void run() {
        System.out.println("运行M品牌手机通讯录");
    }
    
}