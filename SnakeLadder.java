import java.util.Random;

public class SnakeLadder {
    static final int LADDER = 1;
    static final int SNAKE = 2;

    public static void main(String[] args) {
        System.out.println("Welcome to the Snake and Ladder Game");

        int playerposition = 0;
        Random random = new Random();
        while (playerposition < 100) {

            int dieNum = random.nextInt(6) + 1;
            int options = random.nextInt(3);
            {
                switch (options) {
                    case LADDER:
                        if (playerposition + dieNum > 100)
                            break;
                        playerposition += dieNum;
                        break;

                    case SNAKE:
                        playerposition -= dieNum;
                        playerposition = Math.max(playerposition, 0);
                        break;
                    default:
                        break;
                }
            }
            System.out.println("Player Position is :" + playerposition);
        }
    }
}