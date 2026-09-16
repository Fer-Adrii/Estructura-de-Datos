// Adrian Ferney Martinez Garcia 1086465  //
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class parcial_escdatos {
    public static void main(String[] args) {
        
        //LISTA BASE 4 ELEMENTOS//

        List<String> listaBase = new ArrayList<>();
        listaBase.add("Matemáticas");
        listaBase.add("Física Cuantica");
        listaBase.add("Química Avanzada");
        listaBase.add("Historia");

        //LISTA PROVEEDOR//

        String[] materiasProveedor = {
            "Piloto Comercial", 
            "Sociales", 
            "Piloto de Drones", 
            "Lenguas"
        };

        // Anhadir la lista de proveedor a la lista ya consolidada lista(base) //
        
        listaBase.addAll(Arrays.asList(materiasProveedor));

        // Muestra en pantalla la lista con la info del proveedor ya anhadida //
        
        System.out.println("=== LISTA CONSOLIDADA (ANTES DE DEPURAR) ===");
        System.out.println("Número total de materias: " + listaBase.size());
        System.out.println(listaBase);
        System.out.println();

        // Iterador el cual va a recorrer la lista buscando el prefijo "piloto" para eliminarlo //

        Iterator<String> iterador = listaBase.iterator();
        while (iterador.hasNext()) {
            String materia = iterador.next();
            if (materia.startsWith("Piloto")) {
                iterador.remove(); 
            }
        }

        // Muestra en pantalla la lista ya depurada //

        System.out.println("=== LISTA FINAL (DEPURADA) ===");
        System.out.println("Número total de materias: " + listaBase.size());
        System.out.println(listaBase);
    }
}
