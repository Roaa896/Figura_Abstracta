public class Hexagono extends Figura {
    private int lado;

    public Hexagono(int lado, String tipo) {
        super(tipo);
        this.lado = lado;
    }

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

    public double calcularPerimetro() {
        return (double) lado * 6;
    }

    public double calcularApotema() {
        return (double) (Math.sqrt(3) * lado) / 2.0;
    }

    @Override
    public double area() {
        return (double) (calcularPerimetro() * calcularApotema()) / 2.0;
    }
    
}
