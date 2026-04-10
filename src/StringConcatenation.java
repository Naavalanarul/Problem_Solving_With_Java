import java.util.Scanner;

public class StringConcatenation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        System.out.println(str1.length() + " " + str2.length());

        String concatenated = str1 + " " + str2;
        System.out.println(concatenated);

        System.out.println(str1.toUpperCase());

        sc.close();
    }
}