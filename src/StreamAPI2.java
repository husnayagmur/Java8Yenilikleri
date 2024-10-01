import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamAPI2 {
    public static void main(String[] args) {
        Stream.of(1,2,3,4,5)
                .filter(new Predicate<Integer>() {
                    @Override
                    public boolean test(Integer integer) {
                            System.out.println("Test");
                        return integer>2;
                    }
                })
                .forEach(new Consumer<Integer>() {
                    @Override
                    public void accept(Integer integer) {
                        System.out.println("Accept");
                        System.out.println(integer);
                    }
                });
    }
}
