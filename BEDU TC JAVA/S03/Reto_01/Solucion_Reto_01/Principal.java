package Solucion_Reto_01;

public class Principal {
    public static void main(String[] args) {
        // crear un pasajero
        Pasajero pasajero = new Pasajero("Gabriela Agreste", "P445667");

        // crear un vuelo
        Vuelo vuelo = new Vuelo("UX123", "París", "14:00");

        // reservar asiento
        boolean reservado = vuelo.reservarAsiento(pasajero);
        if (reservado) {
            System.out.println("Reserva realizada con éxito.\n");
        } else {
            System.out.println("No se pudo realizar la reserva.\n");
        }

        // mostrar itinerario
        System.out.println(vuelo.obtenerItinerario());

        // cancelar reserva
        System.out.println("Cancelando reserva...\n");
        vuelo.cancelarReserva();

        // mostrar itinerario actualizado
        System.out.println(vuelo.obtenerItinerario());

        // realizamos una nueva reservacion
        vuelo.reservarAsiento("Mario Gonzalez", "P987654");
        System.out.println(vuelo.obtenerItinerario());
    }
}