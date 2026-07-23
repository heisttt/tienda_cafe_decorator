import java.util.ArrayList;
import java.util.List;

public class Pedido {

    private final List<Bebida> bebidas;

    public Pedido() {
        bebidas = new ArrayList<>();
    }

    public void agregarBebida(Bebida bebida) {
        if (bebida == null) {
            throw new IllegalArgumentException(
                    "No se puede agregar una bebida nula."
            );
        }

        bebidas.add(bebida);
    }

    public double calcularTotal() {
        double total = 0;

        for (Bebida bebida : bebidas) {
            total += bebida.getPrecio();
        }

        return total;
    }

    public void mostrarDetalle() {
        if (bebidas.isEmpty()) {
            System.out.println("El pedido no contiene bebidas.");
            return;
        }

        System.out.println("=================================");
        System.out.println("       DETALLE DEL PEDIDO");
        System.out.println("=================================");

        int numero = 1;

        for (Bebida bebida : bebidas) {
            System.out.printf(
                    "%d. %s - S/ %.2f%n",
                    numero,
                    bebida.getDescripcion(),
                    bebida.getPrecio()
            );

            numero++;
        }

        System.out.println("---------------------------------");
        System.out.printf(
                "TOTAL DEL PEDIDO: S/ %.2f%n",
                calcularTotal()
        );
        System.out.println("=================================");
    }
}