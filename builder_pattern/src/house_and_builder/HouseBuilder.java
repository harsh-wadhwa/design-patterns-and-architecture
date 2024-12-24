package house_and_builder;

public class HouseBuilder {
    private String foundation;
    private String walls;
    private String roof;
    private String paint;
    private boolean garden;
    private boolean swimmingPool;

    public HouseBuilder setFoundation(String foundation) {
        this.foundation = foundation;
        return this;
    }

    public HouseBuilder setWalls(String walls) {
        this.walls = walls;
        return this;
    }

    public HouseBuilder setRoof(String roof) {
        this.roof = roof;
        return this;
    }

    public HouseBuilder setPaint(String paint) {
        this.paint = paint;
        return this;
    }
    public HouseBuilder setGarden(boolean garden) {
        this.garden = garden;
        return this;
    }
    public HouseBuilder setSwimmingPool(boolean swimmingPool) {
        this.swimmingPool = swimmingPool;
        return this;
    }

    public String getFoundation() {
        return foundation;
    }

    public String getWalls() {
        return walls;
    }

    public String getRoof() {
        return roof;
    }

    public String getPaint() {
        return paint;
    }

    public boolean isGarden() {
        return garden;
    }

    public boolean isSwimmingPool() {
        return swimmingPool;
    }

    public House build() {
        return new House(this);
    }


}