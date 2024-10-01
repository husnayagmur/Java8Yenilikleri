import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class LambdaExpression3 {
    public static void cinsiyeteGoreSırala(List<LambdaExpression3_Kisi> kisiler,LambdaExpression3_Kisi.Cinsiyet cinsiyet){
        for (int i=0;i<kisiler.size();i++){
            LambdaExpression3_Kisi kisi=kisiler.get(i);
            if(kisi.getCinsiyet().equals(cinsiyet)){
                System.out.println(kisi);
            }
        }
    }
    public static void yasaGoreSırala(List<LambdaExpression3_Kisi> kisiler,int yas) {
        for (int i = 0; i < kisiler.size(); i++) {
            LambdaExpression3_Kisi kisi = kisiler.get(i);
            if (kisi.getYas()>=yas){
                System.out.println(kisi);
            }

        }
    }
    public static void kisiFiltrele(List<LambdaExpression3_Kisi> kisiler,LambdaExpressions3_KisiFiltresi kisiFiltresi){
        for (int i = 0; i < kisiler.size(); i++) {
            LambdaExpression3_Kisi kisi = kisiler.get(i);
            if (kisiFiltresi.filtrele(kisi)){
                System.out.println(kisi);
            }

        }
    }

    public static void main(String[] args) {
        LambdaExpression3_Kisi kisi1=new LambdaExpression3_Kisi("Ali Çalışkan", LocalDate.parse("1990-03-11"),"ali.can@gmail.com",LambdaExpression3_Kisi.Cinsiyet.ERKEK);
        LambdaExpression3_Kisi kisi2=new LambdaExpression3_Kisi("Efnan Demir", LocalDate.parse("1980-07-11"),"efnandemirr@gmail.com",LambdaExpression3_Kisi.Cinsiyet.KADIN);

        ArrayList<LambdaExpression3_Kisi> arrayList=new ArrayList<>();
        arrayList.add(kisi1);
        arrayList.add(kisi2);

        /*cinsiyeteGoreSırala(arrayList, LambdaExpression3_Kisi.Cinsiyet.KADIN);
        System.out.println("--------------");
        yasaGoreSırala(arrayList,30);
        kisiFiltrele(arrayList, new LambdaExpressions3_KisiFiltresi() {
            @Override
            public boolean filtrele(LambdaExpression3_Kisi kisi) {
                return kisi.getYas() > 15&&kisi.getCinsiyet().equals(LambdaExpression3_Kisi.Cinsiyet.ERKEK);
            }
        });*/
        kisiFiltrele(arrayList,(k)->k.getYas()>=40);
    }
}
