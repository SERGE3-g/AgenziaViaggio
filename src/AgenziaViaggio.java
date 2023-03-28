import java.util.ArrayList;
import java.util.List;

public class AgenziaViaggio {
    private List<Viaggio> viaggiDisponibili;
    private List<Prenotazione> prenotazioni;

    public AgenziaViaggio() {
        viaggiDisponibili = new ArrayList<>();
        prenotazioni = new ArrayList<>();
    }

    public void aggiungiViaggio(Viaggio viaggio) {
        viaggiDisponibili.add(viaggio);
    }

    public void visualizzaViaggiDisponibili() {
        System.out.println("Viaggi disponibili:");
        for (Viaggio viaggio : viaggiDisponibili) {
            System.out.println(viaggio.getDestinazione() + ", " + viaggio.getDataPartenza() + ", " + viaggio.getDurata() + " giorni, " + viaggio.getPrezzo() + " euro");
        }
    }

    public void effettuaPrenotazione(Viaggio viaggio, String nomeCliente, int numeroPersone) {
        Prenotazione prenotazione = new Prenotazione(viaggio, nomeCliente, numeroPersone);
        prenotazioni.add(prenotazione);
        System.out.println("Prenotazione effettuata per " + nomeCliente);
    }

    public void visualizzaPrenotazioni() {
        System.out.println("Prenotazioni effettuate:");
        for (Prenotazione prenotazione : prenotazioni) {
            System.out.println(prenotazione.getViaggio().getDestinazione() + ", " + prenotazione.getViaggio().getDataPartenza() + ", " + prenotazione.getViaggio().getDurata() + " giorni, " + prenotazione.getViaggio().getPrezzo() + " euro, " + prenotazione.getNomeCliente() + ", " + prenotazione.getNumeroPersone() + " persone");
        }
    }
}