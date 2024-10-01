public class StreamAPI5_Ogrenci {
    private int no;
    private String isim;
    private int yas;

    public StreamAPI5_Ogrenci() {
    }
    public StreamAPI5_Ogrenci(int no,String isim,int yas) {
        this.no = no;
        this.isim=isim;
        this.yas=yas;
    }

    public String getIsim() {
        return isim;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }
    @Override
    public int hashCode(){
        return no;
    }
    @Override
    public boolean equals(Object o){
        StreamAPI5_Ogrenci ogrenci=(StreamAPI5_Ogrenci) o;
        return ogrenci.no==this.no;
    }
    public String toString(){
        return "No:"+no+"  İsim:"+isim+"  Yas:"+yas;
    }
}
