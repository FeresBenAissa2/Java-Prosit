package tn.tuniprob.gestionException;

public class AddTable {
    public static void main(String[] args) {

        try{
            int[] array = new int[3];
            for(int i=0;i<4;++i){
                array[i] = i;
            }
            System.out.println(array);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException");
        }

    }
}
