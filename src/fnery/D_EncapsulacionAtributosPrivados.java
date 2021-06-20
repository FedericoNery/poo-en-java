package fnery;

public class D_EncapsulacionAtributosPrivados {

    public static void main(String[] args) {
        /*CuentaBancaria cuentaBancariaPersonaA = new CuentaBancaria("98765432109876543");
        CuentaBancaria cuentaBancariaPersonaB = new CuentaBancaria("12345678910111213");
        cuentaBancariaPersonaB.depositarMonto(100000000);
        cuentaBancariaPersonaA.depositarMonto(1000);

        cuentaBancariaPersonaA.transferir(300, cuentaBancariaPersonaB);*/
        //cuentaBancariaPersonaA.balance = -10000;

        CuentaBancaria cuentaBancariaOrigen = new CuentaBancaria("123456789");
        CuentaBancaria cuentaBancariaDestino = new CuentaBancaria("987654321");
        cuentaBancariaOrigen.depositarMonto(1000);
        cuentaBancariaDestino.depositarMonto(500);


        Printer.print("Cuenta origen:" + cuentaBancariaOrigen.getBalance());
        Printer.print("Cuenta destino:" + cuentaBancariaDestino.getBalance());

        cuentaBancariaOrigen.transferir(500, cuentaBancariaDestino);

        Printer.print("Cuenta origen:" + cuentaBancariaOrigen.getBalance());
        Printer.print("Cuenta destino:" + cuentaBancariaDestino.getBalance());

        cuentaBancariaOrigen.transferir(-600, cuentaBancariaDestino);

        Printer.print("Cuenta origen:" + cuentaBancariaOrigen.getBalance());
        Printer.print("Cuenta destino:" + cuentaBancariaDestino.getBalance());

        cuentaBancariaOrigen.depositarMonto(-600);
        Printer.print("Cuenta origen:" + cuentaBancariaOrigen.getBalance());

        cuentaBancariaOrigen.depositarMonto(600);
        Printer.print("Cuenta origen:" + cuentaBancariaOrigen.getBalance());
    }
}
