import java.util.function.Supplier;

public class FunctionalInterface2 {
    public static void main(String[] args) {
        /*Supplier<FunctionalInterface2_Urun> urunSupplier=new Supplier<FunctionalInterface2_Urun>() {
            @Override
            public FunctionalInterface2_Urun get() {
                FunctionalInterface2_Urun urun=new FunctionalInterface2_Urun(1,"Laptop",1000);
                return urun;
            }
        };*/

        //yada

            Supplier<FunctionalInterface2_Urun> urunSupplier=()->new FunctionalInterface2_Urun(1,"Laptop",1000);
        System.out.println(urunSupplier.get());
    }
}
