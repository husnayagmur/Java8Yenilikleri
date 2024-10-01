import java.util.ArrayList;
import java.util.function.Consumer;

public class FunctionalInterface {
    public static void main(String[] args) {
        /*FunctionalInterface_Matematik matematik=new FunctionalInterface_Matematik() {
            @Override
            public void islem(double x, double y) {
                System.out.println(x+y);
            }
        };
        /*


        //Anonim İç Sınıf Kullanımı: new FunctionalInterface_Matematik() { ... } ifadesi,
          FunctionalInterface_Matematik arayüzünü anonim bir sınıf olarak implement eder. Yani, bu sınıf isimsizdir ve doğrudan bir nesne oluşturulur.
          islem Metodunun Implementasyonu: islem metodunu override ederek, iki sayının toplamını ekrana yazdıran bir davranış tanımlanmıştır.

        FunctionalInterface_Matematik matematik=(x,y)->System.out.println(x+y);
        matematik.islem(5,15);
        FunctionalInterface_Matematik matematik1=(x,y)->System.out.println(x-y);
        matematik1.islem(55,15);*/

        ArrayList<String > sehirler=new ArrayList<>();
        sehirler.add("Karaman");
        sehirler.add("Konya");
        sehirler.add("Istanbul");
        sehirler.forEach((s)->System.out.println(s));
        //ya da
        /*sehirler.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });*/
    }
}
//Predicate<T>: Tek bir parametre alır ve boolean döner.
//Function<T, R>: Bir parametre alır ve bir sonuç döner.
//Consumer<T>: Bir parametre alır ve bir işlem gerçekleştirir, sonuç döndürmez.
//Supplier<T>: Hiçbir parametre almaz ve bir sonuç döner.