package Solucion_Reto_02;

public class PagoEfectivo extends MetodoPago {

    public PagoEfectivo(double monto) {
        super(monto);
    }

    public boolean autenticar() {
        return true;  // No se requiere validación para efectivo
    }
    public void procesarPago() {
        System.out.println(" Procesando pago en efectivo por $" + monto);
    }
}

