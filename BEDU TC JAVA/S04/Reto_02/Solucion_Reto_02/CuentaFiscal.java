package Solucion_Reto_02;

import java.util.Objects;

// clase tradicional con encapsulación y validación
public class CuentaFiscal {

    private final String rfc; // no se modifica después del constructor
    private double saldoDisponible;

    // constructor con validación del saldo
    public CuentaFiscal(String rfc, double saldoDisponible) {
        this.rfc = rfc;
        if (saldoDisponible >= 0) {
            this.saldoDisponible = saldoDisponible;
        } else {
            System.out.println("El saldo no puede ser negativo. Se asigna 0.");
            this.saldoDisponible = 0;
        }
    }

    // Getters
    public String getRfc()
    {
        return rfc;
    }

    public double getSaldoDisponible()
    {
        return saldoDisponible;
    }

    // metodo que valida si el RFC de la declaración coincide con el RFC de la cuenta
    public boolean validarRFC(DeclaracionImpuestos d) {
        return Objects.equals(this.rfc, d.rfcContribuyente());
    }

    // metodo para mostrar información de la cuenta
    public void mostrarCuenta() {
        System.out.println("Cuenta fiscal registrada con RFC: " + rfc + ", saldo disponible: $" + saldoDisponible);
    }
}
