package house_and_builder_nested_builder;

public class House {

    private String foundation;
    private String walls;
    private String roof;
    private String paint;
    private boolean garden;
    private boolean swimmingPool;

    // private constructor
    // House class can access the private fields of the HouseBuilder class directly because
    // HouseBuilder is a nested static class inside the House class
    private House(HouseBuilder builder) {
        this.foundation = builder.foundation;   // Direct access
        this.walls = builder.walls;    // Direct access
        this.roof = builder.roof;    // Direct access
        this.paint = builder.paint;    // Direct access
        this.garden = builder.garden;    // Direct access
        this.swimmingPool = builder.swimmingPool;    // Direct access
    }

    // make getters if needed for house class. do not make setters (not recommended)

    @Override
    public String toString() {
        return "House{" +
                "foundation='" + foundation + '\'' +
                ", walls='" + walls + '\'' +
                ", roof='" + roof + '\'' +
                ", paint='" + paint + '\'' +
                ", garden=" + garden +
                ", swimmingPool=" + swimmingPool +
                '}';
    }


    // public static inner class
    public static class HouseBuilder {
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

        public House build() {
            return new House(this);
        }


    }


}
