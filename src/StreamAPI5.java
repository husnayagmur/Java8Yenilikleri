import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamAPI5 {
    public static void main(String[] args) {
       ArrayList<StreamAPI5_Ogrenci> arrayList=new ArrayList<>();
        arrayList.add(new StreamAPI5_Ogrenci(1,"Ali Kurt",18));
        arrayList.add(new StreamAPI5_Ogrenci(2,"Ebrar Dinç",17));
        arrayList.add(new StreamAPI5_Ogrenci(3,"Alya Yen",16));
        arrayList.add(new StreamAPI5_Ogrenci(4,"Yasemin Oz",17));

       /*List<StreamAPI5_Ogrenci> collect= arrayList.stream()
                .filter((o)->o.getIsim().startsWith("A"))
               //.filter((o)->o.getYas()>8)
                .collect(Collectors.toList());
       collect.forEach(System.out::println);
*/
        /*Map<Integer,List<StreamAPI5_Ogrenci>> gruplama=arrayList
                .stream()
                .collect(Collectors.groupingBy((o)->o.getYas()));
        Set<Integer> keySet=gruplama.keySet();
        Iterator<Integer> iterator=keySet.iterator();
        while (iterator.hasNext()){
            Integer key=iterator.next();
            System.out.println(key+" "+gruplama.get(key));
        }*/

        /*double yasOrtalaması=arrayList.stream()
                .collect(Collectors.averagingInt((o)->o.getYas()));
        System.out.println(yasOrtalaması);*/

        IntSummaryStatistics statistics=arrayList.stream()
                .collect(Collectors.summarizingInt((o)->o.getYas()));//detaylı bilgi verir.
        System.out.println(statistics);


    }
}
