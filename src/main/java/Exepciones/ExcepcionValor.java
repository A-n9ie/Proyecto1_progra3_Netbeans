package Exepciones;

public class ExcepcionValor extends Exception {
    public ExcepcionValor(){
        super("El valor no es valido." +
                "Intentelo nuevamente.");
    }
}
