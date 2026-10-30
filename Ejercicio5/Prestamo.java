public class Prestamo {
    private Usuario usuario;
    private Libro libro;

    public Prestamo(Usuario usuario, Libro libro) {
        this.usuario = usuario;
        this.libro = libro;
    }

    public void registrar() {
        System.out.println("Usuario: " + usuario.getNombre());
        System.out.println("Libro: " + libro.getTitulo());

        if (libro.prestar()) {
            System.out.println("Prestamo realizado correctamente.");
        } else {
            System.out.println("El libro no esta disponible.");
        }

        System.out.println("----------------------");
    }
}
