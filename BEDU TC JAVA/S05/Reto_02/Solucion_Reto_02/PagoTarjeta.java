package Solucion_Reto_02;

public class PagoTarjeta extends MetodoPago {
    private double saldoDisponible;

    public PagoTarjeta(double monto, double saldoDisponible) {
        super(monto);
        this.saldoDisponible = saldoDisponible;
    }

    public boolean autenticar() {
        return saldoDisponible >= monto;
    }

    public void procesarPago() {
        System.out.println("Procesando pago con tarjeta por $" + monto);
    }
}

