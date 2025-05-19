package Solucion_Reto_02;

// clase principal para probar el sistema de entradas
public class Principal {
    public static void main(String[] args) {
        Entrada entrada1 = new Entrada("Concierto de Lady GAGA", 12000.00);
        Entrada entrada2 = new Entrada("Obra de Teatro de Literal", 450.50);

        entrada1.mostrarInformacion();
        entrada2.mostrarInformacion();

        //reto adicional
        Entrada_Record entrada3= new Entrada_Record("Orquesta Sinfonica", 1200.00);
        entrada3.mostrarInformacion();
    }
}
