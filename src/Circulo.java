public class Circulo extends Figura {
    private int radio;

    public Circulo(int radio, String tipo) {
        super(tipo);
        this.radio = radio;
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    @Override
    public double area() {
        return (double) Math.PI * radio * radio;
    }
    
}
