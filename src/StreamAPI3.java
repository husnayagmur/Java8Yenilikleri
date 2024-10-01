import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamAPI3 {
    public static void main(String[] args) {
        Stream.of(1,2,3,4,5)
                .filter(new Predicate<Integer>() {
                    @Override
                    public boolean test(Integer integer) {
                        System.out.println("Test Filter");
                        return integer>2;
                    }
                })
                .anyMatch(new Predicate<Integer>() {
                    @Override
                    public boolean test(Integer integer) {
                        System.out.println("Test AnyMatch");
                        return integer==5;
                    }
                });
    }

}
