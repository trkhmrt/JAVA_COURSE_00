import java.util.Date;


public class Insan {
    private String isim;
    private String soy_isim;
    private Date dogum_tarihi;
    private int cinsiyet_bilgisi;

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getSoy_isim() {
        return soy_isim;
    }

    public void setSoy_isim(String soy_isim) {
        this.soy_isim = soy_isim;
    }

    public int getCinsiyet() {
        return cinsiyet_bilgisi;
    }

    public void setCinsiyet(int cinsiyet_bilgisi) {
        this.cinsiyet_bilgisi = cinsiyet_bilgisi;
    }

    public Date getDogum_tarihi() {
        return dogum_tarihi;
    }

    public void setDogum_tarihi(Date dogum_tarihi) {
        this.dogum_tarihi = dogum_tarihi;
    }
}
