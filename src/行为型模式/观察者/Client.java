package 行为型模式.观察者;

import java.util.Observer;

/**
 * 观察者模式:
 * 1)以集合的方式来管理用户,包括注册,移除和通知
 * 2)我们增加观察者,就不需要修改核心类WeaterData的代码,遵守了OCP原则
 */
public class Client {
    public static void main(String[] args) {
        WeaterData weaterData = new WeaterData();

        //创建观察者
        CurrentCondition currentCondition = new CurrentCondition();
        BaiduSite baiduSite = new BaiduSite();

        //注册到weatherData中
        weaterData.registerObserver(currentCondition);
        weaterData.registerObserver(baiduSite);

        weaterData.setData(12,12,12);
        //源码Observer中
    }
}
