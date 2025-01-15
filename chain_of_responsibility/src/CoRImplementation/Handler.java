package CoRImplementation;

public interface Handler {

    void setNextHandler(Handler nextHandler);
    void handleRequest(String request);

}
