package FicherosBinarios2;
import java.util.ArrayList;
public class Gestor {

    protected ArrayList<Persona> persona;

    public Gestor(){
        persona = new ArrayList<>();
    }

    public Gestor(ArrayList<Persona> persona) {
        this.persona = persona;
    }

    //nuevo usuario
    public void nuevoUsuario(){
        persona.add(persona.size(), new Persona(nombres(),apellidos(), edad() ));
    }

    public void mostrarPersona(){
        for (int i = 0; i < persona.size(); i++) {
            System.out.println(persona.get(i));
        }
    }


    //genersar nombre

    public String nombres(){
        String [] nombres = new String[]{"Elon", "Steve", "Mark" , "Donald", "Pepe"};
        int rnd = (int)(Math.random()*nombres.length);

        return nombres[rnd];
    }

    public String apellidos(){
        String apellidos[] = new String[]{"Musk", "Wozniak", "Divine", "Trump", "Pepito"};
        int rnd = (int)(Math.random()*apellidos.length);

        return apellidos[rnd];
    }

    public int edad(){
        int edad = (int)(Math.random()*100);
        return edad;
    }
}
