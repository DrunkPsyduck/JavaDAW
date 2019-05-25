package ejemploproyectotxt;

import java.util.TreeSet;


public class Cala extends Playa {
private boolean accesoMinusvalidos;
    public Cala(String nombre, double longitud, boolean accesoMinusvalidos) {
        super(nombre, longitud);
        this.accesoMinusvalidos=accesoMinusvalidos;
    }

    public Cala(String nombre, double longitud, TreeSet<Double> valoraciones,boolean accesoMinusvalidos) {
        super(nombre, longitud,valoraciones);
        this.accesoMinusvalidos=accesoMinusvalidos;
    }
    public Cala() {
          super();
             int a=(int)(Math.random()*2)+1;
       if(a==1){
           this.accesoMinusvalidos=true;
       }
       else{
           this.accesoMinusvalidos=false;
       }
    }

    public boolean getAccesoMinusvalidos() {
        return accesoMinusvalidos;
    }

  

    public void setAccesoMinusvalidos(boolean accesoMinusvalidos) {
        this.accesoMinusvalidos = accesoMinusvalidos;
    }

   
@Override
    public String toString() {
          return super.toString()+ ", AccesoMinusvalidos=" + this.accesoMinusvalidos + " }";
    }

@Override
    public String toStringFichero() {
        return super.toStringFichero() + ";" + accesoMinusvalidos;
    }

    
}
