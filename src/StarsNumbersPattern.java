import java.util.*;
public class StarsNumbersPattern{

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the maximum number of stars or number to print : \n");
        int n = scanner.nextInt();

        for(int i = 0; i < n; i++){
            for(int j = n - i - 1; j > 0; j--){
                System.out.print("  ");
            }
            for(int k = 0; k <= i; k++){
                System.out.print("*   ");
            }
            System.out.println();
        }

        for(int i = 0; i < n; i++){
            for(int j = 0; j < i; j++){
                System.out.print("  ");
            }
            for(int k = n - i; k > 0; k--){
                System.out.printf(k + "   ");
            }
            System.out.println();
        }

    }

}