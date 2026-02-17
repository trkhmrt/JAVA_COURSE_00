//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /*
         * TRY - CATCH
         *
         * Uygulama çalışma esnasında bir hata meydana geldiğinde uygulamanın çökmeden çalışmaya devam etmesini ve ilgli hatanın ayıklanıp geri bildirimde bulunulmasını sağlar
         *
         *
         *
         * */

        //int sayi = 10;


        //ArithmeticException/By zero hatası
        /*try{
            System.out.println(sayi/0);
        }catch(Exception e){
            System.out.println(e);
        }*/

        //NullPointerException

        /*String isim = null;

        System.out.println(isim.length());

        try{
            System.out.println(isim.length());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }*/

        //ArrayIndexOutOfBoundsException

       /* int[] sayilar = {1, 2, 3};

        try {
            System.out.println(sayilar[3]);
        } catch (Exception e) {
            System.out.println(e);
        }*/

        //NumberFormatException(Alfabetik bir ifadeyi sayısal bir veri tipine çevirmek isterseniz bu hatayı alırsınız.)
        //String isim = "tarık";
        //String string_sayi = "1";

        //int sayi = Integer.parseInt(isim);


        //MULTIPLE EXECPTION HANDLING
        try{
            int[] sayilar = {34,56,80};
            //System.out.println(sayilar[10]);

            //System.out.println(sayilar[1]/0);

            //String renk_kodu = "1ABB#";
            String renk_kodu = "123";

            int renk_kodu_int = Integer.parseInt(renk_kodu);

        }catch(ArithmeticException e){
            System.out.println("Sıfır bölünme hatası lütfen bölen sayıya dikkat edin.");
        }
        catch(NumberFormatException e){
            System.out.println("Uygun formatta data giriniz");
        }
        catch(IndexOutOfBoundsException e){
            System.out.println("Lütfen Uygun aralıkta indeks değeri giriniz");
        }
        finally {
            System.out.println("NE OLURSA OLSUN BEN ÇALIŞIRIM");
        }


        //THROWS KENDİ HATAMIZI FIRLATMAK
        try{
            yasKontrol(7);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }



        //System.out.println("BU KOD HİÇ ÇALIŞMAYACAK");

    }

    public static void yasKontrol(int yas) throws RuntimeException{
        if(yas<18){
            throw new RuntimeException("18 yaşından küçük ehliyet alamaz.");
        }
    }

}