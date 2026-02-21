import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /*
         *
         * OOP(Object Oriented Programming/Nesne yönelimli programlama)
         *
         * Nesne yönelimli programlama veya kısaca NYP, Her işlevin nesneler olarak soyutlandığı bir programlama yaklaşımıdır. NYP destekleyen programlama dilleri yüksek seviye diller olarak adlandırılır. 1960'lı yılların sonuna doğru ortaya çıkan bu yaklaşım, o dönemin yazılım dünyasında beliren bir bunalımın sonucudur.
         * *
         *
         *
         *CLASS NEDİR ?
         *
         *Bir nesnenin taslağıdır.İçerisinde yazılmış kod blokları bulunur.
         *
         *NESNE NEDİR?
         *
         * Bu taslaktan(Classtan) üretilen gerçek bir kopya/örnek.
         *
         * INSTANCE(Örnek oluşturma) ?
         *
         * Herhangi bir classtan nesne oluşturma olayıdır.
         *
         *
         * OOP DÖRT TEMEL İLKESİ
         *
         * 1- Kapsülleme(Encapsulation)
         *
         * Verileri koruma altına almaktır.Bir sınıf içerisindeki değişkenleri koruma altına alarak dışarıdan direkt erişime kapatırız ve kkontrollü veri atanmasını sağlarız.
         *
         *
         * 2- Kalıtım(Inheritance)
         *
         * Bir sınıfın özelliklerini başka bir sınıfın miras alarak aktarılması işidir.
         *
         * 3- Çok Biçimlilik(Polymorphism)
         *
         * Aynı işi farklı şekillerde yapılması
         *
         * 4- Soyutlama(Abstraction)
         *
         * Siz interface veya abstract class içerisindeki herhangi bir metodun yapacağı işi yazmazsınız.Sadece o metodu soyut bir şekilde tanımlarsınız.
         * Bu class'ı kendi içerisinde uygulauacak kişi ilgili soyut metotların içerisini istediği gibi doldurabilir.
         * Karmaşıklığı gizleyip sadece gerekli olanı göstermek için kullanılır.
         *
         *
         *
         *
         *
         *
         *
         * */

        List<Ogrenci> ogrenciler = new ArrayList<Ogrenci>();

        Scanner scanner = new Scanner(System.in);

        for(int i=0 ; i<3;i++){

            Ogrenci ogrenci = new Ogrenci();
            System.out.println("Öğrenci adı:");
            String ogrenci_ad = scanner.next();
            ogrenci.setIsim(ogrenci_ad);

            ogrenciler.add(ogrenci);

        }

        for(Ogrenci item:ogrenciler){
            System.out.println(item.getIsim());
        }


















    }
}