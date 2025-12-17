public class ShapeFactory {

    public IShape getShape(tipoFigura tipoFigura){
        if(tipoFigura == tipoFigura.CIRCULO)
            return  new Rectangulo(2,5);

        if(tipoFigura == tipoFigura.CUADRADO)
        return  new Circulo(5);

        if(tipoFigura == tipoFigura.RECTANGULO)
            return  new Cuadrado(10, 5);
        return null;

    }

}
