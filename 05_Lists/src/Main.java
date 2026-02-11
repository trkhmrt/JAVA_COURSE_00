import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        /*
         * LİSTS
         * Dizilerden farklı olarak kendi has metotları vardır ve daha gelişmiş yapılardır.
         *
         * */

       /* List<String> list = new ArrayList<>();

        //Listeye eleman ekleme
        list.add("Tarık");
        list.add("Elanur");
        list.add("Leal");
        list.add("Buse");
        list.add("Ayşenaz");*/


//
//        for(String item:list){
//            System.out.println(item);
//        }

        //Listeden eleman silme
        //list.remove("tarık");


//        for(String item:list){
//            System.out.println(item);
//        }

        //System.out.println(list.get(0));
        //System.out.println(list.getFirst());

        //System.out.println(list.get(list.size()-1));
        //System.out.println(list.getLast());


        //System.out.println(list.contains("Leal"));
        //list.clear();

        /*for (String item : list) {
            System.out.println(item);
        }*/


        //STREAM API
        /* Java 8+ ile birlikte listeler üzerinde döngü kurmadan stream yapısını kullanarak çeşitli operasyonları gerçekleştirebiliriz.*/

        List<Integer> sayilarListesi = Arrays.asList(20,45,10,39,48,11);

        List<Integer> ciftSayilar = new ArrayList<>();

        List<Integer> carpim_itemlar = new ArrayList<>();

        List<Integer> map_filter = new ArrayList<>();

        //sayilarListesi.forEach(number-> System.out.println(number));

        //carpim_itemlar = sayilarListesi.stream().map(number->number*2).toList();

        //carpim_itemlar.forEach(number-> System.out.println(number));
        //carpim_itemlar.forEach(System.out::println);

//        ciftSayilar = sayilarListesi.stream().filter(number->number%2==0).toList(); //20,10,48
//
//        ciftSayilar.forEach(System.out::println);


        //MAP FİLTER BİRLİKTE

//        map_filter = sayilarListesi.stream().filter(number->number%2==0).map(s->s*2).toList();
//        map_filter.forEach(System.out::println);



        //DERS İÇİ ÖDEV
        //Sevdiğiniz filmlerin adını depoladığınız bir liste yapısı kurun.
        /*
        *
        * Boş bir liste tanımlayıp içerisinde sevdiğiniz filmlerin isimlerini yazıp ekleyin.
        * Bazılarını silin
        * Sonra bütün filmleri listeleyin
        *
        *
        * */

        List<String> filmler = new ArrayList<>();

        filmler.add("Zombieland");
        filmler.add("ResidentEvil");
        filmler.add("Saw");
        filmler.add("Kutsal Damacana");
        filmler.add("TRANSFORMERS");
        filmler.add("T......");



        //filmler.forEach(System.out::println);

        //filmler.remove("Transformers");

        //filmler.forEach(System.out::println);


        List<String> bas_harfi_t = filmler.stream().filter(film ->film.startsWith("T")).map(String::toLowerCase).toList();

        bas_harfi_t.forEach(System.out::println);












    }
}