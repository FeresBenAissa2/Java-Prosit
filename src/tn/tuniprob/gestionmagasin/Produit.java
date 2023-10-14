package tn.tuniprob.gestionmagasin;

import tn.tuniprob.exception.PrixNegatifException;

import java.util.Date;

public class Produit {
    private int id;
    private String lib;
    private String marque;
    private float prix;
    private Date dateExp;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setLib(String lib) {
        this.lib = lib;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public void setPrix(
            float prix
    ) throws ArithmeticException {
        if (prix > 0)
            this.prix = prix;
        else
            throw new PrixNegatifException("");
    }

    public void setDateExp(Date dateExp) {
        this.dateExp = dateExp;
    }

    public String getLib() {
        return lib;
    }

    public String getMarque() {
        return marque;
    }

    public float getPrix() {
        return prix;
    }

    public Date getDateExp() {
        return dateExp;
    }


    public Produit() {
        this.id = 0;
        this.lib = "";
        this.marque = "";
        this.prix = 0.0f;
    }

    public Produit(int id, String lib, String marque, float prix) {
        if (prix < 0) throw new PrixNegatifException("");
        else {
            this.id = id;
            this.lib = lib;
            this.marque = marque;
            this.prix = prix;
        }

    }

    public Produit(int id, String lib, String marque, float prix, Date dateExp) {
        if (prix < 0) throw new PrixNegatifException("");
        else {
            this.id = id;
            this.lib = lib;
            this.marque = marque;
            this.prix = prix;
        }

    }

    public void afficher() {
        System.out.println(this.id + "--" + this.lib + "--" + this.marque + "--" + this.prix + "--" + this.dateExp);
    }

    public String toString() {
        return this.id + "--" + this.lib + "--" + this.marque + "--" + this.prix + "--" + this.dateExp;
    }

    public boolean comparerSeul(Produit p) {
        if (this.id != p.getId() && !this.lib.equals(p.getLib()) && this.prix != p.getPrix()) return false;
        else return true;
    }

    public static boolean comparerDeux(Produit p1, Produit p2) {
        if (p1.getId() != p2.getId() && !p1.getLib().equals(p2.getLib()) && p1.getPrix() != p2.getPrix()) return false;
        else return true;
    }

}
