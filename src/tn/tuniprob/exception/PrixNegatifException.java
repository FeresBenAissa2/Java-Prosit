package tn.tuniprob.exception;

public class PrixNegatifException extends ArithmeticException{
    public PrixNegatifException (String str) {
        super(str);
    }
}
