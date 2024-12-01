package sistema.model;

public class Nota {

    private String tipo;
    private double valor;

    public Nota(String tipo, double valor) {
        this.tipo = tipo;
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

}
