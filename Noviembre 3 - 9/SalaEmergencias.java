import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

// Clase Paciente: va en el mismo archivo, sin "public"
class Paciente implements Comparable<Paciente> {
    private String nombre;
    private int gravedad; // 1: Leve, 2: Moderada, 3: Grave, 4: Muy grave

    // PASO 1: Constructor y Getters
    public Paciente(String nombre, int gravedad) {
        this.nombre = nombre;
        this.gravedad = gravedad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getGravedad() {
        return gravedad;
    }

    // PASO 2: getGravedadTexto() y toString()
    public String getGravedadTexto() {
        switch (gravedad) {
            case 1: return "Leve";
            case 2: return "Moderada";
            case 3: return "Grave";
            case 4: return "Muy grave";
            default: return "Desconocida";
        }
    }

    @Override
    public String toString() {
        return nombre + " (" + getGravedadTexto() + ")";
    }

    // PASO 5: compareTo() para ordenar por gravedad en la PriorityQueue
    @Override
    public int compareTo(Paciente otro) {
        // Comparamos de forma inversa para que el número mayor (más grave) tenga mayor prioridad
        return Integer.compare(otro.gravedad, this.gravedad);
    }
}

public class SalaEmergencias {

    public static void main(String[] args) {

        // PASO 1 y 2: Prueba inicial de la clase Paciente
        Paciente p = new Paciente("Juan", 1);
        System.out.println(p.getNombre() + " - gravedad " + p.getGravedad());
        System.out.println(p);
        System.out.println();

        // PASO 3: Registro de pacientes en la sala de espera (Queue)
        Queue<Paciente> salaEspera = new LinkedList<>();
        salaEspera.offer(new Paciente("Juan", 1));
        salaEspera.offer(new Paciente("Raquel", 3));
        salaEspera.offer(new Paciente("Ignacio", 2));
        salaEspera.offer(new Paciente("Omar", 4));
        salaEspera.offer(new Paciente("Beatriz", 3));
        salaEspera.offer(new Paciente("Xochilt", 1));

        System.out.println("Orden de llegada: " + salaEspera);
        System.out.println();

        // PASO 4 y 5: Pasar pacientes al Triage (PriorityQueue)
        PriorityQueue<Paciente> triage = new PriorityQueue<>();
        while (!salaEspera.isEmpty()) {
            triage.offer(salaEspera.poll());
        }

        System.out.println("Paciente mas urgente: " + triage.peek());
        System.out.println();

        // PASO 6: Atención médica e Historial (Stack)
        Stack<Paciente> historial = new Stack<>();
        while (!triage.isEmpty()) {
            Paciente atendido = triage.poll();
            System.out.println("Atendiendo a: " + atendido);
            historial.push(atendido);
        }

        System.out.println();
        System.out.println("Ultimo paciente atendido: " + historial.peek());
        System.out.println("Total atendidos: " + historial.size());
    }
}