package tn.tuniprob.gestionEmployee;

public class Vendeur extends Employee{
    private int tauxDeVente;

    public Vendeur(int tauxDeVente) {
        this.tauxDeVente = tauxDeVente;
    }
    public Vendeur() {}

    public Vendeur(int id, String nom, String adresse, int nb_heure, int tauxDeVente) {
        super(id, nom, adresse, nb_heure);
        this.tauxDeVente = tauxDeVente;
    }
    public double calculSalaire (){
        return (double) (450 * this.tauxDeVente) /100+450;
    }

    public int getTauxDeVente() {
        return tauxDeVente;
    }

    public void setTauxDeVente(int tauxDeVente) {
        this.tauxDeVente = tauxDeVente;
    }
}
