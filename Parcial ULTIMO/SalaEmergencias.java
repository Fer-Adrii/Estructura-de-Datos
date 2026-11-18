import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

/*
 * ============================================================
 *  SALA DE EMERGENCIAS
 *  Estructura de Datos - UNIMINUTO
 * ============================================================
 *  Nombre completo: Adrian Ferney Martinez Garcia
 *
 *  INSTRUCCIONES
 *  1. Ejecuta el programa y mira la salida en la consola.
 *  2. Responde las 8 preguntas (P1 a P8). Escribe tu respuesta
 *     en la línea "// R:" que está debajo de cada pregunta.
 *  3. Respuestas cortas: la respuesta y una frase de por qué.
 *  4. No borres ni cambies el código de este archivo.
 * ============================================================
 */
public class SalaEmergencias {

    // Clase Paciente: el "molde" de cada paciente.
    // Va dentro de SalaEmergencias (por eso lleva static).
    static class Paciente implements Comparable<Paciente> {

        private String nombre;
        private int gravedad;   // 1 Leve, 2 Moderada, 3 Grave, 4 Muy grave

        public Paciente(String nombre, int gravedad) {
            this.nombre = nombre;
            this.gravedad = gravedad;
        }
        // P1. En "this.nombre = nombre", ¿cuál de los dos es el atributo
        //     del paciente y cuál es el dato que llegó entre paréntesis?
        // R: "this.nombre" es el atributo del paciente y "nombre" es el parámetro que llegó entre paréntesis; se usa "this" para diferenciar el atributo del parámetro que tienen el mismo nombre.

        public String getNombre() {
            return nombre;
        }

        public int getGravedad() {
            return gravedad;
        }

        public String getGravedadTexto() {
            switch (gravedad) {
                case 1: return "Leve";
                case 2: return "Moderada";
                case 3: return "Grave";
                case 4: return "Muy grave";
                default: return "Desconocida";
            }
        }
        // P2. Si un paciente tuviera gravedad 7, ¿qué texto mostraría? ¿Por qué?
        // R: Mostraría "Desconocida", porque el switch solo contempla los casos 1 a 4 y cualquier otro valor entra en la opción "default".

        @Override
        public String toString() {
            return nombre + " (" + getGravedadTexto() + ")";
        }

        @Override
        public int compareTo(Paciente otro) {
            return Integer.compare(otro.gravedad, this.gravedad);
        }
        // P3. compareTo decide quién va primero en el triage.
        //     Si se escribiera Integer.compare(this.gravedad, otro.gravedad),
        //     ¿quién saldría primero: el más grave o el menos grave?
        // R: Saldría primero el menos grave, porque comparar "this.gravedad" contra "otro.gravedad" ordena de menor a mayor (ascendente).
    }

    public static void main(String[] args) {

        // ---------- 1. SALA DE ESPERA (Queue: orden de llegada) ----------
        Queue<Paciente> salaEspera = new LinkedList<>();
        salaEspera.offer(new Paciente("Juan", 1));
        salaEspera.offer(new Paciente("Raquel", 3));
        salaEspera.offer(new Paciente("Ignacio", 2));
        salaEspera.offer(new Paciente("Omar", 4));
        salaEspera.offer(new Paciente("Beatriz", 3));
        salaEspera.offer(new Paciente("Xochilt", 1));
        System.out.println("Orden de llegada: " + salaEspera);
        // P4. ¿Por qué Juan aparece de primero en la sala de espera?
        // R: Porque "salaEspera" es una Queue (FIFO: primero en entrar, primero en salir) y Juan fue el primero en entrar con offer().

        // ---------- 2. TRIAGE (PriorityQueue: el más grave primero) ----------
        PriorityQueue<Paciente> triage = new PriorityQueue<>();
        while (!salaEspera.isEmpty()) {
            triage.offer(salaEspera.poll());
        }
        System.out.println("Paciente mas urgente: " + triage.peek());
        System.out.println();
        // P5. Al terminar este while, ¿cuántos pacientes quedan en salaEspera? ¿Por qué?
        // R: Quedan 0 pacientes, porque poll() extrae y elimina cada elemento de la cola hasta vaciarla por completo.

        // ---------- 3. ATENCIÓN E HISTORIAL (Stack: el último queda arriba) ----------
        Stack<Paciente> historial = new Stack<>();
        while (!triage.isEmpty()) {
            Paciente atendido = triage.poll();
            System.out.println("Atendiendo a: " + atendido);
            historial.push(atendido);
        }
        // P6. Juan llegó de primero, pero lo atienden de quinto. ¿Por qué?
        // R: Porque "triage" es una PriorityQueue que prioriza por gravedad descendente (4, 3, 3, 2, 1, 1) por encima del orden de llegada.

        System.out.println();
        System.out.println("Ultimo paciente atendido: " + historial.peek());
        System.out.println("Total atendidos: " + historial.size());
        // P7. ¿Por qué historial.peek() muestra a Xochilt y no a Omar?
        // R: Porque "historial" es un Stack (LIFO: último en entrar, primero en salir) y Xochilt fue la última en ser apilada con push().

        // P8. ¿Qué diferencia hay entre peek() y poll()? Da un ejemplo de este código.
        // R: peek() solo consulta el primer elemento sin eliminarlo, mientras que poll() lo obtiene y lo saca de la estructura; por ejemplo, triage.peek() muestra a Omar sin quitarlo del triage y triage.poll() lo saca para atenderlo.
    }
}
