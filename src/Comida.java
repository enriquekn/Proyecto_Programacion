public class Comida extends Producto{
    private boolean esCaliente;

    public Comida(String nombre, String categoria, double precio) {
        super(nombre, categoria, precio);
        this.esCaliente = true;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Comida{");
        sb.append(super.toString()).append(", ");
        sb.append("esCaliente=").append(esCaliente);
        sb.append('}');
        return sb.toString();
    }
}
