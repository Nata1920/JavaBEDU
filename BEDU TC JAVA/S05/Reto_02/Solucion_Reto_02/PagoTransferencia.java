package Solucion_Reto_02;

public class PagoTransferencia extends MetodoPago {
    private boolean validadoExternamente;

    public PagoTransferencia(double monto, boolean validadoExternamente) {
        super(monto);
        this.validadoExternamente = validadoExternamente;
    }

    public boolean autenticar() {
        return validadoExternamente;
    }

    public void procesarPago() {
        System.out.println("Procesando transferencia por $" + monto);
    }
}

