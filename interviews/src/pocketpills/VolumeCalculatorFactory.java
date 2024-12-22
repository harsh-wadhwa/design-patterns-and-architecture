package pocketpills;

public class VolumeCalculatorFactory {

    public VolumeCalculator getCalculator(String shapeType) {
        switch (shapeType.toLowerCase()) {
            case "cube":
                return new CubeVolumeCalculator();
            case "cuboid":
                return new CuboidVolumeCalculator();
            case "cylinder":
                return new CylinderVolumeCalculator();
            default:
                throw new IllegalArgumentException("Unknown shape type" + shapeType);
        }
    }

}
