package banco;
import java.util.Scanner;
import banco.Cliente;
public class Banco {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        OperacionesBancarias operaciones = new OperacionesBancarias();        
        boolean salir = false;
        while (!salir) {
            System.out.println("Elija una opción:");
            System.out.println("1. Agregar cliente");
            System.out.println("2. Buscar cliente");
            System.out.println("3. Verificar saldo");
            System.out.println("4. Actualizar cliente");
            System.out.println("5. Salir");
            System.out.print("Opción: ");
            String opcion = (scanner.next());
            scanner.nextLine();
            switch (opcion) {
                case "1":
                    System.out.print("Ingrese el nombre del cliente: ");
                    String nombre = scanner.next();
                    scanner.nextLine();
                    System.out.print("Ingrese la identificación del cliente: ");
                    int identificacion = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Ingrese el saldo en cuenta del cliente: ");
                    double saldo =scanner.nextDouble();
                    scanner.nextLine();
                    System.out.print("Ingrese la cuenta bancaria del cliente ");
                    String cuenta = scanner.next();
                    scanner.nextLine();
                    String tipoIdentificacion="";
                     String direccion="";
                     String ciudad="";
                    Cliente nuevoCliente = new Cliente(identificacion, nombre,
                              saldo, tipoIdentificacion, direccion, ciudad);      
                    operaciones.agregarCliente(nuevoCliente);
                    break;
                case "2":
                    // Buscar cliente
                    System.out.print("Ingrese el número de cliente a buscar: ");
                    int numClienteBuscar = Integer.parseInt(scanner.nextLine());
                    scanner.nextLine();
                    Cliente clienteEncontrado = operaciones.buscarCliente(numClienteBuscar);
                    if (clienteEncontrado != null) {
                        System.out.println("Cliente encontrado:");
                        System.out.println("Nombre: " + clienteEncontrado.getNombre());
                        System.out.println("Identificación: " + clienteEncontrado.getIdentificacion());
                        System.out.println("Saldo en cuenta: " + clienteEncontrado.getSaldoEnCuenta());
                    } else {
                        System.out.println("Cliente no encontrado.");
                    }
                    break;
                case "3":
                    // Verificar saldo
                    System.out.print("Ingrese el número de cliente para verificar saldo: ");
                    int numClienteVerificar = Integer.parseInt(scanner.nextLine());
                    scanner.nextLine();
                    double saldoCliente = operaciones.verificarSaldo(numClienteVerificar);
                    if (saldoCliente != -1) {
                        System.out.println("Saldo del cliente: " + saldoCliente);
                    } else {
                        System.out.println("Cliente no encontrado.");
                    }
                    break;
                case "4":
                    // Actualizar cliente
                    System.out.print("Ingrese el número de cliente para actualizar: ");
                    int numClienteActualizar = Integer.parseInt(scanner.nextLine());
                    scanner.nextLine();
                    System.out.print("Ingrese el nuevo nombre: ");
                    String nuevoNombre = scanner.nextLine();
                    operaciones.actualizarCliente(numClienteActualizar, nuevoNombre);
                    break;
                case "5":
                    // Salir
                    salir = true;
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        } 
        scanner.close();
     }
}
