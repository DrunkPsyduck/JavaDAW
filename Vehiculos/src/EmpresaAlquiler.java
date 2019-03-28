import java.util.Arrays;

public class EmpresaAlquiler {

    protected Vehiculo vehiculos[];

    public void mostrarMensaje(){
        System.out.println("                                                                                                                    \n" +
                "  ,---.  ,--.               ,--.,--.                  ,--.   ,--.     ,--.     ,--.              ,--.               \n" +
                " /  O  \\ |  | ,---. ,--.,--.`--'|  | ,---. ,--.--.     \\  `.'  /,---. |  ,---. `--' ,---.,--.,--.|  | ,---.  ,---.  \n" +
                "|  .-.  ||  || .-. ||  ||  |,--.|  || .-. :|  .--'      \\     /| .-. :|  .-.  |,--.| .--'|  ||  ||  || .-. |(  .-'  \n" +
                "|  | |  ||  |' '-' |'  ''  '|  ||  |\\   --.|  |          \\   / \\   --.|  | |  ||  |\\ `--.'  ''  '|  |' '-' '.-'  `) \n" +
                "`--' `--'`--' `-|  | `----' `--'`--' `----'`--'           `-'   `----'`--' `--'`--' `---' `----' `--' `---' `----'  \n" +
                "                `--'                                                                                                ");

    }

    public void inicializarArray(){
        vehiculos = new Vehiculo[20];
    }

    public void inicializarArray(int size){

        vehiculos = new Vehiculo[size];
    }

    public void rellenarArray(){

        for (int i = 0; i < vehiculos.length/2; i++) {
            if (i%2==0){
                vehiculos[i] = new Coche();
            } else {
                vehiculos[i] = new Autobus();
            }
        }
        System.out.println("Array inicializado");
    }

    public void nuevoCoche(String matricula, int potencia, double precioAlquiler, String tipo, String color, String marca, String modelos, String fechaSalida){
        for (int i = 0; i < vehiculos.length && i%2==0; i++) {
            if (vehiculos[i]==null){
                vehiculos[i] = new Coche(matricula, potencia, new Modelo(marca,modelos,fechaSalida), precioAlquiler, tipo, color);
            } else {
                System.out.println("*");
            }
        }
    }

    public void nuevoAutobus(String matricula, int potencia, int precioAlquiler, String tipo, int capacidad, String marca, String modelos, String fechaSalida){
        for (int i = 0; i < vehiculos.length && i%3==0; i++) {
            if (vehiculos[i]==null){
                vehiculos[i] = new Autobus(matricula, potencia, new Modelo(marca,modelos,fechaSalida), precioAlquiler, tipo, capacidad);
            }
        }

    }
    public void borrarElemento(int posicion){
        vehiculos[posicion] = null;
    }

    @Override
    public String toString() {
        return "EmpresaAlquiler{" +
                "vehiculos=" + Arrays.toString(vehiculos) +
                "}\n";
    }
}
