package ejemploproyectotxt;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.TreeSet;



public abstract class Playa implements Comparable<Playa>{
    protected String nombre;
    protected double longitud;
    protected TreeSet<Double> valoraciones;

    public Playa(String nombre, double longitud) {
        this.nombre = nombre;
        this.longitud = longitud;
        this.valoraciones = new TreeSet();
    }
    public Playa(String nombre, double longitud,TreeSet<Double> valoraciones) {
        this.nombre = nombre;
        this.longitud = longitud;
        this.valoraciones =valoraciones;
    }
    public Playa(){
        int a;
        double l;
        l=(Math.random()*10000)+1;
        a=(int)(Math.random()*100)+1;
        this.nombre="Playa"+a;
        this.longitud=l;
        
        for (int i = 0; i < 100; i++) {
           valoraciones.add((Math.random()*5)+1);
        }
    }

    public String getNombre() {
        return nombre;
    }

    public double getLongitud() {
        return longitud;
    }

    public TreeSet<Double> getValoraciones() {
        return valoraciones;
    }
    public double valoracionMedia(){
        double media=0;
        Iterator<Double> it = valoraciones.iterator();
        while(it.hasNext())
            media+=it.next();
        media=media/valoraciones.size();
        return media;
    }
    public double valoracionMediaTruco(){
        double media=0;
        ArrayList <Double> aux = new ArrayList(valoraciones);
        for (int i = 0; i < aux.size(); i++) {
            media+=aux.get(i);
            
        }
        media=media/valoraciones.size();
        
        return media;
    }
    public void addValoracion(double nueva){
        valoraciones.add(nueva);
    }
    @Override
    public String toString() {
        return "Playa{" + "nombre=" + nombre + ", longitud=" + longitud + ", valoraciones=" + valoraciones.toString() + '}';
    }

    @Override
    public int compareTo(Playa o) {
        return this.nombre.compareTo(o.nombre);
    }
   
    public String toStringTreeSet() {
        StringBuilder sb = new StringBuilder();
        Iterator<Double> it = valoraciones.iterator();
        while(it.hasNext()){
            sb.append(it.next()).append(",");
        }
        String cadena= sb.toString();
        cadena = cadena.substring(0,cadena.length()-1);
        return cadena;
    }
    
    public String toString2TreeSet() {
        String s = new String();        
        Iterator<Double> it = valoraciones.iterator();
        while(it.hasNext()){
            s=s.concat(Double.toString(it.next())).concat(",");
            s+=Double.toString(it.next())+",";
        }
        s = s.substring(0,s.length()-1);
        return s;
    }
    public String toStringFichero() {
        return this.getClass().getSimpleName().charAt(0)+";" + nombre+";" + longitud + ";" + toStringTreeSet() ;
    }
    

  
    
}
