import java.util.*;

public class Main {
    public static void main(String[] args) {
        try {
            Agence agence = new Agence("Agence de Location");

            Voiture voiture1 = new Voiture(1, "Toyota", 100);
            Voiture voiture2 = new Voiture(2, "Honda", 120);

            agence.ajoutVoiture(voiture1);
            agence.ajoutVoiture(voiture2);


            Client client1 = new Client(123, "John", "Doe");
            Client client2 = new Client(456, "Alice", "Smith");

            agence.loueClientVoiture(client1, voiture1);
            agence.loueClientVoiture(client2, voiture2);
            System.out.println("\nClients et leurs voitures louées:");
            agence.afficheLesClientsEtLeursListesVoitures();
            agence.retourClientVoiture(client1, voiture1);
            agence.retourClientVoiture(client2, voiture2);
            System.out.println("\nClients et leurs voitures louées après retour:");
            agence.afficheLesClientsEtLeursListesVoitures();
            System.out.println("\nClients triés par code croissant:");
            for (Client client : agence.triCodeCroissant().keySet()) {
                ListVoitures listeVoitures = agence.triCodeCroissant().get(client);
                System.out.println(client.getCode() + ": " + listeVoitures.getVoitures());
            }

        } catch (VoitureException e) {
            System.err.println("Erreur: " + e.getMessage());
        }
    }
}
