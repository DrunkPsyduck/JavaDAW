package Ejercicio2;

public class EsVocalException extends Exception {
    public EsVocalException(){
        super("Es vocal");
    }

    public EsVocalException(String mensaje){
        super(mensaje);
    }

    public EsVocalException(char caracter1) {
    }
}
