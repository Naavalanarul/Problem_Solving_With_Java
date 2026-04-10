import java.util.Random;

public class CoinTossing100Times {
    public static void main(String[] args) {
        Random random = new Random();

        int heads = 0;
        int tails = 0;
        int totalTosses = 100;

        for (int i = 0; i < totalTosses; i++) {
            int result = random.nextInt(2);

            if (result == 0) {
                heads++;
            } else {
                tails++;
            }
        }

        System.out.println("Simulation Results for " + totalTosses + " tosses:");
        System.out.println("Number of Heads: " + heads);
        System.out.println("Number of Tails: " + tails);
    }
}