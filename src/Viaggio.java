public class Viaggio {
    private String destinazione;
    private String dataPartenza;
    private int durata;
    private double prezzo;

    public Viaggio(String destinazione, String dataPartenza, int durata, double prezzo) {
        this.destinazione = destinazione;
        this.dataPartenza = dataPartenza;
        this.durata = durata;
        this.prezzo = prezzo;
    }

    public String getDestinazione() {
        return destinazione;
    }

    public void setDestinazione(String destinazione) {
        this.destinazione = destinazione;
    }

    public String getDataPartenza() {
        return dataPartenza;
    }

    public void setDataPartenza(String dataPartenza) {
        this.dataPartenza = dataPartenza;
    }

    public int getDurata() {
        return durata;
    }

    public void setDurata(int durata) {
        this.durata = durata;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }
}
