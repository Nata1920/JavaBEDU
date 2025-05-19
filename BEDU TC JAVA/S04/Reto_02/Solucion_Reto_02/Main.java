package Solucion_Reto_02;

public class Main {
    public static void main(String[] args) {

        // creamos una declaración de impuestos
        DeclaracionImpuestos declaracion = new DeclaracionImpuestos("RNSB19040501000", 8900.0);

        // creamos una cuenta fiscal
        CuentaFiscal cuenta = new CuentaFiscal("RNSB19040501000", 15500.0);

        // mostramos la información
        System.out.println(" declaración enviada por RFC: " + declaracion.rfcContribuyente() +
                           " por $" + declaracion.montoDeclarado());
        cuenta.mostrarCuenta();

        // validamos si el RFC de la declaración es válido
        boolean rfcValido = cuenta.validarRFC(declaracion);
        System.out.println("¿RFC válido para esta cuenta?: " + rfcValido);
    }
}
