package es.iespto.joel.cuentas;
public class Main {

    public static void main(String[] args) {
        CCuenta cuenta1;
        double saldoActual;

        cuenta1 = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        operativa_cuenta(cuenta1, 2500.0f);
        
    }

    /**
     * Método que realiza las operaciones sobre una cuenta
     * @param cuenta1 cuenta sobre la que se realizan las operaciones
     * @param cantidad cantidad a ingresar y a retirar
     */
    public static void operativa_cuenta(CCuenta cuenta1, float cantidad){
        double saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es"+ saldoActual );

        try {
            cuenta1.retirar(2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }
}
