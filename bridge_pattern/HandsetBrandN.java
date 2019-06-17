package bridge_pattern;
public class HandsetBrandN extends HandsetBrand {
    public void run(){
        System.out.println("运行N品牌");
    }
}
class HandsetBrandNGame extends HandsetBrandN {

    @Override
    public void run() {
        System.out.println("运行N品牌游戏");
    }
    
}
class HandsetBrandNAddressList extends HandsetBrandN {

    @Override
    public void run() {
        System.out.println("运行N品牌手机通讯录");
    }
    
}