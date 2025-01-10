package XmlJsonAdapter;


// Consider an old system where data is read from XML files,
// and now we need to integrate a new JSON-based system without modifying the client.

public class Runner {
    public static void main(String[] args) {
        // if we have an xml file to read now, but that code is legacy, we use this adapter
        DataReader adapter = new JsonAdapter(new XmlDataReader());

        String jsonData = adapter.readData("example.xml");
        System.out.println(jsonData);

    }
}