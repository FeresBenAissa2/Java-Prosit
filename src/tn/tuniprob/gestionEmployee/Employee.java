package tn.tuniprob.gestionEmployee;

public abstract class Employee {
    private int id ;
    private String nom ;
    private String adresse;
    private int nb_heure;
    public  Employee() {

    }
    public Employee(int id, String nom, String adresse, int nb_heure) {
        this.id = id;
        this.nom = nom;
        this.adresse = adresse;
        this.nb_heure = nb_heure;
    }
    public void AfficherEmployee(){
        System.out.println("l'id : "+id+" nom : "+nom+ " adresse : "+adresse+" nb heure : "+nb_heure);

    }

    public abstract double calculSalaire ();
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public int getNb_heure() {
        return nb_heure;
    }

    public void setNb_heure(int nb_heure) {
        this.nb_heure = nb_heure;
    }
    public boolean equals(Object o){
        if (o instanceof Employee) {
            Employee e = (Employee) o;
            return this.id==e.getId()&&this.nom.equals(e.getNom())?true:false;
        }else {
            return false;
        }


    }

}
