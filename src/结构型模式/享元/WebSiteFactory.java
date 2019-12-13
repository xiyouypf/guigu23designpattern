package 结构型模式.享元;

import java.util.HashMap;
import java.util.Map;

//网站工厂类
public class WebSiteFactory {
    //集合,充当池的作用
    private Map<String,WebSite> pool=new HashMap<>();

    //根据网站的类型,返回一个网站,如果没有就创建一个,并放入池中,并返回
    public WebSite getWebSiteCategory(String type){
        if(!pool.containsKey(type)){
            pool.put(type,new ConcreteWebSite(type));
        }
        return pool.get(type);
    }

    //获取网站分类的总数(池中有多少个网站类型)
    public int getWebSiteCount(){
        return pool.size();
    }
}
