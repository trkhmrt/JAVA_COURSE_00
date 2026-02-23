//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//        Kedi kedi = new Kedi();
//        System.out.println(kedi.ses_cikar());
//
//        Köpek kopek = new Köpek();
//        System.out.println(kopek.ses_cikar());

        OdemeYontemi odemeYontemi1 = new KrediKarti();
        OdemeYontemi odemeYontemi2 = new KriptoOdeme();


        islemiGerceklestir(odemeYontemi1,100.20);
        islemiGerceklestir(odemeYontemi2,100.20);

    }

    static void islemiGerceklestir(OdemeYontemi odemeYontemi,double tutar){
        odemeYontemi.odemeYap(tutar);
    }

}