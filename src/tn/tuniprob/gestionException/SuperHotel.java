package tn.tuniprob.gestionException;

public class SuperHotel {
    static int x[];
    public void reserver(){
        try{
            x[0] = 1;
        }catch (NullPointerException e){
            System.out.println("null exception");
        }
    }

}
