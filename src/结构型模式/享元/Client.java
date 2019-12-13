package 结构型模式.享元;

public class Client {
    public static void main(String[] args) {
        //创建一个工厂类
        WebSiteFactory webSiteFactory = new WebSiteFactory();

        //客户要一个以新闻形式发布的网站
        WebSite webSite1 = webSiteFactory.getWebSiteCategory("新闻");
        webSite1.use(new User("tom"));
        //客户要一个以博客形式发布的网站
        WebSite webSite2 = webSiteFactory.getWebSiteCategory("博客");
        webSite2.use(new User("jack"));
        //客户要一个以博客形式发布的网站
        WebSite webSite3 = webSiteFactory.getWebSiteCategory("博客");
        webSite3.use(new User("ypf"));
        //客户要一个以博客形式发布的网站
        WebSite webSite4 = webSiteFactory.getWebSiteCategory("博客");
        webSite4.use(new User("king"));
        //客户要一个以博客形式发布的网站
        WebSite webSite5 = webSiteFactory.getWebSiteCategory("博客");
        webSite5.use(new User("wjs"));

        int webSiteCount = webSiteFactory.getWebSiteCount();
        System.out.println(webSiteCount);
    }
}
