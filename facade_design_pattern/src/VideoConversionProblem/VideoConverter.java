package VideoConversionProblem;


// FACADE CLASS
public class VideoConverter {

    public String convert(String fileName, String format) {
        System.out.println("Starting conversion process ");

        VideoFile file = new VideoFile(fileName);
        String sourceCodec = CodecFactory.extract(file);

        Object destinationCodec;
        if (format.equalsIgnoreCase("mp4")) {
            destinationCodec = new MPEG4CompressionCodec();
        } else {
            destinationCodec = new OggCompressionCodec();
        }

        String buffer = BitrateReader.read(fileName, sourceCodec);
        String intermediateResult = BitrateReader.convert(buffer, destinationCodec);
        String finalResult = new AudioMixer().fix(intermediateResult);

        System.out.println("Conversion completed");
        return finalResult;

    }

}
