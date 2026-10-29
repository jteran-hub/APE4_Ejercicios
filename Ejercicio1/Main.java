public class Main {
    public static void main(String[] args) {

        Autor autor1 = new Autor(
                "Miguel de Cervantes", "Española");

        Autor autor2 = new Autor(
                "Gabriel Garcia Marquez", "Colombiana");

        Libro libro1 = new Libro(
                "Don Quijote de la Mancha", 1605, autor1);

        Libro libro2 = new Libro(
                "Cien años de soledad", 1967, autor2);

        libro1.mostrarInformacion();
        libro2.mostrarInformacion();
    }
}
