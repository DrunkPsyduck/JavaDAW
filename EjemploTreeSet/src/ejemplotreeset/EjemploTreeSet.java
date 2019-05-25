/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplotreeset;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

/**
 *
 * @author gema
 */
public class EjemploTreeSet {

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
            g.altaPlaya(new Playa("playita"+i,1000*i,valoraciones));
        }
        g.altaPlaya(new Playa("playita2",1000,new TreeSet()));
        g.cambiarValoracion("playita0", 10);
        System.out.println(g.lista);
        g.eliminarPlaya("playita1");
        g.mostrarPlayas();
        g.cambiarLongitud("playita2");
        ArrayList<Playa> lista = new ArrayList(g.lista);
        Collections.sort(lista, new porLongitud());
        System.out.println(lista);
        Collections.sort(lista, new porValoracionMedia());
        System.out.println(lista);
        System.out.println(g.lista);
        
    }
    
}
