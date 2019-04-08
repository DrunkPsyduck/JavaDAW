public abstract class Vehiculos {
    protected String matricula;
    protected Modelo modelo;
    protected int potencia;
    protected String combustible;
    protected double precioAlquiler;

    public Vehiculos() {
    }

    public Vehiculos(String matricula, Modelo modelo, int potencia, String combustible, double precioAlquiler) {
        this.matricula = matricula;
        this.modelo = modelo;
        this.potencia = potencia;
        this.combustible = combustible;
        this.precioAlquiler = precioAlquiler;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Modelo getModelo() {
        return modelo;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public String getCombustible() {
        return combustible;
    }

    public void setCombustible(String combustible) {
        this.combustible = combustible;
    }

    public abstract String toString();
}
