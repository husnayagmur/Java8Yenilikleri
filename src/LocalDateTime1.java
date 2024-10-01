import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class LocalDateTime1 {
    public static void main(String[] args) {
        LocalDateTime dateTime= LocalDateTime.now();
        System.out.println(dateTime);

        LocalDateTime dateTime1= LocalDateTime.of(2020,11,20,14,45);
        System.out.println(dateTime1);

        LocalDateTime dateTime2=dateTime1.plus(4, ChronoUnit.DAYS);
        System.out.println(dateTime2);

        LocalDate localDate= LocalDate.parse("2020-11-11");
        LocalDateTime birinci=LocalDateTime.of(localDate, LocalTime.parse("14:10"));
        LocalDateTime ikinci=LocalDateTime.of(localDate, LocalTime.parse("11:10"));
        System.out.println(birinci.isAfter(ikinci));

        /*ChronoUnit, Java'nın java.time.temporal paketinde bulunan bir enum'dur ve zaman birimlerini temsil eder. Tarih ve saat hesaplamaları yaparken kullanılabilecek farklı zaman birimlerini (DAYS, HOURS, MINUTES, vb.) sağlar.
        ChronoUnit'in başlıca görevi, iki tarih veya saat arasındaki farkı belirlemek ve bir tarihe veya saate belirli bir zaman birimi eklemek ya da çıkarmaktır.*/


    }
}
