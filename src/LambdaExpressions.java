public class LambdaExpressions {
    public static void main(String[] args) {
        /*LamdaExpressions_SayiOlustur sayiOlustur=new LamdaExpressions_SayiOlustur() {
            @Override
            public double sayiOlustur() {
                return 15.0;
            }
        };
        System.out.println(sayiOlustur.sayiOlustur());*/
        LamdaExpressions_SayiOlustur olustur=()->15.0;
        System.out.println(olustur.sayiOlustur());
    }
}
