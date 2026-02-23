public class Selam {

    public String sql_connecgtion_string = null;

    /*Constructor Tanımlama
    * classın adıyla public olarak oluşturulur
    * */

    public Selam(){
        sql_connecgtion_string = "No parameter Sql Bağlantısı";
    }

    public Selam(String baglanti_adresi){
        sql_connecgtion_string = baglanti_adresi;
    }

    public Selam(String baglanti_adresi,int port){
        sql_connecgtion_string = baglanti_adresi;
    }




    public String veri_tabani_baglanti(){
        if(sql_connecgtion_string !=null){
            return "Bağlantı sağlandı";
        }
        return "Bağlantı adresi boş";
    }


}
