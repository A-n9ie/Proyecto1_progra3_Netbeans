package Exepciones;

public class ExcepcionExistencia extends Exception {
    public ExcepcionExistencia() {
        super("El valor a comprar sobrepasa la existencia del producto." +
                "\nIntentelo nuevamente...");
    }
}
