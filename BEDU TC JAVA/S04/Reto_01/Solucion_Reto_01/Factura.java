package Solucion_Reto_01;

// clase que representa una factura para un sistema contable
public class Factura {

    // atributos de la factura
    private String folio;
    private String cliente;
    private double total;

    // constructor con parámetros para inicializar todos los campos
    public Factura(String folio, String cliente, double total) {
        this.folio = folio;
        this.cliente = cliente;
        this.total = total;
    }

    // metodo toString() para representar el objeto de forma legible

    public String toString() {
        return "Factura folio=" + folio + ", cliente=" + cliente + ", total=$" + total + " ";
    }

    // metodo equals() para comparar si dos facturas tienen el mismo folio

    public boolean equals(Object obj) {
        if (this == obj) return true; // mismo objeto en memoria
        if (obj == null || getClass() != obj.getClass()) return false;

        Factura otra = (Factura) obj;
        return this.folio.equals(otra.folio); // comparamos solo el folio
    }

    // metodo hashCode() consistente con equals(), basado en el folio

    public int hashCode() {
        return folio.hashCode();
    }
}
