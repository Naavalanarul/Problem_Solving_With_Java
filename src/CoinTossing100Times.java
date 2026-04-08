import java.util.Scanner;

public class CoinTossing100Times{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Get the array size
        int n = sc.nextInt();
        int[] arr = new int[n];

        // 2. Get the array elements
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // 3. Get the target sum
        int target = sc.nextInt();

        // 4. Find and print pairs
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println(arr[i] + ", " + arr[j]);
                }
            }
        }
    }
}