package Ejercicio2;

public class EsConsonanteException extends Exception {
    public EsConsonanteException(){
        super("Es consonante");
    }

    public EsConsonanteException(String mensaje){
        super(mensaje);
    }
}

