public class LambdaExpressions2 {
    public static void main(String[] args) {
        /*LambdaExpression2_Kelime kelime=new LambdaExpression2_Kelime() {
            @Override
            public String kelime() {
                return "Merhaba";
            }
        };*/
        LambdaExpression2_Kelime kelime=()->"Selam";
        System.out.println(kelime.kelime());

        LambdaExpression2_Kelime2 kelime2=(s)->"Selam"+s;
        System.out.println(kelime2.kelime(" Armin"));

        LambdaExpression2_Topla topla=(a,b)->a+b;
        System.out.println(topla.topla(5,6));
    }
}
