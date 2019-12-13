package 结构型模式.组合模式;

/**
 * 组合模式:
 * 1)需要遍历组织机构,或者处理的对象具有树形结构时,非常适合使用组合模式
 * 2)要求较高的抽象性,如果节点和叶子有很多的差异性的话,如:很多属性和方法都不一样
 * 则不适合组合模式
 */
public class Client {
    public static void main(String[] args) {
        //从大到小创建对象 学校
        OrganizationComponent university=new University("清华大学","中国顶级大学");

        //创建学院
        OrganizationComponent computerCollege=new College("计算机学院","计算机学院");
        OrganizationComponent infoEngineercollege=new College("信息工程学院","信息工程学院");

        //创建各个学院下面的系(专业)
        computerCollege.add(new Department("软件工程","软件工程不错"));
        computerCollege.add(new Department("网络工程","网络工程不错"));
        computerCollege.add(new Department("计算机科学与技术","计算机科学与技术是老牌的专业"));

        //
        infoEngineercollege.add(new Department("通信工程","通信工程不好学"));
        infoEngineercollege.add(new Department("信息工程","信息工程好学"));

        university.add(computerCollege);
        university.add(infoEngineercollege);

        university.print();
//        computerCollege.print();
    }
}
