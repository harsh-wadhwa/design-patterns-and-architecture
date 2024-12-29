package house_and_builder_with_director.house_and_builder;

public class VillaBuilder implements Builder {
    private String foundation;
    private String walls;
    private String roof;
    private String paint;
    private boolean garden;
    private boolean swimmingPool;

    @Override
    public VillaBuilder setFoundation(String foundation) {
        this.foundation = foundation;
        return this;
    }
    @Override
    public VillaBuilder setWalls(String walls) {
        this.walls = walls;
        return this;
    }
    @Override
    public VillaBuilder setRoof(String roof) {
        this.roof = roof;
        return this;
    }
    @Override
    public VillaBuilder setPaint(String paint) {
        this.paint = paint;
        return this;
    }
    @Override
    public VillaBuilder setGarden(boolean garden) {
        this.garden = garden;
        return this;
    }
    @Override
    public VillaBuilder setSwimmingPool(boolean swimmingPool) {
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
    @Override
    public House build() {
        return new House(this);
    }


}