package tn.tuniprob.gestionEmployee;

public class Responsable extends Employee{
    private float prime;

    public Responsable(float prime) {
        this.prime = prime;
    }
    public Responsable() {}

    public Responsable(int id, String nom, String adresse, int nb_heure, float prime) {
        super(id, nom, adresse, nb_heure);
        this.prime = prime;
    }
    public double calculSalaire (){
        return this.getNb_heure()-160>0?(this.getNb_heure()-160)*12+160*10+prime:this.getNb_heure()*10+prime;
    }

    public float getPrime() {
        return prime;
    }

    public void setPrime(float prime) {
        this.prime = prime;
    }
}
