package JavaBootcamp.OnlineAlisveris;

import java.util.ArrayList;

public class Siparis {
    private int siparisId;
    private ArrayList<Musteri>musteri;
    private ArrayList<Fatura>fatura;

    public Siparis(int siparisId) {
        this.siparisId = siparisId;
    }

    public Siparis(int siparisId, ArrayList<Musteri> musteri, ArrayList<Fatura> fatura) {
        this.siparisId = siparisId;
        this.musteri = musteri;
        this.fatura = fatura;
    }

    public void musteriEkle(int musteriId,String musteriIsim, int musteriYas, ArrayList<Musteri> Musteriler){

    }

    public void faturaEkle(int faturaId, int siparisId){

    }

    public int getSiparisId() {
        return siparisId;
    }

    public void setId(int siparisId) {
        this.siparisId = siparisId;
    }

    public ArrayList<Musteri> getMusteri() {
        return musteri;
    }

    public void setMusteri(ArrayList<Musteri> musteri) {
        this.musteri = musteri;
    }

    public ArrayList<Fatura> getFatura() {
        return fatura;
    }

    public void setFatura(ArrayList<Fatura> fatura) {
        this.fatura = fatura;
    }
}
