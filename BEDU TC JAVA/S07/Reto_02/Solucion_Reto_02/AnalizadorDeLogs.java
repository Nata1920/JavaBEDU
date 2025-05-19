package Solucion_Reto_02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class AnalizadorDeLogs {

    public static void main(String[] args) {
        // paso 1: definir la ruta del archivo de logs
        Path rutaLog = Paths.get("C:\\Users\\x360 11 G1\\Documents\\BEDU TC JAVA\\S07\\Reto_02\\Solucion_Reto_02\\errores.log"); // Path correcto
        Path rutaError = Paths.get("C:\\Users\\x360 11 G1\\Documents\\BEDU TC JAVA\\S07\\Reto_02\\Solucion_Reto_02\\registro.txt");

        int totalLineas = 0;
        int conteoErrores = 0;
        int conteoWarnings = 0;

        // paso 2: lectura eficiente usando try-with-resources y BufferedReader
        try (BufferedReader lector = Files.newBufferedReader(rutaLog)) {
            String linea;
            while ((linea = lector.readLine()) != null) {
                totalLineas++;
                if (linea.contains("ERROR")) {
                    conteoErrores++;
                }
                if (linea.contains("WARNING")) {
                    conteoWarnings++;
                }
            }

            // paso 3: mostrar resumen
            System.out.println("Análisis completado:");
            System.out.println("Total de líneas leídas: " + totalLineas);
            System.out.println("Total de errores (ERROR): " + conteoErrores);
            System.out.println("Total de advertencias (WARNING): " + conteoWarnings);

            double porcentajeErrores = (totalLineas > 0) ? ((double) conteoErrores / totalLineas) * 100 : 0;
            double porcentajeWarnings = (totalLineas > 0) ? ((double) conteoWarnings / totalLineas) * 100 : 0;

            System.out.printf("Porcentaje de líneas con errores: %.2f%%\n", porcentajeErrores);
            System.out.printf("Porcentaje de líneas con advertencias: %.2f%%\n", porcentajeWarnings);

        } catch (IOException e) {
            System.out.println("Error al procesar el archivo de logs: " + e.getMessage());

            // paso 4: registrar fallo en archivo externo
            try (BufferedWriter escritor = Files.newBufferedWriter(rutaError)) {
                escritor.write("Se produjo un error al leer el archivo 'errores.log': " + e.getMessage());
            } catch (IOException ex) {
                System.out.println("Además, no se pudo escribir en el archivo de registro de fallos.");
            }
        }
    }
}
