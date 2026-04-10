import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class DateTimeFormatterExample{

    public static void main(String[] args){

        DateTimeFormatter inputFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        LocalDateTime dt = LocalDateTime.parse(input, inputFormat);

        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter timeFormat = DateTimeFormatter.ofPattern("HH:mm:ss");
        DateTimeFormatter dateTimeFormat = DateTimeFormatter.ofPattern("dd MMM yyyy hh:mm:ss a");

        String dateFormatted = dt.format(dateFormat);
        String timeFormatted = dt.format(timeFormat);
        String dateTimeFormatted = dt.format(dateTimeFormat);

        System.out.println(dateFormatted);
        System.out.println(timeFormatted);
        System.out.println(dateTimeFormatted);
    }

}
//yyyy - 2026,2027, ...
//MM - 01, 02, 03, ..., 12
//MMM - Jan, Feb, Mar, ..., Dec
//dd - 01, 02, 03, ..., 31
//HH - 00, 01, 02, ..., 23 (24-hour format)
//hh - 01, 02, ..., 12 (12-hour format)
//mm - 00, 01, ..., 59
//ss - 00, 01, ..., 59
//a - AM or PM