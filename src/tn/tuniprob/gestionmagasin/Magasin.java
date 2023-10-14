package tn.tuniprob.gestionmagasin;

import tn.tuniprob.exception.MagasinPleinException;
import tn.tuniprob.gestionEmployee.Caissier;
import tn.tuniprob.gestionEmployee.Employee;
import tn.tuniprob.gestionEmployee.Responsable;
import tn.tuniprob.gestionEmployee.Vendeur;

public class Magasin {
    static int NBR_PRODUIT = 0;
    int id;
    String address;
    String nom;
    int capacite;
    int capaciteEmp;

    Produit[] produits;
    Employee[] employees;

    public Magasin() {
        this.produits = new Produit[2];
        this.employees = new Employee[20];
        this.capacite = 0;
        this.capaciteEmp = 0;

    }

    public Magasin(int id, String address, String nom) {
        this.id = id;
        this.address = address;
        this.nom = nom;
        this.produits = new Produit[2];
        this.employees = new Employee[20];
        this.capacite = 0;
        this.capaciteEmp = 0;

    }

    public void ajouterProduit(Produit p) {
        NBR_PRODUIT++;
        if (capacite < produits.length) {
            produits[capacite] = p;
            capacite++;
        } else {
            System.out.println("tn.tuniprob.gestionmag.Magasin is full. Cannot add more products.");
        }
    }
    public void ajouterProduitExceptionTest(Produit p) throws MagasinPleinException {

        if (capacite < produits.length) {
            produits[capacite] = p;
            capacite++;
        } else {
           throw new MagasinPleinException("");
        }
    }
    public void ajouterEmployee(Employee e) {
        if (capaciteEmp < employees.length) {
            employees[capaciteEmp] = e;
            capaciteEmp++;
        } else {
            System.out.println("pas d'espacce ");
        }

    }

    public void ajouterProduitSeulFois(Produit p) {
        NBR_PRODUIT++;
        if (!this.rechercheProduit(p)) {
            if (capacite < produits.length) {
                // recherche si l'element existe ou non
                produits[capacite] = p;
                capacite++;
            } else {
                System.out.println("tn.tuniprob.gestionmag.Magasin is full. Cannot add more products.");
            }
        } else System.out.println("produit id used ");

    }

    public void afficher() {
        for (int i = 0; i < capacite; i++) {
            System.out.println("produits p : " + i + " " + produits[i].getLib());
        }
        for (int j = 0; j < capaciteEmp; j++) {
            System.out.println("employees e : " + j + " " + employees[j].getNom() + " " + employees[j].getAdresse());
        }
    }

    public void afficherSalairePourChaqueEmployee() {

        for (int j = 0; j < capaciteEmp; j++) {
            System.out.println("employees e : " + j + " ->  salaire :  " + employees[j].calculSalaire() + " ");
        }
    }

    public String toString() {
        return

                "Magasin id : " + Integer.toString(this.id) + "\n" + "Address" + this.address;
    }

    public boolean rechercheProduit(Produit p) {
        int i = 0;
        while (i < capacite) {
            if (produits[i].comparerSeul(p)) return true;
            i++;
        }
        return false;
    }

    public void supprimerProduit(Produit p) {
        if (!this.rechercheProduit(p)) System.out.println("product not found");
        else {
            // il faut tranformer le tableau en element de type liste
            Produit[] produits2 = new Produit[capacite - 1];
            int i = 0;
            int j = 0;
            while (j < capacite - 1) {
                produits2[j] = produits[i];
                if (produits[i].getId() == p.getId()) {
                    j++;
                } else {
                    j++;
                    j++;
                }
            }
            this.capacite -= 1;
            this.produits = produits2;
        }
    }

    public static Magasin magasinPlusProduit(Magasin m1, Magasin m2) {
        if (m1.capacite > m2.capacite) {
            return m1;
        } else if (m1.capacite < m2.capacite) {
            return m2;
        }
        return null;
    }

    public void afficheSalaire() {
        System.out.println("------ Magasin " + this.id + "-------");
        for (int i = 0; i < capaciteEmp; i++) {
            System.out.println(employees[i].calculSalaire());
        }
    }

    public void affichePrimeResponsable() {
        System.out.println("------ Prime - Magasin  " + this.id + "-------");

        for (int i = 0; i < capaciteEmp; i++) {
            if (employees[i] instanceof Responsable)
                System.out.println(((Responsable) employees[i]).getPrime());
        }

    }

    public void afficherEmployeeParType() {
        int countResponsable = 0;
        int countCaissier = 0;
        int countVendeur = 0;
        for (int i = 0; i < capaciteEmp; i++) {
            if (employees[i] instanceof Responsable) countResponsable++;
            else if (employees[i] instanceof Vendeur) {
                countVendeur++;
            } else if (employees[i] instanceof Caissier) {
                countCaissier++;
            }
        }
        System.out.println("--------Magasin "+this.id+" -----------");
        System.out.println("Nb Responsable = "+ countResponsable);
        System.out.println("Nb Vendeur = "+ countVendeur);
        System.out.println("Nb Caissier = "+ countCaissier);

    }

}