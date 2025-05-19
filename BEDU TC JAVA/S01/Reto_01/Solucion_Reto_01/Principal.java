package Solucion_Reto_01;

import java.util.Scanner;

public class Principal {

    // metodo main donde se solicita la información del usuario
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // crear un objeto de tipo Paciente
        Paciente paciente1 = new Paciente();

        // solicitar y asignar los datos ingresados del el usuario
        System.out.print("Ingresa el nombre del paciente: ");
        paciente1.nombre = scanner.nextLine();

        System.out.print("Ingresa la edad: ");
        paciente1.edad = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer

        System.out.print("Ingresa el número de expediente: ");
        paciente1.numeroExpediente = scanner.nextLine();

        // mostrar los datos ingresados
        paciente1.mostrarInformacion();

        // cerrar el scanner
        scanner.close();
    }

}
