import java.util.Arrays;
import java.util.function.Predicate;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamAPI1 {
    public static void main(String[] args) {
        IntStream.range(1,11)
                .forEach(System.out::println);//1ve 10 dahil sayilari yazdirir.

        System.out.println("-------");
        Arrays.stream(new int[]{1,2,3,4,5})
                .map((x)->x*3)
                .forEach(System.out::println);//dizideki herbir sayiyi alır 3 ile çarpar ve yazdirir.

        System.out.println("-------");
        int toplam=IntStream.range(1,101)
                .sum();
        System.out.println(toplam);

        System.out.println("-------");
        Stream.of("1","2","3","4")//fadesi, "1", "2", "3" ve "4" değerlerini içeren bir Stream oluşturur. Bu Stream'deki öğeler String türündedir.
                .mapToInt(Integer::parseInt)//metodu, Stream<String> öğelerini int türüne dönüştürmek için kullanılır.
                //Integer::parseInt:her bir String değerini int'e çeviren bir method referansıdır. Örneğin, "1" -> 1, "2" -> 2 gibi dönüşümler yapılır.
                //mapToInt(), bu dönüşümü uyguladıktan sonra IntStream oluşturur, yani artık elimizde sayısal bir akış vardır: 1, 2, 3, 4.
                .max()
                .ifPresent(System.out::println);// metodu, eğer bir sonuç varsa, bu sonucu ekrana yazdırır.

        System.out.println("-------");
        IntStream.range(1,11)
                .mapToObj((x)->x+"a")
                .forEach(System.out::println);

        System.out.println("-------");
        Stream.of(1.1,2.2,3.3,4.4,5.5)
                .mapToInt(Double::intValue)
                .max()
                .ifPresent(System.out::println);//maç: Eğer Optional nesnesinde bir değer varsa, bu değeri işlemden geçirmek için kullanılır. Eğer değer yoksa, hiçbir şey yapmaz.

        Stream.of("Ali","Ahmet","Samed")
                .filter(new Predicate<String>() {
                    @Override
                    public boolean test(String s) {
                        System.out.print("Çalıştı ");
                        return true;
                    }
                })
                .forEach(System.out::println);
    }

}
