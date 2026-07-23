public class Main {

    public static void main(String[] args) {

        Pedido pedido = new Pedido();

        // Primera bebida: Latte con chocolate y shot extra.
        Bebida bebida1 = new Latte();
        bebida1 = new Chocolate(bebida1);
        bebida1 = new ShotExtra(bebida1);

        // Segunda bebida: Espresso con leche.
        Bebida bebida2 = new Espresso();
        bebida2 = new Leche(bebida2);

        // Tercera bebida: Americano con canela y shot extra.
        Bebida bebida3 = new Americano();
        bebida3 = new Canela(bebida3);
        bebida3 = new ShotExtra(bebida3);

        pedido.agregarBebida(bebida1);
        pedido.agregarBebida(bebida2);
        pedido.agregarBebida(bebida3);

        pedido.mostrarDetalle();
    }
}