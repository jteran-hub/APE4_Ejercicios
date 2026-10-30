public class Main {
    public static void main(String[] args) {

        Cuenta cuenta1 = new Cuenta("Ana Torres", 500.0);
        Cuenta cuenta2 = new Cuenta("Luis Perez", 250.0);

        // Transferencia valida
        cuenta1.transferir(cuenta2, 100.0);

        System.out.println("Saldo origen: " + cuenta1.getSaldo());
        System.out.println("Saldo destino: " + cuenta2.getSaldo());

        System.out.println("----------------------");

        // Transferencia que falla
        cuenta1.transferir(cuenta2, 1000.0);

        System.out.println("Saldo origen: " + cuenta1.getSaldo());
        System.out.println("Saldo destino: " + cuenta2.getSaldo());
    }
}
