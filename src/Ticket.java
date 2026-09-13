import java.util.Arrays;

public class Ticket {
    Cliente cliente;
    Camarero camarero;
    Producto[] productos;
    int contadorProductos;

    public int getContadorProductos() {
        return contadorProductos;
    }

    public void setContadorProductos(int contadorProductos) {
        this.contadorProductos = contadorProductos;
    }

    public Producto[] getProductos() {
        return productos;
    }

    public void setProductos(Producto[] productos) {
        this.productos = productos;
    }

    public Camarero getCamarero() {
        return camarero;
    }

    public void setCamarero(Camarero camarero) {
        this.camarero = camarero;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Ticket(Cliente cliente, Camarero camarero, int capMax) {
        this.cliente = cliente;
        this.camarero = camarero;
        this.productos = new Producto[capMax];
        this.contadorProductos = 0;
    }

    public void agregarProducto(Producto producto) {
        if (contadorProductos < productos.length) {
            productos[contadorProductos] = producto;
            contadorProductos++;
        } else {
            System.out.println("No se pueden agregar más productos.");
        }
    }

    public double calcularTotal() {
        double total = 0;

        for (int i = 0; i < this.contadorProductos; i++) {
            total += this.productos[i].getPrecio();
        }
        return total;
    }

    public void mostrarTicket(Producto productoConDescuento, double porcentaje) {

        System.out.println("\n==========================================");
        System.out.println("             CAFETERÍA JAVA               ");
        System.out.println("==========================================");

        System.out.println(" Cliente:  " + this.cliente.getNombre());
        System.out.println(" Camarero: " + this.camarero.getNombre() + " (Cod: " + this.camarero.getCodigoEmpleado() + ")");
        System.out.println("------------------------------------------");

        System.out.println(" Productos:");
        for (int i = 0; i < contadorProductos; i++) {

            System.out.printf("   %d. %s - %.2f €\n", (i + 1), this.productos[i].getNombre(), this.productos[i].getPrecio());
        }
        System.out.println("------------------------------------------");

        double precioFinal = productoConDescuento.aplicarDescuento(porcentaje);
        productoConDescuento.setPrecio(precioFinal);

        System.out.printf(" Total original: %.2f €\n", this.calcularTotal());
        System.out.println("------------------------------------------");
        System.out.printf("  [PROMO] %s (-%.0f%%)\n", productoConDescuento.getNombre(), porcentaje);
        System.out.printf("  Precio final artículo: %.2f €\n", precioFinal);
        System.out.println("==========================================\n");
    }




    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Ticket{");
        sb.append("cliente=").append(cliente);
        sb.append(", camarero=").append(camarero);
        sb.append(", productos=").append(Arrays.toString(productos));
        sb.append(", contadorProductos=").append(contadorProductos);
        sb.append('}');
        return sb.toString();
    }
}
