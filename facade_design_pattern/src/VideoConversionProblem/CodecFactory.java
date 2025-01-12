package VideoConversionProblem;

public class CodecFactory {

    public static String extract(VideoFile file) {
        System.out.println("Extracting codec for " + file.getName());
        return "sourceCodec";
    }

}
