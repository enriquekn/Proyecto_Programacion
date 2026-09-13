public class Bebida extends Producto {
    private String tamanio;


    public Bebida(String nombre, String categoria, double precio) {
        super(nombre, categoria, precio);
        this.tamanio = tamanio;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Bebida{");
        // 1. Le pedimos al StringBuilder que inserte primero la info del padre
        sb.append(super.toString()).append(", ");
        sb.append("tamanio='").append(tamanio).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
