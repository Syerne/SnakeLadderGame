import java.util.Random;

public class SnakeLadder {
    static final int LADDER = 1;
    static final int SNAKE = 2;

    public static void main(String[] args) {
        System.out.println("Welcome to the Snake and Ladder Game");

        Random random = new Random();
        int dieNum = random.nextInt(6) + 1;
        int options = random.nextInt(3);
        int playerposition = 0;
        switch (options) {
            case LADDER:
                playerposition += dieNum;
                System.out.println("the player got ladder:" + playerposition);
                break;
            case SNAKE:
                playerposition -= dieNum;
                System.out.println("the snake bit the player:" + playerposition);
                break;
            default:
                System.out.println("the player remains in same position:" + playerposition);
                break;
        }
        System.out.println("Player Position is :" + playerposition);
    }
}
