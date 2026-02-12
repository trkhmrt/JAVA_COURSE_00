import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*FUNCTIONS
         *
         * Belirli bir görevi yerine getirmek için oluşturulan gerektiğinde çağrılan ve çağrılmadan çalışmayan kod bloklarıdır.
         *
         *
         * 2 FARKLI FONKSİYON TÜRÜ VARDIR.
         *
         * 1.Geri Değer Döndürmeyen          2. Geri Değer Döndüren
         *
         *
         * Fonksiyon İmzası
         *
         * - Fonksyionun Adı
         * - Parametre Sayısı
         * - Parametrelerin Tipi
         *
         *
         * Fonksiyon Nasıl Tanımlanır ?
         *
         * 1- Geri Değer Döndürmeyen
         *
         * Tanımlanma
         * public void fonksiyona_isim(){
         *
         *
         * }
         *
         * Çağrılma
         *
         * Metodun_adı()
         *
         *
         * 2- Geri Değer Döndüren Metotlar
         *
         * public String fonksiyon_ismi(){
         *
         *
         * }
         *
         *
         * */
//        selam_ver();
//
//        System.out.println(veriyi_kaydet_ve_haber_ver());
//
//        selam_ver("asdasdasd");
//        selam_ver("Tarık");
//        selam_ver("Tarık",28);
//        selam_ver("Tarık",28,73.0);

        Scanner scanner = new Scanner(System.in);

        System.out.print("Sayi1'i giriniz:");
        int sayi1 = scanner.nextInt();
        System.out.print("Sayi2'i giriniz:");
        int sayi2 = scanner.nextInt();

        Integer sonuc = toplama(sayi1,sayi2);
        System.out.println(sonuc);
    }

    static void selam_ver() {
        System.out.println("Merhaba Tarık \n");
    }

    static void selam_ver(String isim) {
        System.out.printf("Merhaba %s \n", isim);
    }

    static void selam_ver(String isim, Integer yas) {
        System.out.printf("Merhaba %s Yaş:%d \n", isim, yas);
    }

    static void selam_ver(String isim, Integer yas, Double kilo) {
        System.out.printf("Merhaba %s Yaş:%d Kilo:%.2f", isim, yas, kilo);
    }

    static String veriyi_kaydet_ve_haber_ver() {
        return "Veriler kaydedildi";
    }

    static Integer toplama(Integer sayi1, Integer sayi2) {
        return sayi1 + sayi2;
    }




}