//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /*
        * Constructor(Yapıcı Metot)
        *
        * Bir sınıftan nesne üretildiğinde constructor metot otomatik çalışır.
        * Default hali içi boş bir metottur.
        *
        *
        * */

        Selam selam = new Selam();
        Selam selam1 = new Selam("Deneme");
        Selam selam2 = new Selam("Deneme",8080);

        System.out.println(selam.veri_tabani_baglanti());



    }
}