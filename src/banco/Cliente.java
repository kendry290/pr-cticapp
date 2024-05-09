package banco;
public class Cliente {
    int identificacion;
    String nombre;
    String cuentaBancaria;
    Double saldoEnCuenta;
    String tipoIdentificacion;
    String direccion;
    String ciudad;

    public Cliente(int identificacion, String nombre, Double saldoEnCuenta, String tipoIdentificacion, String direccion, String ciudad) {
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.saldoEnCuenta = saldoEnCuenta;
        this.tipoIdentificacion = tipoIdentificacion;
        this.direccion = direccion;
        this.ciudad = ciudad;
    }

    
    public void imprimirDatosCliente(
                int identificacion,
                String nombre,
                String cuentaBancaria, 
                Double saldoEnCuenta ){
    
                System.out.println("La identificación del cliente es: "+ identificacion +"\n"+
                                   "EL nombre del cliente es: "+ nombre +"\n"+
                                   "La cuenta bancaria es: "+ cuentaBancaria +"\n"+
                                   "El saldo de la cuenta es: "+ saldoEnCuenta );   
    }
    public double depositar(double saldoInicial, double monto) {
        saldoEnCuenta =0.0;
        saldoEnCuenta += saldoInicial + monto;
        System.out.println("Depósito realizado. Nuevo saldo: " + saldoEnCuenta);
        return 2.0;
    }
     public void retirar(double monto) {
        if (monto > saldoEnCuenta) {
            System.out.println("Saldo insuficiente para realizar el retiro.");
        } else {
            saldoEnCuenta -= monto;
            System.out.println("Retiro realizado. Nuevo saldo: " + saldoEnCuenta);
        }
    }

    public int getIdentificacion() {
        return identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCuentaBancaria() {
        return cuentaBancaria;
    }

    public Double getSaldoEnCuenta() {
        return saldoEnCuenta;
    }

    public String getTipoIdentificacion() {
        return tipoIdentificacion;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCuentaBancaria(String cuentaBancaria) {
        this.cuentaBancaria = cuentaBancaria;
    }

    public void setSaldoEnCuenta(Double saldoEnCuenta) {
        this.saldoEnCuenta = saldoEnCuenta;
    }

    public void setTipoIdentificación(String tipoIdentificacion) {
        this.tipoIdentificacion = tipoIdentificacion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public void setTipoIdentificacion(String tipoIdentificacion) {
        this.tipoIdentificacion = tipoIdentificacion;
    }

}
