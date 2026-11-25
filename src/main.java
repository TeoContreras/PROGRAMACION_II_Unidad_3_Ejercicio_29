public class main {
    public static void main(String[] args) {
        FiguraGeometrica[] figuras = new FiguraGeometrica[2];
        figuras[0] = new Circulo("Rojo", 5);
        figuras[1] = new Rectangulo("Azul", 4, 6);
        for (int i = 0; i < figuras.length; i++) {
            System.out.println("Area: " + figuras[i].calcularArea());
            System.out.println("Perimetro: " + figuras[i].calcularPerimetro());
        }
    }
}