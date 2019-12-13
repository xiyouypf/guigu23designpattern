package 创建型模式.建造者;

//具体建造者
public class HighBuilding extends HouseBuilder {
    @Override
    public void buildBasic() {
        house.setBaise("100米");
        System.out.println("高楼的地基100米");
    }

    @Override
    public void buildWalls() {
        house.setWall("20厘米");
        System.out.println("高楼砌墙20厘米");
    }

    @Override
    public void roofed() {
        house.setRoofed("高楼的透明屋顶");
        System.out.println("高楼的透明屋顶");
    }
}
