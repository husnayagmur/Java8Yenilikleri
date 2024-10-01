import java.io.Serializable;
import java.time.LocalDate;

public class LambdaExpression3_Kisi implements Serializable {
    public enum Cinsiyet{
        ERKEK,KADIN
    }
    private String isim;
    private LocalDate dogumTarihi;
    private String emailAdresi;
    private Cinsiyet cinsiyet;
    private int yas;

    public LambdaExpression3_Kisi() {
    }
    public LambdaExpression3_Kisi(String isim,LocalDate dogumTarihi,String emailAdresi,Cinsiyet cinsiyet) {
        this.isim = isim;
        this.dogumTarihi=dogumTarihi;
        this.emailAdresi=emailAdresi;
        this.cinsiyet=cinsiyet;
    }

    public int getYas() {

        return LocalDate.now().getYear()-dogumTarihi.getYear();
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    public String getIsim(){
        return isim;
    }
    private void setIsim(String isim){
        this.isim=isim;
    }

    public LocalDate getDogumTarihi() {
        return dogumTarihi;
    }

    public void setDogumTarihi(LocalDate dogumTarihi) {
        this.dogumTarihi = dogumTarihi;
    }

    public String getEmailAdresi() {
        return emailAdresi;
    }

    public Cinsiyet getCinsiyet() {
        return cinsiyet;
    }

    public void setCinsiyet(Cinsiyet cinsiyet) {
        this.cinsiyet = cinsiyet;
    }

    public void setEmailAdresi(String emailAdresi) {
        this.emailAdresi = emailAdresi;
    }
    @Override
    public int hashCode(){
        return emailAdresi.hashCode();
    }
    @Override
    public boolean equals(Object o){
        LambdaExpression3_Kisi kisi=(LambdaExpression3_Kisi) o;
        return kisi.emailAdresi.equals(this.emailAdresi);
    }
    @Override
    public String toString(){
        return "İsim:"+isim+" Doğum Tarihi:"+dogumTarihi+" e-Mail Adres:"+" Yas:"+getYas()+emailAdresi+" Cinsiyet:"+cinsiyet;
    }
}
