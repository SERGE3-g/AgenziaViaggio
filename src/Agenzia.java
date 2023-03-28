

public class Agenzia {
    public static void main(String[] args) {
        System.out.println("--------------------------------------------");
        System.out.println("| BENVENUTO NELLA NOSTRA AGENZIA DI VIAGGI |");
        System.out.println("-------------------------------------------- \n");
        Cliente cliente = new Cliente("Serge", "Guea", " gueaserge2@gmail.com", " 3892978507");
        Viaggio viaggio = new Viaggio("Londra", " 12/04/2030", 5, 5000.0);
        Prenotazione prenotazione = new Prenotazione(viaggio, cliente.getNome(), 2);
        AgenziaViaggio agenziaViaggio = new AgenziaViaggio();
        agenziaViaggio.aggiungiViaggio(viaggio);
        agenziaViaggio.visualizzaViaggiDisponibili();
        agenziaViaggio.effettuaPrenotazione(viaggio, cliente.getNome(), prenotazione.getNumeroPersone());
        agenziaViaggio.visualizzaPrenotazioni();
        System.out.println("\n============================================\n");

        Cliente cliente2 = new Cliente("Frank", "Guea", "", " 3892978510");
        Viaggio viaggio2 = new Viaggio("Abidjan", " 22/10/2023", 5, 2000.0);
        Prenotazione prenotazione2 = new Prenotazione(viaggio2, cliente2.getNome(), 2);
        AgenziaViaggio agenziaViaggio2 = new AgenziaViaggio();
        agenziaViaggio2.aggiungiViaggio(viaggio2);
        agenziaViaggio2.visualizzaViaggiDisponibili();
        agenziaViaggio2.effettuaPrenotazione(viaggio2, cliente2.getNome(), prenotazione2.getNumeroPersone());
        agenziaViaggio2.visualizzaPrenotazioni();
        System.out.println("\n============================================\n");

        Cliente cliente3 = new Cliente("Rosita", "Rosita", "rosi@gmail.com", " 3592978507");
        Viaggio viaggio3 = new Viaggio("Paris", " 15/06/2023", 10, 3000.0);
        Prenotazione prenotazione3 = new Prenotazione(viaggio3, cliente3.getNome(), 2);
        AgenziaViaggio agenziaViaggio3 = new AgenziaViaggio();
        agenziaViaggio3.aggiungiViaggio(viaggio3);
        agenziaViaggio3.visualizzaViaggiDisponibili();
        agenziaViaggio3.effettuaPrenotazione(viaggio3, cliente3.getNome(), prenotazione3.getNumeroPersone());
        agenziaViaggio3.visualizzaPrenotazioni();
        System.out.println("\n============================================\n");


    }
}