package JavaBootcamp.OnlineAlisveris;

import java.util.ArrayList;

public class Musteri {
    private int musteriId;
    private String MusteriIsim;
    private int MusteriYas;
    private static int toplamMusteri;
    private ArrayList<Siparis> siparis;

    public Musteri(int musteriId,String musteriIsim, int musteriYas, ArrayList<Musteri> Musteriler, int toplamMusteri) {
        setMusteriId(musteriId);
        setMusteriIsim(musteriIsim);
        setMusteriYas(musteriYas);
        setSiparis(siparis);
        setToplamMusteri(toplamMusteri);
    }

    public int getMusteriId() {
        return musteriId;
    }

    public void setMusteriId(int musteriId) {
        this.musteriId = musteriId;
    }

    public String getMusteriIsim() {
        return MusteriIsim;
    }

    public void setMusteriIsim(String musteriIsim) {
        MusteriIsim = musteriIsim;
    }

    public int getMusteriYas() {
        return MusteriYas;
    }

    public void setMusteriYas(int musteriYas) {
        MusteriYas = musteriYas;
    }

    public static int getToplamMusteri() {
        return toplamMusteri;
    }

    public static void setToplamMusteri(int toplamMusteri) {
        Musteri.toplamMusteri = toplamMusteri;
    }

    public ArrayList<Siparis> getSiparis() {
        return siparis;
    }

    public void setSiparis(ArrayList<Siparis> siparis) {
        this.siparis = siparis;
    }

    public void siparisEkleme(int siparisId){
        if(siparisId==0){
            getSiparis().add(new Siparis(siparisId));
            System.out.println("Siparis numaranız: " + siparisId);
        }else{
            System.out.println("Siparis numaranız nulunmaktadır: " + siparisId);
        }
    }

    public void urunEkle(String kategori, int fiyat, String isim, int stokBilgisi){

   }



}
