package Empleados;
import java.io.*;
import java.util.ArrayList;

public class GestorFicheros {
    private static final String nombreFichero = ("FicheroTXT");

    public GestorFicheros(){
    }

    public void escribirFichero(ArrayList<Trabajador> lista) throws IOException{
        File fichero = new File(nombreFichero);

        //Scanner lector = new Scanner(fichero);
        PrintWriter pw = new PrintWriter(fichero);
        for (int i = 0; i < lista.size(); i++) {
            pw.println(lista.get(i).toString());
        }
        pw.close();
    }

    public ArrayList<String> leerFichero() throws IOException{
        File archivo = new File(nombreFichero);


        BufferedReader br = new BufferedReader(new FileReader(archivo));

        ArrayList<String> lista = new ArrayList<>();
        while(br.readLine()!=null){
            lista.add(lista.size(), br.readLine());
        }

        return lista;
    }
}
