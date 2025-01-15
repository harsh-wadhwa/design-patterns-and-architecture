package CoRImplementation;

public class AuthenticationHandler extends BaseHandler {

    @Override
    public void handleRequest(String request) {
        if (request.contains("authenticated")) {
            System.out.println("Authentication successful");
            forwardToNext(request);
        } else {
            System.out.println("Authentication failed. Request denied.");
        }
    }



}
