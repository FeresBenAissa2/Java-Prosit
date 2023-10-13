package tn.tuniprob.gestionException;

import java.util.Scanner;

public class DivisionException {
    static int x = 20;
    static int y;

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println(" Enter un entier");
            y = scanner.nextInt();
            System.out.println(x / y);

        } catch (ArithmeticException ar) {
            System.out.println("zaineb mchet l sidi bou el bereh ");

        } catch (Exception ex) {
            System.out.println("edes edes");
        }


    }
}
