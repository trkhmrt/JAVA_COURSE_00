public class Ogrenci {

    /*
    * Bu class'a ait field/property
    * */

    private String isim;

    private int yas;

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        /*if(!(isim.length()<3)){
            this.isim = isim;
        }*/
        this.isim = isim;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }








    public void merhaba_yaz(){
        System.out.println("Merhaba Arkadaşlar");
    }

    private void private_metot(){
        System.out.println("Merhaba Arkadaşlar");
    }


}
