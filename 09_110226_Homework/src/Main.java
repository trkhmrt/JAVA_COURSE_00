import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        List<String> ogrenciler = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("Seçim Yapınız");
            System.out.print("1-Öğrenci Ekleme 2-Öğrenci Silme 3-Öğrenci Arama 4-Öğrenci Listele 5-Çıkış");
            int secim = scanner.nextInt();
            if(secim==1){
                System.out.println("Öğrenci Ekleme Ekranına Hoşgeldiniz");
                System.out.print("Eklenecek öğrenci adı:");
                String ogrenci_ismi = scanner.next().toUpperCase();
                ogrenci_ekleme(ogrenciler,ogrenci_ismi);
                System.out.println("Öğrenci başarıyla eklendi!");
            }
            else if(secim==2){
                System.out.println("Öğrenci Silme Ekranına Hoşgeldiniz");
                ogrencileri_listele(ogrenciler);
                System.out.print("Silinecek öğrenci indeks numarası:");
                int indeks = scanner.nextInt();
                ogrenci_silme(ogrenciler,indeks);
                System.out.println("Öğrenci başarıyla silindi!");
            }
            else if(secim==3){
                System.out.println("Öğrenci Arama Ekranına Hoşgeldiniz");
                System.out.print("Aranacak Öğrenci Adı:");
                String isim = scanner.next().toUpperCase();
                if(ogrenci_ara(ogrenciler,isim)){
                    System.out.println(isim + " " + "İsimli öğrenci mevcut");
                }
                else{
                    System.out.println(isim + " " + "İsimli öğrenci mevcut değil");
                }
            }
            else if(secim==4){
                System.out.println("Öğrenci Listeleme Ekranına Hoşgeldiniz");
                ogrencileri_listele(ogrenciler);
            } else if (secim==5) {
                System.out.println("Çıkış yapılıyor");
                break;
            }
            else{
                System.out.println("Hatalı bir tuşa bastınız!");
            }
        }
    }
    public static void ogrenci_ekleme(List<String> ogrenciler_listesi,String isim){
        ogrenciler_listesi.add(isim);
    }
    public static void ogrenci_silme(List<String> ogrenciler_listesi,int indeks){
        ogrenciler_listesi.remove(indeks);
    }
    public static void ogrencileri_listele(List<String> ogrenci_listesi){
        for (int i = 0; i < ogrenci_listesi.size() ; i++) {
            System.out.println(i + "-" +ogrenci_listesi.get(i));
        }
    }
    public static boolean ogrenci_ara(List<String> ogrenci_listesi,String isim){
        return ogrenci_listesi.contains(isim);
    }
}