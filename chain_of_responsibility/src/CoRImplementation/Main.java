package CoRImplementation;

public class Main {
    public static void main(String[] args) {

        Handler authHandler = new AuthenticationHandler();
        Handler authorizationHandler = new AuthorizationHandler();
        Handler validationHandler = new DataValidationHandler();

        authHandler.setNextHandler(authorizationHandler);
        authorizationHandler.setNextHandler(validationHandler);

        System.out.println("Processing request 1: ");
        authHandler.handleRequest("authenticated valid admin");

        System.out.println("Processing request 2: ");
        authHandler.handleRequest("authenticated invalid user");

    }
}