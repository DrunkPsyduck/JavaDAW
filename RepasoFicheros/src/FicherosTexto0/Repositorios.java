package FicherosTexto0;

public class Repositorios {

    private String nombre;
    private String usuario;

    public Repositorios(String nombre, String usuario) {
        this.nombre = nombre;
        this.usuario = usuario;
    }



    @Override
    public String toString() {
        return "Repositorios{" +
                "nombre='" + nombre + '\'' +
                ", usuario='" + usuario + '\'' +
                '}';
    }
}
