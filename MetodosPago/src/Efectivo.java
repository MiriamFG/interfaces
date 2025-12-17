import java.util.Scanner;

public class Efectivo implements ITipoPago{
    Scanner sc = new Scanner(System.in);

    @Override
    public double Calcularpagar() {

        System.out.println("Cuanto dinero quieres añadir");
        double ingreso;

        ingreso =  sc.nextDouble();
        System.out.println("Añadiendo" + ingreso);
        return ingreso;
    }
}
