public class Excepcion extends Exception {

    public Excepcion(){
        super("VAloracion no válida");
    }

    public Excepcion (int valor){
        super("No valido");
    }
}
