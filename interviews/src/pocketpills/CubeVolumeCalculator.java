package pocketpills;

public class CubeVolumeCalculator implements VolumeCalculator {

    @Override
    public double calculateVolume(double[] dimensions) {
        if (dimensions.length != 1) {
            throw new IllegalArgumentException("Cube required 1 dimension");
        }
        return Math.pow(dimensions[0],3);
    }

}
