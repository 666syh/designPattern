package flyweight_pattern;
public class FlyweightMain{
    public static void main(String[] args) {
        WebSiteFactory f = new WebSiteFactory();
        WebSite fx = f.getWebSiteCategory("产品展示");
        fx.use(new User("小A"));
        WebSite fl = f.getWebSiteCategory("产品展示");
        fl.use(new User("小B"));

        WebSite fy = f.getWebSiteCategory("博客");
        fy.use(new User("小C"));
        WebSite fz = f.getWebSiteCategory("博客");
        fz.use(new User("小D"));
        WebSite ft = f.getWebSiteCategory("博客");
        ft.use(new User("小F"));
        System.out.println("网站分类总数："+f.getWebSiteCount());
    }
}