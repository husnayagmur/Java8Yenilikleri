import java.time.temporal.ChronoUnit;

public class LocalTimee {
    public static void main(String[] args) {
        java.time.LocalTime localTime= java.time.LocalTime.now();
        System.out.println(localTime);

        java.time.LocalTime localTime1= java.time.LocalTime.parse("09:30");
        System.out.println(localTime1);

        java.time.LocalTime localTime2= java.time.LocalTime.of(14,30);
        System.out.println(localTime2);

        java.time.LocalTime localTime3= java.time.LocalTime.parse("21:30").plus(1, ChronoUnit.HOURS);
        System.out.println(localTime3);//22:30
        System.out.println(localTime3.getHour());//22
        System.out.println(localTime3.getMinute());//30

        java.time.LocalTime localTime4= java.time.LocalTime.parse("11:10");
        java.time.LocalTime localTime5= java.time.LocalTime.parse("12:55");
        System.out.println(localTime4.isAfter(localTime5));//false
        System.out.println(localTime4.isBefore(localTime5));//true
    }
}
