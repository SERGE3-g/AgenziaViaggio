public class Prenotazione {
    private Viaggio viaggio;
    private String nomeCliente;
    private int numeroPersone;

    public Prenotazione(Viaggio viaggio, String nomeCliente, int numeroPersone) {
        this.viaggio = viaggio;
        this.nomeCliente = nomeCliente;
        this.numeroPersone = numeroPersone;
    }

    public Viaggio getViaggio() {
        return viaggio;
    }

    public void setViaggio(Viaggio viaggio) {
        this.viaggio = viaggio;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public int getNumeroPersone() {
        return numeroPersone;
    }

    public void setNumeroPersone(int numeroPersone) {
        this.numeroPersone = numeroPersone;
    }
}