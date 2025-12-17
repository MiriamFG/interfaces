import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcion;
        Tienda tienda = new Tienda(0);

        System.out.println("Como quieres pagar");
        System.out.println("1. Efectivo");
        System.out.println("2 Tarjeta");
        System.out.println("3. Bizum");

        opcion = sc.nextInt();
        sc.nextLine();

        if(opcion == 1){
            Efectivo efectivo = new Efectivo();
            tienda.pagar(efectivo);
        }
        if(opcion == 2){
            Tarjeta tarjeta = new Tarjeta();
            tienda.pagar(tarjeta);
        }
        if(opcion == 3){
            Bizum bizum = new Bizum();
            tienda.pagar(bizum);
        }

    }
}
