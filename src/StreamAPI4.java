import java.util.Comparator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamAPI4 {
    public static void main(String[] args) {
        Stream.of("b1","a2","e3","d4")
                .sorted(new Comparator<String>() {
                    @Override//bu metot diğerleri gibi değil once kendi içinde sıralama yapar sonra diğer metota geçirtir.
                    public int compare(String o1, String o2) {
                        System.out.println("Sorted");
                        return o1.compareTo(o2);
                    }
                })
                .map(new Function<String, String>() {
                    @Override
                    public String apply(String s) {
                        System.out.println("Map");
                        return s.toUpperCase();
                    }
                })
                .filter(new Predicate<String>() {
                    @Override
                    public boolean test(String s) {
                        System.out.println("Filter");
                        return s.startsWith("A");
                    }
                })
                .forEach(System.out::println);
        System.out.println("--------------");
        Stream.of("b1","a2","e3","d4")
                .filter(new Predicate<String>() {
                    @Override
                    public boolean test(String s) {
                        System.out.println("Filter");
                        return s.startsWith("a");
                    }
                })
                .map(new Function<String, String>() {
                    @Override
                    public String apply(String s) {
                        System.out.println("Map");
                        return s.toUpperCase();
                    }
                })
                .forEach(System.out::println);
    }
}