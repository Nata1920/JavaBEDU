package Solucion_Reto_02;

import java.util.Optional;

public class Factura {
    // atributos privados para encapsular los datos
    private double monto;
    private String descripcion;
    private Optional<String> rfc; // manejo seguro del valor nulo

    // constructor: convierte el RFC en Optional, puede ser null
    public Factura(double monto, String descripcion, String rfc) {
        this.monto = monto;
        this.descripcion = descripcion;
        this.rfc = Optional.ofNullable(rfc);
    }

    // metodo público que devuelve un resumen de la factura
    public String getResumen() {
        String resumen = "Factura generada:\n";
        resumen += "Descripción: " + descripcion + "\n";
        resumen += "Monto: $" + monto + "\n";

        // si el RFC está presente, se muestra. Si no, se muestra mensaje alternativo.
        resumen += "RFC: " + rfc.orElse("[No proporcionado]") + "\n";

        return resumen;
    }
}
