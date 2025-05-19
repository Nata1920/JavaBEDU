package Solucion_Reto_01;

import java.util.*;

public class RegistroMuestras {
    public static void main(String[] args) {

        // paso 1: arrayList para registrar el orden de llegada de las muestras genéticas
        ArrayList<String> muestras = new ArrayList<>();

        // agrega aqui los nombres de las especies en orden (pueden repetirse)
        muestras.add("Homo sapiens");
        muestras.add("Mus musculus");
        muestras.add("Arabidopsis thaliana");
        muestras.add("Homo sapiens");

        System.out.println("Muestras recibidas en orden:");
        for (int i = 0; i < muestras.size(); i++) {
            System.out.println((i + 1) + ". " + muestras.get(i));
        }

        // paso 2: hashset para obtener las especies únicas procesadas
        HashSet<String> especiesUnicas = new HashSet<>(muestras);

        System.out.println("\n Especies únicas procesadas:");
        for (String especie : especiesUnicas) {
            System.out.println("- " + especie);
        }

        // paso 3: hashmap para asociar el ID de muestra con el nombre del investigador
        HashMap<String, String> muestrasInvestigador = new HashMap<>();

        // agrega aquí las asociaciones ID -> investigador
        muestrasInvestigador.put("M-001", "Dr. Perez ");
        muestrasInvestigador.put("M-002", "Dr. Galeana ");
        muestrasInvestigador.put("M-003", "Dra. Baltazar ");

        System.out.println("\n Asignación de muestras a investigadores:");
        for (Map.Entry<String, String> entry : muestrasInvestigador.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // paso 4: busqueda de investigador por ID de muestra
        String idBuscar = "M-002"; // puedes cambiar este valor si lo deseas
        System.out.println("\n Investigador responsable de la muestra " + idBuscar + ": " + muestrasInvestigador.get(idBuscar));
    }
}