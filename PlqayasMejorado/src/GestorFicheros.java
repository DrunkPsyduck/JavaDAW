import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class GestorFicheros {

    public static final String ficheroPlayasBinario = "ficheroPlayasBinario.dat";
    public static final String ficheroPlayasTexto = "FicheroPlayasTexto.txt";

    public GestorFicheros() {
    }

    public ArrayList<Playas> leerFichero() throws IOException, ClassNotFoundException {
        File fichero = new File(ficheroPlayasBinario);
        FileInputStream fis = null;
        ObjectInputStream entrada = null;
        ArrayList <Playas> lista = null;
        if (fichero.exists() && fichero.length() > 0) {
            fis = new FileInputStream(fichero);
            entrada = new ObjectInputStream(fis);

            lista = (ArrayList<Playas>) entrada.readObject();
            entrada.close();
        }
        return lista;
    }

    public void escribirFichero(Gestor gestor) throws IOException, ClassNotFoundException{
        File fichero = new File(ficheroPlayasBinario);
        FileOutputStream fos;
        ObjectOutputStream salida;
        if(fichero.exists()&& fichero.length()>0){
            fos = new FileOutputStream(fichero);
            salida  = new ObjectOutputStream(fos);

            salida.writeObject(gestor.playas);
        }
    }

    public static void escribirFichero(ArrayList<Playas> lista) throws IOException{
        File ficheroPlano= new File(ficheroPlayasTexto);
        PrintWriter pw = new PrintWriter(ficheroPlano);

        for (int i = 0; i < lista.size(); i++) {
            pw.println(lista.get(i).toString());
        }
        pw.close();
    }

    public static ArrayList<Playas> leerFicheroTexto() throws IOException, FileNotFoundException{

        File archivo = new File(ficheroPlayasTexto);

        ArrayList<Playas> al = new ArrayList<>();
        Scanner lector = new Scanner(archivo);

        while (lector.hasNext()){
            String cadena = lector.nextLine();
            String [] trozos = cadena.split(";");

            if (trozos[0].equalsIgnoreCase("C")){
                String nombre = trozos[1];
                /* todos los constructores /*/
            }

        }
        return al;
    }

}
