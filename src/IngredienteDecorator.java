public abstract class IngredienteDecorator implements Bebida {

    protected Bebida bebida;

    public IngredienteDecorator(Bebida bebida) {
        if (bebida == null) {
            throw new IllegalArgumentException(
                    "La bebida no puede ser nula."
            );
        }

        this.bebida = bebida;
    }

    @Override
    public abstract String getDescripcion();

    @Override
    public abstract double getPrecio();
}