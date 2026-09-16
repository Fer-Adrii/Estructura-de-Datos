import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class filaconsultorio {

    public static void main(String[] args) {

        List<String> fila = new ArrayList<>();
        fila.add("Adrian Martinez");
        fila.add("Luis Gonzalez");
        fila.add("Maria lopez");
        fila.add("juan garcia");
        fila.add("Sofia vega");

        System.out.println("=== Reporte de registro (orden de llegada) ===");
        ListIterator<String> itPos = fila.listIterator();
        while (itPos.hasNext()) {
            int posicion = itPos.nextIndex(); 
            String paciente = itPos.next();
            System.out.println("Posicion " + posicion + ": " + paciente);
        }

        System.out.println("\n=== Reporte inverso (mas reciente primero) ===");
        while (itPos.hasPrevious()) {
            int posicion = itPos.previousIndex();
            String paciente = itPos.previous();
            System.out.println("Posicion " + posicion + ": " + paciente);
        }

        while (itPos.nextIndex() < 2) {
            itPos.next(); 
        }
        itPos.add("URGENCIA - Pedro fernandez");
        System.out.println("\nPaciente de urgencia insertado en la posicion 2.");

        System.out.println("\n=== Fila final (con urgencia incluida) ===");
        ListIterator<String> itFinal = fila.listIterator();
        while (itFinal.hasNext()) {
            int posicion = itFinal.nextIndex();
            String paciente = itFinal.next();
            System.out.println("Posicion " + posicion + ": " + paciente);
        }
    }
}
