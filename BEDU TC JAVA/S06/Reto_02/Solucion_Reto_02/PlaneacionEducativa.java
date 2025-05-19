package Solucion_Reto_02;

import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ConcurrentHashMap;

// paso 1: definimos la clase Tema e implementamos Comparable para ordenar por título
class Tema implements Comparable<Tema> {
    String titulo;
    int prioridad;

    public Tema(String titulo, int prioridad) {
        this.titulo = titulo;
        this.prioridad = prioridad;
    }

    public int compareTo(Tema otro) {
        return this.titulo.compareTo(otro.titulo); // orden natural: alfabético
    }

    public String toString() {
        return "Tema: " + titulo + " | Prioridad: " + prioridad;
    }
}

public class PlaneacionEducativa {
    public static void main(String[] args) {

        // paso 2: creamos una lista concurrente de temas usando copyonwritearraylist
        CopyOnWriteArrayList<Tema> temas = new CopyOnWriteArrayList<>();
        temas.add(new Tema("Lectura comprensiva", 2));
        temas.add(new Tema("Matemáticas básicas", 1));
        temas.add(new Tema("Cuidado del medio ambiente", 3));

        // paso 3: ordenamos los temas alfabéticamente usando Comparable
        Collections.sort(temas);
        System.out.println("📚 Temas ordenados alfabéticamente:");
        for (Tema t : temas) {
            System.out.println(t);
        }

        // paso 4: ordenamos los temas por prioridad usando comparator
        temas.sort(new Comparator<Tema>() {
            public int compare(Tema a, Tema b) {
                return Integer.compare(a.prioridad, b.prioridad); // prioridad ascendente
            }
        });

        System.out.println("\n Temas ordenados por prioridad (1 = urgente):");
        for (Tema t : temas) {
            System.out.println(t);
        }

        // paso 5: creamos un mapa concurrente de recursos usando concurrenthashmap
        ConcurrentHashMap<String, String> recursos = new ConcurrentHashMap<>();
        recursos.put("Lectura comprensiva", "https://recursos.edu/lectura");
        recursos.put("Matemáticas básicas", "https://recursos.edu/mate");
        recursos.put("Cuidado del medio ambiente", "https://recursos.edu/ambiente");

        // paso 6: mostramos el repositorio de recursos por tema
        System.out.println("\n Repositorio de recursos por tema:");
        for (String tema : recursos.keySet()) {
            System.out.println(tema + " → " + recursos.get(tema));
        }
    }
}