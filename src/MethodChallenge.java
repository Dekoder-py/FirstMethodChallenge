public class MethodChallenge {

    public static void main(String[] args) {
//        displayHighScorePosition();
    }

    public static void displayHighScorePosition(String playerName, int highScorePosition){
        System.out.println(playerName + "managed to get into position " + highScorePosition + " on the high score list");
    }

    public static int calculateHighScorePosition(int playerScore){
        if (playerScore >= 1000) {
            return 1;
        } else if (playerScore >= 500) {
            return 2;
        } else if (playerScore >= 100) {
          return 3;
        } else {
            return 4;
        }
    }
}
