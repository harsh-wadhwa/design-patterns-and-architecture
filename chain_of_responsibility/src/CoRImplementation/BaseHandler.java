package CoRImplementation;

abstract class BaseHandler implements Handler {

    private Handler nextHandler;

    @Override
    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    protected void forwardToNext(String request) {
        if (nextHandler != null) {
            nextHandler.handleRequest(request);
        }
    }



}
