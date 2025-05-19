package Solucion_Reto_02;

public class Entrada {
    String evento;
    double precio;

    // constructor
    public Entrada(String evento, double precio) {
        this.evento = evento;
        this.precio = precio;
    }

    // metodo para mostrar los datos de la entrada
    public void mostrarInformacion() {
        System.out.println("Evento: " + evento + " | Precio: $" + precio);
    }
}
