package banco;
import banco.Cliente;
import java.util.ArrayList;

public class OperacionesBancarias {
     private ArrayList<Cliente> clientes;
     
    // Método +para agregar un cliente al banco
    public void agregarCliente(Cliente cliente) {
        clientes = new ArrayList<>();
        clientes.add(cliente);
        System.out.println("Cliente creado exitosamente.");
    }

    // Método para buscar un cliente por número de cliente
    public Cliente buscarCliente(int numeroCliente) {
        for (Cliente cliente : clientes) {
            if (cliente.getIdentificacion()== numeroCliente) {
                return cliente;
            }
        }
        return null; // Cliente no encontrado
    }

    // Método para verificar el saldo de un cliente
    public double verificarSaldo(int numeroCliente) {
        Cliente cliente = buscarCliente(numeroCliente);
        if (cliente != null) {
            return cliente.getSaldoEnCuenta();
        }
        return -1; // Cliente no encontrado
    }

    // Método para actualizar los datos de un cliente
    public void actualizarCliente(int numeroCliente, String nuevoNombre) {
        Cliente cliente = buscarCliente(numeroCliente);
        if (cliente != null) {
            cliente.setNombre(nuevoNombre);
            System.out.println("Datos del cliente actualizados correctamente.");
        } else {
            System.out.println("Cliente no encontrado.");
        }
    }
}
