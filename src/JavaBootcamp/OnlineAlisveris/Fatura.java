package JavaBootcamp.OnlineAlisveris;

public class Fatura {
    private int faturaId;
    private int siparisId;

    public Fatura(int faturaId, int siparisId) {
        this.faturaId = faturaId;
        this.siparisId = siparisId;
    }

    public int getFaturaId() {
        return faturaId;
    }

    public void setFaturaId(int faturaId) {
        this.faturaId = faturaId;
    }

    public int getSiparisId() {
        return siparisId;
    }

    public void setSiparisId(int siparisId) {
        this.siparisId = siparisId;
    }
}
