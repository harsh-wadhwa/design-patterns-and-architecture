package CoRImplementation;

public class DataValidationHandler extends BaseHandler {

    @Override
    public void handleRequest(String request) {
        if (request.contains("valid")) {
            System.out.println("Data Validation passed");
            forwardToNext(request);
        } else {
            System.out.println("Data validation failed");
        }
    }



}
