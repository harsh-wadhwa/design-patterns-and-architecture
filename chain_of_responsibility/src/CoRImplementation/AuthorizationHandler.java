package CoRImplementation;

public class AuthorizationHandler extends BaseHandler {

    @Override
    public void handleRequest(String request) {
        if (request.contains("admin")) {
            System.out.println("Authorization successful for admin");
            forwardToNext(request);
        } else {
            System.out.println("Authorization failed, Access restricted");
        }
    }

}
