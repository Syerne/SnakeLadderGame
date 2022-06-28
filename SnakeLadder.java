import java.util.Random;

public class SnakeLadder {

    public static void main(String[] args) {
        System.out.println("Welcome to the Snake and Ladder Game");
        int diceNum = getDieRoll();
    }
        private static int getDieRoll() {
            Random random = new Random();
            int roll = random.nextInt(6) + 1; // (max - min + 1) + min
            System.out.println(roll);
            return roll;
        }
}