package Lab_07;

public class RockPaperScissors_main {

    public static void main(String[] args) {
        RockPaperScissors_game game = new RockPaperScissors_game();
        game.game_start();
        while(true) {
            if(!game.game_IsContinue()) {
                break;
            }
        }
    }
}