import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /*
           Parametreli Geri Değer döndüren Fonksiyon
        *
        *
        * */

        List<Integer> sayilar = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        //System.out.println(sayilari_topla(sayilar));

        cift_sayilari_bul(sayilar).forEach(System.out::println);

    }


    static Integer sayilari_topla(List<Integer> int_list){
        int toplam = 0;

        for(int sayi: int_list){
            toplam+=sayi;
            //toplam = toplam + sayi;
        }
        return toplam;
    }


    static List<Integer> cift_sayilari_bul(List<Integer> int_list){
        return int_list.stream().filter(sayi->sayi%2==0).toList();
    }


}