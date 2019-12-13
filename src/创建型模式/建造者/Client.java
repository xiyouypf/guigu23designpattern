package 创建型模式.建造者;

/**
 * 建造者模式的注意事项和细节
 * 1).客户端(使用程序)不需要知道产品内部组成细节,将产品本身和产品的创建过程
 * 解耦,使得相同的创建过程可以创建不同的产品对象
 * 2).每一个具体建造者都相对独立,因此很方便的替换或者增加具体建造者,
 * 用户使用不同的具体建造者即可得到不同的产品对象
 * 3).可以更加精细地控制产品的创建过程.将复杂的产品创造步骤分解到不同的方法中,
 * 使得创建过程更加清晰,也更方便使用程序来控制创建过程
 * 4).增加新的具体的建造者无需修改原有类库的代码,指挥者类针对抽象建造者类编程,
 * 系统扩展方便,符合"开闭原则"
 * 5).建造者模式创建的产品一般具有很大的共性,其组成部分相似,如果产品之间的差异
 * 性很大,则不适合使用建造者模式
 *
 * 抽象工厂模式VS建造者模式
 * 1)抽象工厂模式实现对产品家族的创建,一个产品家族是这样的一系列产品:具有不同分类
 * 维度的产品组合
 * 2)建造者模式是要求按照指定的蓝图建造产品,它的主要目的是通过组装零件而生产一个新产品
 *
 */
public class Client {
    public static void main(String[] args) {
        //盖普通房子
        CommonHouse commonHouse=new CommonHouse();
        //准备创建房子的指挥者
        HouseDirector houseDirector=new HouseDirector(commonHouse);
        //完成盖的房子,返回产品(房子)
        House house = houseDirector.constructHouse();
        System.out.println(house);

        //System.out.println("输出流程");
        System.out.println("----------------");

        //盖高楼
        HighBuilding highBuilding=new HighBuilding();
        //重置建造者
        houseDirector.setHouseBuilder(highBuilding);
        //完成盖房子,返回产品(高楼)
        House house1 = houseDirector.constructHouse();
        System.out.println(house1);

        /**
         * 1.Appendable 接口定义了多个append方法(抽象方法),即Appendable 为抽象
         * 建造者,定义了抽象方法
         * 2.AbstractStringBuilder 实现了 Appendable 接口方法,这里的AbstractStringBuilder
         * 已经是建造者,只是不能实例化
         * 3.StringBuilder 既充当了指挥者角色,同时充当了具体的建造者,构造方法的实现
         * 是由AbstractStringBuilder 完成,而StringBuilder 继承了 AbstractStringBuilder
         */
        StringBuilder stringBuilder = new StringBuilder("Hello World");
    }


}
