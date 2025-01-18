package GameTemplateExample;

public class Main {
    public static void main(String[] args) {

        Game soccer = new SoccerGame();
        soccer.playGame();  // This calls the template method

        Game chess = new ChessGame();
        chess.playGame();   // This calls the template method

    }
}