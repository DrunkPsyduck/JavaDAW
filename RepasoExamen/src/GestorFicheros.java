import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class GestorFicheros {

    private static final String ficheroBinario = "FicheroBinario";
    private static final String ficheroTexto = "FicheroTexto";

    public static void leerFicheroTXT(Gestor g) throws IOException{
        File file = new File(ficheroTexto);

        BufferedReader bf = new BufferedReader(new FileReader(file));

        String cadena = bf.readLine();

        while (cadena !=null){
            String trozos[] = cadena.split(";");
            if (trozos[0].equalsIgnoreCase("H")){
                if (trozos.length == 6){
                    g.lista.add(new Hoteles(trozos[1], trozos[2], Integer.parseInt(trozos[3]), Integer.parseInt(trozos[4]), trozos[5]));
                }
            } else if (trozos[0].equalsIgnoreCase("A")){
                if (trozos.length == 6){
                    g.lista.add(new Apartamentos(trozos[1], trozos[2], Integer.parseInt(trozos[3]), Integer.parseInt(trozos[4]), trozos[5]));

                }
            }
            cadena = bf.readLine();
        }
        bf.close();//bien importante cerrar flujos
    }

    public static void escribirTXT(Gestor g) throws  IOException{
        File file = new File(ficheroTexto);

        PrintWriter pw = null;

        if (!file.exists()){
            file.createNewFile();
        }

        pw = new PrintWriter(file);

        for (int i = 0; i < g.lista.size(); i++) {
            pw.println(g.lista.get(i).toStringFichero());
        }
        pw.close();
    }

    public void escribirBinario(Gestor g)throws IOException{
        File file = new File(ficheroBinario);
        FileOutputStream fos = null;
        ObjectOutputStream salida = null;

        if(file.exists()){
            fos = new FileOutputStream(file);
            salida = new ObjectOutputStream(fos);

            salida.writeObject(g.lista);

            salida.close();//cerrar
        }

    }

    public ArrayList<Alojamientos> leerBinario(Gestor g) throws IOException, ClassNotFoundException {
        File file = new File(ficheroBinario);
        ObjectInputStream entrada = null;

        ArrayList<Alojamientos> aux = null;

        if(file.exists()){
            entrada = new ObjectInputStream(new FileInputStream(file));
            aux = new ArrayList<>();

            aux = (ArrayList<Alojamientos>) entrada.readObject();

            entrada.close();//!!!!!CERRAR SIEMPRE
        }

        return aux;
    }
}
