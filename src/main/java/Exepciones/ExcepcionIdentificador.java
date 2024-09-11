package Exepciones;

public abstract class ExcepcionIdentificador extends Exception {
    public ExcepcionIdentificador(String sms) {
        super(sms);
    }
}
