import tn.tuniprob.gestionEmployee.Caissier;
import tn.tuniprob.gestionEmployee.Responsable;
import tn.tuniprob.gestionEmployee.Vendeur;
import tn.tuniprob.gestionmagasin.Magasin;
import tn.tuniprob.gestionmagasin.Produit;

public class Main {
    public static void main(String[] args) {
        Produit p1 = new Produit();
        Produit p2 = new Produit(1021, "Lait", "Delice", 1350);
        Produit p3 = new Produit(2510, "Yaourt", "Vitalait", 550);
        Produit p4 = new Produit(3250, "Tomate,,", "Sicam", 1200);
        Produit p5 = new Produit(1025, "Lait", "Delice", 1350);


        //   p2.afficher();
        //  p2.prix=700;
        //  p2.afficher();
        // System.out.println(p2.toString());
        // Date d = new Date();
        //p2.dateExp=d;
        // p2.afficher();


        Magasin m1 = new Magasin();
        Magasin m2 = new Magasin();

        m1.ajouterProduit(p2);
        m1.ajouterProduit(p3);
        m1.ajouterProduit(p4);
        m1.ajouterProduit(p4);

        m1.supprimerProduit(p2);
        m1.afficher();
        //m1.ajouterProduit(p5);

        //m1.afficher();
        // System.out.println(m1.NBR_PRODUIT);

        //System.out.println(p1.comparerSeul(p5));
        //System.out.println(tn.tuniprob.gestionmag.Produit.comparerDeux(p5, p2));
        // System.out.println(m1.rechercheProduit(p2));
        //m1.ajouterProduitSeulFois(p2);
        // System.out.println(tn.tuniprob.gestionmag.Magasin.magasinPlusProduit(m1,m2));

        // prosit 4

        Magasin magasin1 = new Magasin(1, " Carrefour", "Centre-Ville");
        Magasin magasin2 = new Magasin(2, "Monoprix", "Menzah 6");

        System.out.println(magasin1);
       // premiere magasin
        Caissier caissier1M1 = new Caissier(1,"feres","hlif",20,1);
        Caissier caissier2M1 = new Caissier(2,"zaineb","zahra",200,2);
        Vendeur vendeur1M1 = new Vendeur(1,"mounir","hlif",20,50);
        Responsable responsable1M1 = new Responsable(1,"mounir","hlif",20,200);
        // deuxieme magasin
        Caissier caissier1M2 = new Caissier(1,"feres","hlif",20,1);
        Vendeur vendeur1M2 = new Vendeur(1,"mounir","hlif",20,50);
        Vendeur vendeur2M2 = new Vendeur(1,"mounir","hlif",20,50);
        Vendeur vendeur3M2 = new Vendeur(1,"mounir","hlif",20,50);
        Responsable responsable1M2 = new Responsable(1,"mounir","hlif",20,200);


        caissier1M2.AfficherEmployee();
        magasin1.ajouterProduit(p2);
        magasin1.ajouterProduit(p3);
        magasin1.ajouterEmployee(caissier1M1);
        magasin1.ajouterEmployee(caissier2M1);
        magasin1.ajouterEmployee(vendeur1M1);
        magasin1.ajouterEmployee(responsable1M1);

        magasin2.ajouterProduit(p2);
        magasin2.ajouterProduit(p3);
        magasin1.ajouterEmployee(caissier1M2);
        magasin1.ajouterEmployee(vendeur1M2);
        magasin1.ajouterEmployee(vendeur2M2);
        magasin1.ajouterEmployee(vendeur3M2);
        magasin1.ajouterEmployee(responsable1M2);

        magasin1.afficher();
        magasin1.afficheSalaire();
        magasin1.afficherSalairePourChaqueEmployee();
        magasin1.affichePrimeResponsable();
        magasin1.afficherEmployeeParType();
        System.out.println(caissier2M1.equals(caissier1M1));




    }
}