package 创建型模式.建造者;

//具体建造者
public class CommonHouse extends HouseBuilder {
    @Override
    public void buildBasic() {
        house.setBaise("5米");
        System.out.println("普通房子打地基5米");
    }

    @Override
    public void buildWalls() {
        house.setWall("10厘米");
        System.out.println("普通房子砌墙10厘米");
    }

    @Override
    public void roofed() {
        house.setRoofed("普通房子屋顶");
        System.out.println("普通房子屋顶");
    }
}
