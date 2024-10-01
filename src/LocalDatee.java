import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class LocalDatee {
    public static void main(String[] args) {
        java.time.LocalDate localDate= java.time.LocalDate.now();//Mevcut tarihi (LocalDate formatında) alır ve localDate değişkenine atar.
        System.out.println(localDate);

        java.time.LocalDate localDate1= java.time.LocalDate.parse("2020-11-01");// Verilen "2020-11-01" tarihini LocalDate nesnesine çevirir.
        System.out.println(localDate1);

        System.out.println(localDate.plus(1, ChronoUnit.DAYS));//localDate'e 1 gün ekler ve sonucu yazdırır.
        System.out.println(localDate.plusDays(1));//Yine localDate'e 1 gün ekler ve sonucu yazdırır. plusDays(1) metodu yukarıdaki gibi çalışır.
        System.out.println(localDate.minus(1,ChronoUnit.MONTHS));//localDate'den 1 ay çıkarır ve sonucu yazdırır.

        java.time.LocalDate localDate2= java.time.LocalDate.parse("2024-09-25");//Verilen "2024-09-25" tarihini LocalDate nesnesine çevirir ve localDate2 değişkenine atar.
        System.out.println(localDate2.getDayOfWeek());//localDate2'nin haftanın hangi günü olduğunu döndürür.

        java.time.LocalDate birinciTarih= java.time.LocalDate.parse("2020-01-01");
        java.time.LocalDate ikinciTarih= java.time.LocalDate.parse("2020-01-11");
        System.out.println(birinciTarih.isAfter(ikinciTarih));//birinciTarih, ikinciTarih'ten sonra mı diye kontrol eder. false dönecektir, çünkü birinciTarih daha önce.

        Scanner scanner=new Scanner(System.in);
        System.out.print("Doğum tarihi:");
        String line=scanner.nextLine();
        java.time.LocalDate dogumTarihi= java.time.LocalDate.parse(line);
        System.out.println("Doğum Tarihiniz: "+dogumTarihi);
        System.out.println("Yaşınız: "+(java.time.LocalDate.now().getYear()-dogumTarihi.getYear()));//Mevcut yıl (LocalDate.now().getYear()) ile kullanıcının doğum yılını çıkararak yaşı hesaplar ve ekrana yazdırır.

        /*
        ChronoUnit, Java'nın java.time.temporal paketinde bulunan bir enum'dur ve zaman birimlerini temsil eder.
        Tarih ve saat hesaplamaları yaparken kullanılabilecek farklı zaman birimlerini (DAYS, HOURS, MINUTES, vb.) sağlar.
        ChronoUnit'in başlıca görevi, iki tarih veya saat arasındaki farkı belirlemek ve bir tarihe veya saate belirli bir zaman birimi eklemek ya da çıkarmaktır.*/

    }
}
