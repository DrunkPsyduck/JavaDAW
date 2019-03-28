public class Modelo {

    protected String marca; //Compañia
    protected String modelo;
    protected String fechaSalidaMercado;

    public Modelo() {
        marca = "Aston Martin";
        modelo = "DB11";
        fechaSalidaMercado= "2018";


    }

    public Modelo(String marca, String modelo, String fechaSalidaMercado) {
        this.marca = marca;
        this.modelo = modelo;
        this.fechaSalidaMercado = fechaSalidaMercado;
    }

    @Override
    public String toString() {
        return "Modelo{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", fechaSalidaMercado='" + fechaSalidaMercado + '\'' +
                '}';
    }
}
