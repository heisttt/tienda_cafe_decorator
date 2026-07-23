public class Canela extends IngredienteDecorator {

    public Canela(Bebida bebida) {
        super(bebida);
    }

    @Override
    public String getDescripcion() {
        return bebida.getDescripcion() + " + Canela";
    }

    @Override
    public double getPrecio() {
        return bebida.getPrecio() + 0.50;
    }
}