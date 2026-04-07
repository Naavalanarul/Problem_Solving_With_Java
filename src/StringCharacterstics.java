import java.util.Scanner;

public class StringCharacterstics{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String input = sc.nextLine();

        int lower = 0;
        int upper = 0;
        int digits = 0;
        int special = 0;

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (Character.isLowerCase(ch)) {
                lower++;
            } else if (Character.isUpperCase(ch)) {
                upper++;
            } else if (Character.isDigit(ch)) {
                digits++;
            } else {
                special++;
            }
        }

        System.out.println("The number of lower case characters =" + lower);
        System.out.println("The number of upper =" + upper);
        System.out.println("The number of special case characters =" + special);
        System.out.println("The number of digits present in the string =" + digits);

        sc.close();
    }
}