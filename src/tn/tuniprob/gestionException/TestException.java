package tn.tuniprob.gestionException;

import java.io.*;

public class TestException {
    public static void main(String[] args) throws FileNotFoundException,IOException {
   // try{
        //Open the Input file
        File inputFile = new File("Sample.jpg");
        //Open the Output file
        File outputFile1 = new File("Output1.jpg");

        //Get file handlers in Byte Stream format
        FileInputStream in1 = new FileInputStream(inputFile) ;
        FileOutputStream out1 = new FileOutputStream(outputFile1);

        int c1;

        while ((c1 = in1.read()) != -1){   //Until end of file
            out1.write(c1);
        }

        //Close the files
        in1.close();
        out1.close();

  /*  } catch (FileNotFoundException f){
        System.out.println("FileNotFoundException");
    } catch (IOException Ioe){
        System.out.println("The file you have requested cannot be found.");
    }catch (Exception ex){
        System.out.println("Exception");
    }
    finally {
        System.out.println("do nothing");
    }*/


    }
}
