public class Chocolate extends IngredienteDecorator {

    public Chocolate(Bebida bebida) {
        super(bebida);
    }

    @Override
    public String getDescripcion() {
        return bebida.getDescripcion() + " + Chocolate";
    }

    @Override
    public double getPrecio() {
        return bebida.getPrecio() + 2.00;
    }
}