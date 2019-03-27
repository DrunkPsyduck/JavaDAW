/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaApplication9;

/**
 *
 * @author gema
 */
public class Validaciones {
    public static void validarLongitud(String cadena) throws LongitudMinima{
        if (cadena.length()< 8)
            throw new LongitudMinima();
    }
}
