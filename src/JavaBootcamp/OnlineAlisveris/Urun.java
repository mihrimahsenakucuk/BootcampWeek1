package JavaBootcamp.OnlineAlisveris;

public class Urun {
    private String kategori;
    private int fiyat;
    private String isim;
    private int stokBilgisi;


    public Urun(String kategori, int fiyat, String isim, int stokBilgisi) {
        this.kategori = kategori;
        this.fiyat = fiyat;
        this.isim = isim;
        this.stokBilgisi = stokBilgisi;
    }

    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    public int getFiyat() {
        return fiyat;
    }

    public void setFiyat(int fiyat) {
        this.fiyat = fiyat;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getStokBilgisi() {
        return stokBilgisi;
    }

    public void setStokBilgisi(int stokBilgisi) {
        this.stokBilgisi = stokBilgisi;
    }
}
