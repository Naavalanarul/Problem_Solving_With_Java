import java.util.Random;

public class SixSidedDiceRoll {
    public static void main(String[] args) {
        Random random = new Random();
        int dice1, dice2, sum;
        int tries = 0;

        do {
            tries++;

            dice1 = random.nextInt(6) + 1;
            dice2 = random.nextInt(6) + 1;

            sum = dice1 + dice2;

            System.out.println(dice1 + " + " + dice2 + " = " + sum);

        } while (sum != 7);

        System.out.println("You won after " + tries + " tries!");
    }
}