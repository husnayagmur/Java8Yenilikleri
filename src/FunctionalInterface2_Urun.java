import java.io.Serializable;

public class FunctionalInterface2_Urun implements Serializable {
    private int id;
    private String adi;
    private double fiyat;

    public FunctionalInterface2_Urun() {
    }
    public FunctionalInterface2_Urun(int id,String adi,double fiyat) {
        this.id = id;
        this.adi=adi;
        this.fiyat=fiyat;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAdi() {
        return adi;
    }

    public double getFiyat() {
        return fiyat;
    }

    public void setFiyat(double fiyat) {
        this.fiyat = fiyat;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }
    @Override
    public int hashCode(){
        return id;
    }
    @Override
    public boolean equals(Object o){
        FunctionalInterface2_Urun urun=(FunctionalInterface2_Urun) o;
        return this.id==urun.id;
    }
    @Override
    public String toString(){
        return "ID:"+id+"  Ad:"+adi+"  Fiyat"+fiyat;
    }
}
