public class Venta {
    private int cantidad;

    public Venta(int cantidad) {
        this.cantidad = cantidad;
    }

    public void aplicar(Producto producto) {
        if (cantidad > 0 && cantidad <= producto.getStock()) {
            double total = producto.getPrecio() * cantidad;

            producto.reducirStock(cantidad);

            System.out.println("Producto vendido: "
                    + producto.getNombre());
            System.out.println("Cantidad: " + cantidad);
            System.out.println("Total a pagar: " + total);
        } else {
            System.out.println("Stock insuficiente.");
        }
    }
}
