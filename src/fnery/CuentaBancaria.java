package fnery;

public class CuentaBancaria {
    private int balance;
    private String numero;
    //public int balance;
    //public String numero;

    public CuentaBancaria(String numero){
        this.balance = 0;
        this.numero = numero;
    }

    public void transferir(int montoATransferir, CuentaBancaria cuentaBancaria){
        if(montoATransferir <= 0){
            Printer.print("El monto a transferir no puede ser menor o igual a cero");
            return;
        }
        if(this.balance < montoATransferir){
            Printer.print("Fondos insuficientes");
            return;
        }
        this.quitarFondo(montoATransferir);
        cuentaBancaria.depositarMonto(montoATransferir);
    }

    private void quitarFondo(int monto){
        this.balance = this.balance - monto;
    }

    public void depositarMonto(int monto){
        if(monto <= 0){
            Printer.print("El monto a depositar no puede ser menor o igual a cero");
            return;
        }
        else{
            this.balance = this.balance + monto;
        }
    }

    public String getNumero(){
        return this.numero;
    }

    public int getBalance(){
        return this.balance;
    }

    //public void setBalance(int monto) { this.balance = monto; }
}