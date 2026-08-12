public class App {
    public static void main(String[] args) throws Exception {
        Figura tria1 = new Triangulo(5, 10, "Triángulo");
        Figura cua1 = new Cuadrado(4, "Cuadrado");
        Figura cir1 = new Circulo(3, "Círculo");
        Figura hex1 = new Hexagono(4, "Hexágono");

        System.out.println("Área del " + tria1.getTipo() + ": " + tria1.area());
        System.out.println("Área del " + cua1.getTipo() + ": " + cua1.area());
        System.out.println("Área del " + cir1.getTipo() + ": " + cir1.area());
        System.out.println("Área del " + hex1.getTipo() + ": " + hex1.area());  

    }
}
