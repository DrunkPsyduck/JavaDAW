import java.util.ArrayList;
import java.util.Collections;

public class Gestor {
    ArrayList<Alojamientos> lista;

    public Gestor(ArrayList<Alojamientos> lista) {
        this.lista = lista;
    }

    public Gestor() {
        lista = new ArrayList<>();
    }

    public void nuevoHotel() {
        lista.add(new Hoteles(generaNombre(), generaProvincia(), generaValoracion(), generaCategoria(), servicios()));
    }

    public void nuevoApartamento() {
        lista.add(new Apartamentos(generaNombre(), generaProvincia(), generaValoracion(), numeroHabitaciones(), servicioHabitaciones()));
    }

    //consulta por provincia

    public void mostrarPorProvincia(String provincia) {
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getProvincia().equalsIgnoreCase("provincia")) {
                System.out.println(lista.get(i));
            }
        }
    }

    public void actualizarHotel(String nombreHotel) {

        boolean cambiado = false;
        for (int i = 0; i < lista.size() && !cambiado; i++) {
            if (lista.get(i).getNombre().equals(nombreHotel) && lista.get(i) instanceof Hoteles) {

                boolean valoracionValida = false;
                System.out.println("Nueva valoracion");
                int nuevaValoracion = EntradaSalida.leerEnteros();
                while (!valoracionValida) {

                    try {
                        if (nuevaValoracion > 5 && nuevaValoracion < 1) {
                            valoracionValida = true;
                        } else {
                            throw new Excepcion(nuevaValoracion);
                        }
                    } catch (Excepcion ex) {
                        System.out.println("valoracion");
                        nuevaValoracion = EntradaSalida.leerEnteros();
                    }
                }
                ((Hoteles) lista.get(i)).setValoracion(nuevaValoracion);//Casting hasta fin arrayList
                cambiado = true;
            }

        }
    }

    // consulta ordenada por nombre

    public void consultaPorNombre(){
        Collections.sort(lista);
    }

    public void consultaOrdenada() {
        ArrayList<Hoteles> auxiliar = new ArrayList<>();//ArrayList de los elementos a ordenar

        for (int i = 0; i < lista.size(); i++) {
            if(lista.get(i) instanceof Hoteles){
                auxiliar.add((Hoteles) lista.get(i));
            }
        }
        Collections.sort(auxiliar, new porNombre());//importante el new para poder acceder al comparator
    }

    //Eliminar alojamientos valoracion > 1

    public void eliminarApartamentos(){
        int contadorEncontrados = 1;

        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getValoracion()<1){
                System.out.println("Alojamineto encontrado. Desea borrarlo?(Si/No)");
                String continuar = EntradaSalida.leerTextoLinea();

                if (continuar.equalsIgnoreCase("si")){
                    lista.remove(i);
                    System.out.println("Alojamiento eliminado");
                }
            }
            i--;
        }
    }


    //Automatizacion
    public String generaNombre() {
        String[] nombres = new String[]{"Alfonso X", "Carlos I", "Carlos II", "Carlos III", "Felipe I", "Felipe II",
                "Felipe III", "Don Pelayo", "Victoria"};
        int rnd = (int) (Math.random() * nombres.length);
        return nombres[rnd];
    }

    public String generaProvincia() {
        String provincia[] = new String[]{"Madrid", "Valencia", "Cantabria", "Ávila", "Toledo", "Jaén", "Murcia",
                "Caceres", "Lugo", "Tabarnia"};
        int rnd = (int) (Math.random() * provincia.length);

        return provincia[rnd];
    }

    public String servicios() {
        String servicios[] = new String[]{"Pista tenis", "Piscina", "SPA"};
        int nServ = (int) (Math.random() * servicios.length);

        return servicios[nServ];
    }

    public int generaCategoria() {
        int categoria = (int) (Math.random() * 4) + 1;
        return categoria;
    }

    public int generaValoracion() {

        int valoracion = (int) (Math.random() * 4) + 1;

        return valoracion;
    }

    public int numeroHabitaciones() {
        int nHabitaciones = (int) (Math.random() * 10);

        return nHabitaciones;
    }

    public String servicioHabitaciones() {
        int rnd = (int) (Math.random() * 30);

        String servicioHabitaciones = "no";
        if (rnd % 2 == 0) {
            servicioHabitaciones = "si";
        }
        return servicioHabitaciones;
    }
}
