public class Main {
    public static void main(String[] args) {

        Usuario usuario1 = new Usuario(
                "Juan Perez", "1801234567");

        Usuario usuario2 = new Usuario(
                "Maria Lopez", "1807654321");

        Libro libro1 = new Libro(
                "Don Quijote de la Mancha", true);

        Prestamo prestamo1 = new Prestamo(usuario1, libro1);
        Prestamo prestamo2 = new Prestamo(usuario2, libro1);

        prestamo1.registrar();
        prestamo2.registrar();
    }
}
