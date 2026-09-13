public class Main {

    static void main() {

        Cliente cliente1 = new Cliente("Paco", 654895746);
        Camarero camarero1 = new Camarero("Juanito","8795KDF");

        Producto producto1 = new Producto("Taza","Tazas", 25.90);
        Comida c1 = new Comida("Bocadillo de jamón","Bocadillos", 8.75);
        Bebida b1 = new Bebida("Coca-Cola", "Bebidas", 2.50);

        Ticket ticket1 = new Ticket(cliente1, camarero1, 10);

        ticket1.agregarProducto(producto1);
        ticket1.agregarProducto(c1);
        ticket1.agregarProducto(b1);

        ticket1.mostrarTicket(c1, 25);



    }
}
