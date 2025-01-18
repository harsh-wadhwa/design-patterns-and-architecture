package GameTemplateExample;

public abstract class Game {

    public final void playGame() {
        initiate();
        choosePlayer();
        start();
        end();
    }

    public void initiate() {
        System.out.println("Initializing the game environment...");
    }

    public abstract void choosePlayer();

    public void start() {
        System.out.println("Starting the game...");
    }

    public void end() {
        System.out.println("Ending the game...");
    }

}
