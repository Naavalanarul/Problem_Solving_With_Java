import java.util.*;

class InsufficientBalanceException extends Exception {
    InsufficientBalanceException(String msg) {
        super(msg);
    }
}

class Account {
    double balance;

    Account(double balance) {
        this.balance = balance;
    }

    void withdraw(double amount) throws InsufficientBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient Balance");
        } else {
            balance -= amount;
            System.out.println("Remaining Balance = " + balance);
        }
    }
}

public class InsufficientBalanceExceptionDemo{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double balance = sc.nextDouble();
        double amount = sc.nextDouble();

        Account acc = new Account(balance);

        try {
            acc.withdraw(amount);
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}