public class Espresso implements Bebida {

    @Override
    public String getDescripcion() {
        return "Espresso";
    }

    @Override
    public double getPrecio() {
        return 5.00;
    }
}