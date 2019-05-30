package RepasoExamen;
import java.io.*;
import java.util.ArrayList;
public class GestorFicheros {
    
    public static final String archivo = "Fichero3.dat";
    
    public GestorFicheros(){
        
    }
    
    public void generarFichero() throws IOException{
        File file = new File(archivo);
        
        if (!file.exists()){
            file.createNewFile();
        }
    }
    
    public ArrayList<Alquileres> leerFichero() throws IOException, ClassNotFoundException {
        File file = new File(archivo);
        
        FileInputStream fis = null;
        ObjectInputStream entrada = null;
        ArrayList<Alquileres> lista = null;
        
        if (file.exists()){
            fis = new FileInputStream(file);
            entrada = new ObjectInputStream(fis);
            
            lista = (ArrayList<Alquileres>) entrada.readObject();
            entrada.close();
        }
        
        return lista;
    }
    
    public void escribirFichero(Gestor g) throws IOException{
        File file = new File(archivo);
        
        FileOutputStream fos = null;
        ObjectOutputStream salida = null;
        
        if (file.exists()){
            fos = new FileOutputStream(file);
            salida = new ObjectOutputStream(fos);
            
            salida.writeObject(g.alquiler);

            salida.close();
        }
    }

}
