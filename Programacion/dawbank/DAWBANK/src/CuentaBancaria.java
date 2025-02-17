import java.util.ArrayList;
import java.util.Iterator;

public class CuentaBancaria {
    private Cliente cliente;
    private String iban;
    private double saldo;
     private ArrayList <Movimiento> movimientos = new ArrayList <Movimiento> ();
     Iterator <Movimiento> itera = movimientos.iterator();
     Movimiento cadaMovimiento;

    
    
    public CuentaBancaria(Cliente cliente, String iban, double saldo) {
        this.cliente = cliente;
        this.iban = iban;
        this.saldo = 0.0;
        this.movimientos = new ArrayList<>();
    }
    
    public Cliente getCliente () {
        return cliente;
    }

    public void setCliente (Cliente cliente) {
        this.cliente = cliente;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "CuentaBancaria: Cliente=" + cliente + ", Iban=" + iban + ", Saldo=" + saldo;
    }
    
    public String informacionIban(){
        String getIban = String.format("IBAN" + this.iban);
        return getIban;
    }

    public String informacionSaldo(){
        String getSaldo = String.format("Saldo: " + this.saldo);
        return getSaldo;
    }

    public String informacionCliente(){
        String getCliente = String.format("Datos: " + this.cliente);
        return getCliente;
    }


    public boolean ingresar (Movimiento ingreso) throws CuentaException, AvisarHaciendaException{
        if (ingreso == null) {
            throw new CuentaException("Tiene que haber un movimiento");
        }
        if(ingreso.getCantidad() <= 0){
            throw new CuentaException("No se puede hacer un ingreso de 0 o menos");
        }
        movimientos.add(ingreso);
        saldo += ingreso.getCantidad();

        if (ingreso.getCantidad() > 3000){
            throw new AvisarHaciendaException("Se notificara a hacienda de este movimiento",
            this.cliente.getNombre(), this.iban, ingreso);
        }
        return true;
    }

    public boolean retirar (Movimiento retirada) throws CuentaException, AvisarHaciendaException{
        if (retirada == null) {
            throw new CuentaException("Tiene qu ehaber un movimiento");
        }
        if (retirada.getCantidad() <= 0) {
            throw new CuentaException("No se puede hacer una retirada de 0 o menos");
        }
        if ((saldo - retirada.getCantidad()) < -50) {
            throw new CuentaException("Saldo insuficiente, ingrese dinero");
        }

        saldo -= retirada.getCantidad();
        movimientos.add(retirada);
        if (saldo > -50 && saldo < 0) {
            throw new CuentaException("Saldo actual = " + this.saldo + ". Es negativo.");   
        }
        if (retirada.getCantidad() > 3000){
            throw new AvisarHaciendaException("Se notificara a hacienda de este movimiento",
            this.cliente.getNombre(), this.iban, retirada);
        }
        return true;
    }

    public String informacionMovimiento (){
        String InfoMovimiento = "";
        while(itera.hasNext()){
            Movimiento todosLosMovimientos = itera.next();
            InfoMovimiento = todosLosMovimientos.toString();
        }
        return InfoMovimiento;
    }
}