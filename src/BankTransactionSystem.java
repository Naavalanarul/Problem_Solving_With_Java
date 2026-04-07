import java.util.*;
public class BankTransactionSystem{

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter initial balance");
        float balance = scanner.nextInt();

        System.out.printf("1. Deposit\n2. Withdraw\n3. Balance Check\n");

        int choice = scanner.nextInt();

        switch(choice){
            case 1:
                System.out.println("Enter deposit amount");
                int amount = scanner.nextInt();
                if (amount > 0){
                    balance += amount;
                    System.out.printf("Updated Balance: " + balance + "\n");
                }else{
                    System.out.println("Invalid Deposit Amount");
                }
                break;

            case 2:
                System.out.println("Enter withdraw ammount");
                int withdrawal = scanner.nextInt();
                if (withdrawal > 0 || withdrawal <= balance){
                    balance -= withdrawal;
                    System.out.printf("Updated Balance: " + balance + "\n");
                }else{
                    System.out.println("Insufficient Balance");
                }
                break;

            case 3:
                System.out.printf("Balance: " + balance + "\n");
                break;

            default:
                System.out.printf("Invalid Choice");
                break;
        }

        scanner.close();
    }
}