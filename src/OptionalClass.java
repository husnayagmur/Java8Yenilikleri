import java.util.Optional;
import java.util.Set;

public class OptionalClass {
    public static String test(){
        System.out.println("Test Çalıştı");
        return "TEST";
    }
    public static void main(String[] args) {

        Optional<String> bosNesne=Optional.empty();
        System.out.println(bosNesne.isEmpty());//bos mu?Optional.empty(): Boş bir Optional nesnesi oluşturur.

        String deger="Merhaba";
        Optional<String> optional=Optional.of(deger);
        System.out.println(optional.isPresent());//isPresent(): Optional içinde değer olup olmadığını kontrol eder.

        String s=null;
        //Optional<String=optional2=Optional.of(s);//hata verir.Optional.of(T value): Değer varsa kullanılır, null kabul etmez.
        Optional<String> optional1=Optional.ofNullable(s);
        System.out.println(optional1.isPresent());//boştur çunku null.


        String s2=null;
        if(s2!=null){
            System.out.println(s2.length());
        }
//üstteki ve alttaki iki kod aynı işlevi görür.
        Optional<String> optional2=Optional.ofNullable(s2);
        optional2.ifPresent((x)->System.out.println(x.length()));

        String bosİsim=null;
        String isim=Optional.ofNullable(bosİsim).orElse("Ali");//eğer bosisim boş ise ali yaz.
        System.out.println(isim);

        String bosİsim1="Veli";
        String isim1=Optional.ofNullable(bosİsim1).orElse("Ali");//eğer bosisim boş ise ali değilse bosisim1 de ne varsa onu yazar..
        System.out.println(isim1);
System.out.println("---------------");
        String bosİsim2=null;
        String isim2=Optional.ofNullable(bosİsim2).orElseGet(()->"Ali");//eğer bosisim boş ise ali yaz.
        System.out.println(isim2);
        String bosİsim3="Veli";
        String isim3=Optional.ofNullable(bosİsim3).orElseGet(()->"Ali");//eğer bosisim boş ise ali yaz.
        System.out.println(isim3);
System.out.println("-----------orElse-orElseGet------");
        String bos=null;
        String string=Optional.ofNullable(bos).orElse(test());
        String string1=Optional.ofNullable(bos).orElseGet(()->test());
//null iken sıkıntı yok fakat,
        System.out.println(string);
            System.out.println(string1);
System.out.println("--------");
        String bos1="a";
        String string2=Optional.ofNullable(bos1).orElse(test());//bos olsa da olmasa da test metodunu çalıştırır.
        /*
        * Sonuç Olarak:
bos1 null ise:

Optional.ofNullable(bos1) boş bir Optional döner.
orElse(test()) çağrıldığında, test() metodu çalıştırılır ve "TEST" değeri döner.
Ayrıca, "Test Çalıştı" konsola yazdırılır.
bos1 null değilse:

Optional.ofNullable(bos1) dolu bir Optional döner.
orElse(test())'te, test() metodu yine de çalıştırılır (bu orElse()'in bir özelliğidir) ama sonuç olarak bos1'in değeri döndürülür.
Yani, bos1 dolu olduğu için test() metodunun döndürdüğü "TEST" değeri kullanılmaz. Ancak, test() metodu çalışacağı için "Test Çalıştı" konsola yazdırılır.*/
        String string3=Optional.ofNullable(bos1).orElseGet(()->test());//eğer boş ise çalıştırır.
        System.out.println(string2);
        System.out.println(string3);
        //
    }
}
