public class Main {
    public static void main(String[] args) {

        Producto producto1 = new Producto("Teclado", 20.0, 10);
        Producto producto2 = new Producto("Mouse", 15.5, 5);

        Venta venta1 = new Venta(2);
        Venta venta2 = new Venta(1);

        venta1.aplicar(producto1);
        System.out.println("----------------------");

        venta2.aplicar(producto2);
        System.out.println("----------------------");

        producto1.mostrarProducto();
        System.out.println("----------------------");
        producto2.mostrarProducto();
    }
}
