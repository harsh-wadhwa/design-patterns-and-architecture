package XmlJsonAdapter;

//New Class (Adapter)
public class JsonAdapter implements DataReader {

    XmlDataReader xmlDataReader;

    // constructor injection : This allows the JsonAdapter to use XmlDataReader without
    // needing to create it internally,
    // which can be helpful for unit testing, decoupling, and dependency management.
    public JsonAdapter(XmlDataReader xmlDataReader) {
        this.xmlDataReader = xmlDataReader;
    }

    // could have another constructor if other old classes need to be supported

    @Override
    public String readData(String filePath) {
        String xmlData = xmlDataReader.readXml(filePath);
        return "{ \"data\": \"" + xmlData + "\" }";
    }

}
