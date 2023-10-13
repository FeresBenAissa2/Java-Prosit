package tn.tuniprob.gestionException;

public class AppelMethod {
    public void method1(){
        this.method2();
    }

    public void method2(){
        this.method1();
    }

    public static void main(String[] args) {
       try {
            AppelMethod appel = new AppelMethod();
            appel.method1();
        }catch (StackOverflowError e){

            System.out.println("StackOverflowError ");
      }

    }
}
