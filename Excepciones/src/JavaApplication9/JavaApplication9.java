/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaApplication9;

import java.util.Scanner;

/**
 *
 * @author gema
 */
public class JavaApplication9 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lector = new Scanner (System.in);
        
           
            /*BufferedReader lector2 = new BufferedReader(new InputStreamReader(System.in));
            try {
            String cadena2 = lector2.readLine();
            } catch (IOException ex) {
            System.out.println("Error de E/S");
            }
            */
       boolean repetir= false;       
       do{
        repetir = false; 
        System.out.println("Introduce cadena (más de 8 caracteres)");
        String cadena = lector.nextLine();
        try {
            Validaciones.validarLongitud(cadena);
        } catch (LongitudMinima ex) {
            System.out.println(ex.getMessage());
            repetir=true;
        }
        }while(repetir); 
    }
}
