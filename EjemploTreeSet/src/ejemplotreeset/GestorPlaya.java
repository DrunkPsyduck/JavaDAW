/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplotreeset;

import java.util.Iterator;
import java.util.TreeSet;

/**
 *
 * @author gema
 */
public class GestorPlaya {
    protected TreeSet<Playa> lista;
    
    public GestorPlaya(){
        lista = new TreeSet();
    }
    public GestorPlaya(TreeSet<Playa> lista){
        this.lista = lista;
    }
    public void altaPlaya(Playa playa){
        lista.add(playa);
    }
    
    public void cambiarValoracion(String nombre, double nueva){
        
        Iterator<Playa> it =  lista.iterator();
        while(it.hasNext()){
            Playa p = it.next();
            if (p.nombre.equalsIgnoreCase(nombre)){
                p.nombre="LaCaleta";
                p.addValoracion(nueva);
            }
        }
    }
    public void eliminarPlaya(String nombre){
        
        Iterator<Playa> it =  lista.iterator();
        while(it.hasNext()){
            Playa p = it.next();
            if (p.nombre.equalsIgnoreCase(nombre)){
                it.remove();
            }
        }
    }
     public void mostrarPlayas(){
        
        Iterator<Playa> it =  lista.iterator();
        while(it.hasNext()){
            System.out.println(it.next());;
            }
        }
    
     public void cambiarLongitud(String nombre){
        
        Iterator<Playa> it =  lista.iterator();
        while(it.hasNext()){
            Playa p = it.next();
            if (p.nombre.equalsIgnoreCase(nombre)){
                p.longitud=9999;
            }
        }
    }
     
}
