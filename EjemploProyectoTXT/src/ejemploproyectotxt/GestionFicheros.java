package ejemploproyectotxt;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import ejemploproyectotxt.Playa;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author gema
 */
public class GestionFicheros {
    public static final String nombre = "ficheroTXT";
    
    
    
    public static void escribirFichero(TreeSet<Playa> lista) throws FileNotFoundException, IOException{
        File file = new File (nombre);
        PrintWriter pw = new PrintWriter(file);
        Iterator<Playa> it =  lista.iterator();
        while(it.hasNext()){
            pw.println(it.next().toStringFichero());
        }
        pw.close();
        
    }
    
    public static TreeSet<Playa> leerFichero() throws FileNotFoundException, IOException{
        File file = new File (nombre);
        TreeSet<Playa> t = new TreeSet();
        Scanner lector = new Scanner(file);
        while(lector.hasNextLine()){
            String cadena = lector.nextLine();
            String [] trozos= cadena.split(";");
            if (trozos[0].equalsIgnoreCase("C")){
                String nombre = trozos[1];
                double longitud = Double.parseDouble(trozos[2]);
                boolean acceso = Boolean.parseBoolean(trozos[4]);
                String tvaloraciones[]= trozos[3].split(",");
                TreeSet<Double> valoraciones = new TreeSet();
                for (int i = 0; i < tvaloraciones.length; i++) {
                    valoraciones.add(Double.parseDouble(tvaloraciones[i]));
                }
                t.add(new Cala(nombre,longitud,valoraciones,acceso));
            }
            //System.out.println(cadena);
            
        }    
        return t;
        
    }
   
}
