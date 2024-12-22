package pocketpills;

public class CuboidVolumeCalculator implements VolumeCalculator {

    @Override
    public double calculateVolume(double[] dimensions) {
        if (dimensions.length != 3) {
            throw new IllegalArgumentException("Cuboid requires 3 dimensions.");
        };
        return dimensions[0] * dimensions[1] * dimensions[2];
    }

}
