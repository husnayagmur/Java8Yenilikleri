import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.logging.Filter;
import java.util.stream.Stream;

public class StreamAPI {
    public static void main(String[] args) {
        /*
        * eri akışı sağlar: Koleksiyonlar ve diziler üzerinde işlem yapmayı kolaylaştırır.
Fonksiyonel programlama destekler: Lambda ifadeleri ile birlikte kullanılabilir.
Ara ve terminal işlemleri içerir:
Ara işlemler (intermediate): filter(), map(), sorted()
Terminal işlemler: forEach(), collect(), reduce()*/
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Istanbul");
        arrayList.add("Konya");
        arrayList.add("Karaman");
        arrayList.add("Adana");
        arrayList.add("Adıyaman");

        arrayList.stream()
                .filter((t) -> t.startsWith("K"))
                .map((t) -> t.toUpperCase())
                .sorted((t1, t2) -> t1.compareTo(t2))
                .forEach(System.out::println);


        /*
        Stream<String> stream=arrayList.stream();
        Stream<String > stream2=stream.filter(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.startsWith("A");
            }
        });
        Stream<String> stream3=stream2.map(new Function<String, String>() {
            @Override
            public String apply(String s) {
                return s.toUpperCase();
            }
        });
        Stream<String> stream4=stream3.sorted(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
        //compareTo() Metodunun Temel İşlevi:
        //İki nesneyi karşılaştırarak, bunların birbirine göre sıralamasını döndürür.
        stream4.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });*/

//Farklı bir örnek.
        int[] numaralar = {1, 2, 3, 4, 5};
        Arrays.stream(numaralar)
                .filter((x) -> x > 2)
                .map((x) -> x * 2)
                .sorted()
                .forEach(System.out::println);
    }
}
