/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplotreeset;

import java.util.Comparator;

/**
 *
 * @author gema
 */
public class CriteriosComparacion {
    
}
class porLongitud implements Comparator<Playa>{

    @Override
    public int compare(Playa o1, Playa o2) {
      return (int)o1.longitud-(int)o2.longitud;
    }
}
class porValoracionMedia implements Comparator<Playa>{

    @Override
    public int compare(Playa o1, Playa o2) {
      return (int)o1.valoracionMedia()-(int)o2.valoracionMedia();
    }
}

