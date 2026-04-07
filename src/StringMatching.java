import java.util.Scanner;

public class StringMatching {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.next();

        if (input.equals("Dhoni")) {
            System.out.println("Matching");
        } else {
            System.out.println("Not matching");
        }

        sc.close();
    }

}