import java.util.Scanner;

public class Palindrome{

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String original = scanner.nextLine();

        String reversed = new StringBuilder(original).reverse().toString();

        if (original.equals(reversed)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        scanner.close();
    }
}