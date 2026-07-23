public class Americano implements Bebida {

    @Override
    public String getDescripcion() {
        return "Americano";
    }

    @Override
    public double getPrecio() {
        return 6.00;
    }
}