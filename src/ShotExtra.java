public class ShotExtra extends IngredienteDecorator {

    public ShotExtra(Bebida bebida) {
        super(bebida);
    }

    @Override
    public String getDescripcion() {
        return bebida.getDescripcion() + " + Shot extra";
    }

    @Override
    public double getPrecio() {
        return bebida.getPrecio() + 2.50;
    }
}