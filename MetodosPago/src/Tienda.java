public class Tienda {

    private int ganancias;

    public Tienda(double ganancia){
        this.ganancias = 0;
    }

    public void pagar(ITipoPago metodo){
        ganancias += metodo.Calcularpagar();
    }

}
