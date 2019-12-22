package methods;

public class Methods {

    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was :" + highScore);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);

        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("George", highScorePosition);
        highScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("Jonh", highScorePosition);
        highScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("Ken", highScorePosition);
        highScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("Mark", highScorePosition);
        highScorePosition = calculateHighScorePosition(1000);
        displayHighScorePosition("Dim", highScorePosition);
        highScorePosition = calculateHighScorePosition(500);
        displayHighScorePosition("Frank", highScorePosition);
        highScorePosition = calculateHighScorePosition(100);
        displayHighScorePosition("Carol", highScorePosition);

    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore;
        }

        return -1; // < --- indicate error , invalid value , value not found.
    }

    public static void displayHighScorePosition(String playerName, int highScorePosition) {
        System.out.println(playerName + " managed to get into position " + highScorePosition + " on the high score table");

    }

    public static int calculateHighScorePosition(int score) {

        //example 1
//        if (score >= 1000) {
//            return 1;
//        } else if (score >= 500) {
//            return 2;
//        } else if (score >= 100) {
//            return 3;
//        }
//        return 4;

        //example 2
        
        int position = 4; //assuming position 4 will return 

        if (score >= 1000) {
            position = 1;
        } else if (score >= 500) {
            position = 2;
        } else if (score >= 100) {
            position = 3;
        }
        return position;
    }

}
