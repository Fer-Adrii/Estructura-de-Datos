import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DepuracionMaterias {

    public static void main(String[] args) {

        List<String> materias = new ArrayList<>();
        materias.add("Calculo I");
        materias.add("Piloto Robotica");
        materias.add("Programacion II");
        materias.add("Piloto ingles");
        materias.add("Bases de Datos");
        materias.add("Fisica I");

        System.out.println("Lista original de materias: " + materias);
        System.out.println("\nRevisando materia por materia...");

        Iterator<String> it = materias.iterator();
        while (it.hasNext()) {
            String materia = it.next();
            System.out.println("Revisando: " + materia);

            if (materia.startsWith("Piloto")) {
                it.remove(); 
                System.out.println("  -> Eliminada (materia piloto descontinuada)");
            }
        }

        System.out.println("\nLista depurada final: " + materias);
    }
}
