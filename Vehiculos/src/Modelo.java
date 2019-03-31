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
      StringBuilder sb = new StringBuilder();
      sb.append(marca).append(" Modelo: ").append(modelo).append(" Fecha lanzamiento: ").append(fechaSalidaMercado);
      return sb.toString();
    }
}
