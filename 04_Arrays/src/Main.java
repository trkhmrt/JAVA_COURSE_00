import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        /*
        * ARRAYS(Diziler
        *
        *Aynı veri tipine sahip birden fazla değişkeni tek bir değişken altında toplanmasını sağlar
        *
        *
        *  veri_tipi[] dizi_ismi = new veri_tipi[eleman_sayısı];
        * */

        //Dizi tanımlama 1.Yöntem
//        int[] sayilar = new int[3];
//        sayilar[0] = 10;
//        sayilar[1] = 20;
//        sayilar[2] = 30;
//
//        String[] isimler = new String[6];
//        isimler[0] = "Ayşe";
//        isimler[1] = "Buse";
//        isimler[2] = "Tarık";
//        isimler[3] = "Elanur";
//        isimler[4] = "Leal";
//        isimler[5] = "Furkan";

        //2.Dizi Tanımlama Yöntemi

//        double[] notlar = {65.42,78.12,99.13,23.19};
//        System.out.println(notlar.length);

        //Dizi elamanlarına erişme
//
//        for (int i = 0; i < notlar.length; i++) {
//            System.out.println(notlar[i]);
//        }

        //Foreach YÖNTEMİ
//        for(double item:notlar){
//            System.out.println(item);
//        }

        //ARRAY METOTLARI

//        String[] isimler = new String[6];
//        isimler[0] = "Ayşe";
//        isimler[1] = "Buse";
//        isimler[2] = "Tarık";
//        isimler[3] = "Elanur";
//        isimler[4] = "Leal";
//        isimler[5] = "Furkan";

//        isimler[0] = "zeynep";
//        System.out.println(isimler[0]);

        //SORT(A-z 1-9 sıralaması yapar)
//        Arrays.sort(isimler);
//
//
//        System.out.println(Arrays.toString(isimler));

        //BinarySearch (Aranan değerin indeksini döndürür)

//        int indeks = Arrays.binarySearch(isimler,"Furkan");
//
//        System.out.println(indeks);



        //İstanbul
        //Adres Dğeri Gültepe
//        int[] sayilar = {20,30,90,14};
//
//        System.out.println("Sayilar Dizisi:"+Arrays.toString(sayilar));
//
//        //Kağıthane
//        int[] sayilar2 = {10,30,20,30};
//        int refNO = System.identityHashCode(sayilar);
//        System.out.println(refNO);
//        sayilar2 = sayilar;
//
//        System.out.println("Sayilar2 Dizisi:"+Arrays.toString(sayilar2));
//
//        sayilar2[0] = 39;
//        int refNO2 = System.identityHashCode(sayilar2);
//        System.out.println(refNO2);
//
//        System.out.println("Sayilar Dizisi:"+Arrays.toString(sayilar));

        //CLONE()
        int[] sayilar = {20,30,90,14,43};


        System.out.println("Sayilar Dizisi:"+Arrays.toString(sayilar));

        int[] sayilar2 = {10,30,20,30};
        sayilar2 = sayilar.clone();

        System.out.println("Sayilar2 Dizisi:"+ Arrays.toString(sayilar2));
        sayilar2[0] = 39;
        System.out.println("Sayilar Dizisi:"+Arrays.toString(sayilar));

        //COPYOF() -> Diziyi kopyalarken yeniden boyutlandırma imkanı verir.
        int[] sayilar3 = {50};

        sayilar3 = Arrays.copyOf(sayilar,5);

        System.out.println("Sayilar3 Dizisi:"+Arrays.toString(sayilar3));


























    }
}