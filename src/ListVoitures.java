import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListVoitures {
    private List<Voiture> voitures;

    public ListVoitures(List<Voiture> voitures) {
        this.voitures = new ArrayList<>(voitures);
    }
    public ListVoitures() {
        this.voitures = new ArrayList<>();
    }
    public List<Voiture> getVoitures() {
        return voitures;
    }
    public void setVoitures(List<Voiture> voitures) {
        this.voitures = voitures;
    }
    public void ajoutVoiture(Voiture v) throws VoitureException {
        if (!voitures.contains(v)) {
            voitures.add(v);
        } else {
            throw new VoitureException("La voiture existe déjà dans la liste.");
        }
    }
    public void supprimeVoiture(Voiture v) throws VoitureException {
        if (voitures.contains(v)) {
            voitures.remove(v);
        } else {
            throw new VoitureException("La voiture n'existe pas dans la liste.");
        }
    }

    public Iterator<Voiture> iterateur() {
        return voitures.iterator();
    }

    public int size() {
        return voitures.size();
    }

    public void affiche() {
        for (Voiture v : voitures) {
            System.out.println("Immatriculation: " + v.getImmariculation() +
                    ", Marque: " + v.getMarque() +
                    ", Prix: " + v.getPrixLocation());
        }
    }
}
