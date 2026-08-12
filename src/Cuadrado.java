public class Cuadrado extends Figura {
    private int lado;

    public Cuadrado(int lado, String tipo) {
        super(tipo);
        this.lado = lado;
    }

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

    @Override
    public double area() {
        return (double) lado * lado;
    }
    
}
