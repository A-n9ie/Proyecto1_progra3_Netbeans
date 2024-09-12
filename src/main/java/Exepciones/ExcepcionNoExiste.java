package Exepciones;

public class ExcepcionNoExiste extends ExcepcionIdentificador {
    public ExcepcionNoExiste() {
        super("El dato ingresado NO existe. " +
                "\nVerifique la informacion e intentelo nuevamente...");
    }
}