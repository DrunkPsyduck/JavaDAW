package ejemploproyectotxt;

import java.io.IOException;
import java.util.TreeSet;
import java.util.logging.Level;
import java.util.logging.Logger;


public class EjemploProyectoTXT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        GestorPlaya g = new GestorPlaya();

        for (int i = 0; i < 5; i++) {
            TreeSet<Double> valoraciones = new TreeSet();
            valoraciones.add(3.0);
            valoraciones.add(5.0);
            g.altaPlaya(new Cala("playita"+i,1000*i,valoraciones,true));
        }
        TreeSet<Double> valoraciones = new TreeSet();
        valoraciones.add(3.0);
        g.altaPlaya(new PlayaGrande("playaGrande",100000,valoraciones,"verde"));
        try {
            GestionFicheros.escribirFichero(g.lista);
        } catch (IOException ex) {
            Logger.getLogger(EjemploProyectoTXT.class.getName()).log(Level.SEVERE, null, ex);
        }
        g.eliminarPlaya("playita1");
        System.out.println(g.lista);
        try {
            g.lista=GestionFicheros.leerFichero();
        } catch (IOException ex) {
            Logger.getLogger(EjemploProyectoTXT.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println(g);
        System.out.println(g.lista);
    }

}
