package ejemploproyectotxt;

import java.util.TreeSet;


public class PlayaGrande extends Playa {
    private String bandera;

    public PlayaGrande(String nombre,double longitud,String bandera) {
        super(nombre, longitud);
        this.bandera=bandera;
    }
    public PlayaGrande(String nombre, double longitud, TreeSet<Double> valoraciones,String bandera) {
        super(nombre, longitud,valoraciones);
        this.bandera=bandera;
    }
    public PlayaGrande(){
        super();
        int a=(int)(Math.random()*3)+1;
        if(a==1){
            this.bandera="Roja";
        }
        else if(a==2){
            this.bandera="Amarilla";
        }
        else{
            this.bandera="Verde";
        }
    }

    public String getBandera() {
        return bandera;
    }

    public void setBandera(String bandera) {
        this.bandera = bandera;
    }

    @Override
    public String toString() {
        return super.toString()+", bandera=" + bandera  +'}';
    }

    @Override
    public String toStringFichero() {
        return super.toStringFichero()+";" + bandera;
    }
}