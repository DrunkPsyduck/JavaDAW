package GreyIron;

public abstract class Cartas {

    protected String numero;
    protected int valor;
    protected String palo;

    public Cartas(String numero) {
        this.numero = numero;
    }

    public Cartas(int valor) {
        this.valor = valor;
    }

    public abstract void idCarta(String numero, String valor, String palo);

    public abstract void pintarCarta();
}
