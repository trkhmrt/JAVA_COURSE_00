package com.ael;

public class Main {
    public static void main(String[] Args) {

        //Tek satır yorumunuz varsa bunu kullanabilirsiniz.

        /*
       Bir satırdan fazla yorumunuz varsa bunu kullanabilirsiniz.
       */

        /*
            Değişkenler(Variables)

            Bilgisayar ortamında veri saklamak için kullanılan alanlardır.

            Veri Tipleri

            String
            "" arasında metinsel ifadeleri saklar.Buna harfler ve rakamlar dahildir.

            Integer

            + ve - Tam sayıları tutar. 100 200 -350

             (Double)Ondalıklı Sayılar  (Boy Kilo para birimi gibi veriler)

             + ve - Ondalıklı sayılar için kullanılır

             Char(karakter kısaltması gibi düşünülebilir.)
             Tek bir karakter tutar.
             'a'  'A'

             "TARIK"

             Boolean(mantıksal Veri tipi)
               1 ve 0 (True ve False)
        */

        /*
             Değişken isim tanımlama kuralları

             1- Kesinlikle ingilizce karakterler içermeli.
             2- eğer değişken isimleri iki kelimeden oluşuyorsa aralarında _ dışında boşluk dahil hiçbir karakter olamaz.
             3- İki Kelimeden oluşan değişken isimlerinde javada yaygın olarak kullanılan camelCase yazım tarzı tercih edilmeli.
             4- Değişkeni numaralandırma ihtiyacı varsa numara değişken adının sağına yazılmalı.

        */

        String isimSoyisim1 = "Tarık";
        String isimSoyisim2 = "Furkan";

        Integer yas = 28;
        double kilo = 72.5;

        char basHarf = 't';

        /*bir değişkenin başına veri tipi eklemek o değişken için bellekte tanımlama yapılmasını istemektir.Bundan dolayı veri tipi tanımlanan aynı isimde iki değişken kullanılmaya çalışılırsa hata alınır.İsimlerde değişiklik yapmak gerekir.Ancak istenen tanımlanmış değişken içerisindeki veriyi güncellemek iste veri tipi olmadan değişken adı yazılır ve yeniverri atama operatörü ile içeri gönderilir.*/

        boolean checkIsTrue0 = true;
        checkIsTrue0 = false;
        boolean checkIsTrue1 = false;

    }
}

