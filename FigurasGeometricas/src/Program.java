public class Program {
    public static void main(String[] args) {
        IShape f1 = new Circulo(2);

        logInfo(f1);
    }


    public static void logInfo(IShape shape) {
        System.out.println(shape.calcularArea());
        System.out.println(shape.calcularPerimetro());
    }
}
