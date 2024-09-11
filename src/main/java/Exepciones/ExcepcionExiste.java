package Exepciones;

public class ExcepcionExiste extends ExcepcionIdentificador {
    public ExcepcionExiste() {
        super("El dato ingresado ya pertenece al sistema." +
                "\nVerifique la informacion e intentelo nuevamente...");
    }
}
