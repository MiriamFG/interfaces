public class Circulo implements IShape{

    private double radio;


    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        double area = Math.PI*radio*radio;
        //retunr Math.Pi * Math.pow(r, 2);
        return area;
    }


    @Override
    public double calcularPerimetro() {
        double perimetro;
        perimetro = 2*Math.PI*radio;
        //TAU = 2 * PI
        return perimetro;
    }
}
