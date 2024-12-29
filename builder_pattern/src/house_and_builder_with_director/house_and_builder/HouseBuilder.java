package house_and_builder_with_director.house_and_builder;

public class HouseBuilder implements Builder {
    private String foundation;
    private String walls;
    private String roof;
    private String paint;
    private boolean garden;
    private boolean swimmingPool;

    @Override
    public HouseBuilder setFoundation(String foundation) {
        this.foundation = foundation;
        return this;
    }
    @Override
    public HouseBuilder setWalls(String walls) {
        this.walls = walls;
        return this;
    }
    @Override
    public HouseBuilder setRoof(String roof) {
        this.roof = roof;
        return this;
    }
    @Override
    public HouseBuilder setPaint(String paint) {
        this.paint = paint;
        return this;
    }
    @Override
    public HouseBuilder setGarden(boolean garden) {
        this.garden = garden;
        return this;
    }
    @Override
    public HouseBuilder setSwimmingPool(boolean swimmingPool) {
        this.swimmingPool = swimmingPool;
        return this;
    }
    @Override
    public String getFoundation() {
        return foundation;
    }
    @Override
    public String getWalls() {
        return walls;
    }
    @Override
    public String getRoof() {
        return roof;
    }
    @Override
    public String getPaint() {
        return paint;
    }
    @Override
    public boolean isGarden() {
        return garden;
    }
    @Override
    public boolean isSwimmingPool() {
        return swimmingPool;
    }

    public House build() {
        return new House(this);
    }


}