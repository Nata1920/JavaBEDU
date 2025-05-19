package Solucion_Reto_02;

public class Principal {
    public static void main(String[] args) {
        // factura con RFC
        Factura facturaConRFC = new Factura(2000.0, "Servicio de consultoría", "ABCD010101UTV");

        // factura sin RFC (se pasa null)
        Factura facturaSinRFC = new Factura(1000.0, "Reparación de equipo", null);

        // mostrar ambas facturas
        System.out.println(facturaConRFC.getResumen());
        System.out.println(facturaSinRFC.getResumen());
    }
}