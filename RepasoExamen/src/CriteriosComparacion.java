import java.util.Comparator;

public class CriteriosComparacion {
}
class porNombre implements Comparator<Hoteles>{
    @Override
    public int compare(Hoteles o1, Hoteles o2) {
        int aux = o1.getCategoria()-o2.getCategoria();
        if (aux==0){
            aux = o1.getNombre().compareTo(o2.getNombre());
        }
        return aux;
    }
}
