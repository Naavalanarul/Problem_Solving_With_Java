import java.util.*;
abstract class Book{
    String title;
    int bookId;
    Book(int bookId, String title){
        this.bookId = bookId;
        this.title = title;
    }
    public abstract double calculateFine(int daysLate);
}

class TextBook extends Book{
    double finePerDay;
    TextBook(int bookId, String title, double finePerDay){
        super(bookId, title);
        this.finePerDay = finePerDay;
    }
    public double calculateFine(int daysLate){
        double fine = daysLate * finePerDay;
        return fine;
    }
}
class ReferenceBook extends Book{
    double finePerDay;
    ReferenceBook(int bookId, String title, double finePerDay){
        super(bookId, title);
        this.finePerDay = finePerDay;
    }
    public double calculateFine(int daysLate){
        double fine = 2 * daysLate * finePerDay;
        return fine;
    }
}

public class LibraryBookManagement{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String name1 = scanner.nextLine();
        int id1 = scanner.nextInt();
        double fpd1 = scanner.nextDouble();
        int daysLate1 = scanner.nextInt();
        TextBook tb = new TextBook(id1, name1, fpd1);

        double fine1 = tb.calculateFine(daysLate1);

        System.out.printf("%s Fine = %.1f\n", name1, fine1);

        scanner.nextLine();

        String name2 = scanner.nextLine();
        int id2 = scanner.nextInt();
        double fpd2 = scanner.nextDouble();
        int daysLate2 = scanner.nextInt();

        ReferenceBook rb = new ReferenceBook(id2, name2, fpd2);

        double fine2 = rb.calculateFine(daysLate2);

        System.out.printf("%s Fine = %.1f\n", name2, fine2);

        scanner.close();


    }
}