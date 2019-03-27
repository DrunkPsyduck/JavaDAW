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
public class LongitudMinima extends Exception{
    public LongitudMinima(){
        super("La longitud de la cadena tiene que ser al menos de 8 caracteres");
    }
    public LongitudMinima(String mensaje){
        super(mensaje);
    }
}
