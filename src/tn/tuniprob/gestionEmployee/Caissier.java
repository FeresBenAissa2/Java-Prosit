package tn.tuniprob.gestionEmployee;

public class Caissier extends Employee {
    private int numeroDeCaisse;

    public Caissier(int id, String nom, String adresse, int nb_heure, int numeroDeCaisse) {
        super(id, nom, adresse, nb_heure);
        this.numeroDeCaisse = numeroDeCaisse;
    }
    public double calculSalaire (){
        return this.getNb_heure()-180>0?(this.getNb_heure()-180)*5.75+180*5:this.getNb_heure()*5;
    }

    public int getNumeroDeCaisse() {
        return numeroDeCaisse;
    }

    public void setNumeroDeCaisse(int numeroDeCaisse) {
        this.numeroDeCaisse = numeroDeCaisse;
    }
}
