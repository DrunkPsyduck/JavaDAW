package FicherosBinarios0;
import java.util.ArrayList;
public class Gestor {

    protected ArrayList<Usuarios>usuarios;

    public Gestor(){
        usuarios = new ArrayList<>();

    }

    public Gestor(ArrayList<Usuarios> usuarios) {
        this.usuarios = usuarios;
    }

    public void nuevoUsuario(){
        System.out.println("Nombre");
        String nombre = EntradaSalida.leerTexto();
        System.out.println("apellido");
        String apellido = EntradaSalida.leerTexto();
        System.out.println("Edad");
        int edad = EntradaSalida.leerEnteros();
        System.out.println("CiudaD");
        String ciudad = EntradaSalida.leerTexto();

        usuarios.add(usuarios.size(), new Usuarios(nombre,apellido,edad,ciudad));
    }

    public void mostrarusuarios(){
        for (int i = 0; i < usuarios.size(); i++) {
            System.out.println(usuarios.get(i));
        }
    }
}
