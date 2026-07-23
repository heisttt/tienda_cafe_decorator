public class Leche extends IngredienteDecorator {

    public Leche(Bebida bebida) {
        super(bebida);
    }

    @Override
    public String getDescripcion() {
        return bebida.getDescripcion() + " + Leche";
    }

    @Override
    public double getPrecio() {
        return bebida.getPrecio() + 1.50;
    }
}