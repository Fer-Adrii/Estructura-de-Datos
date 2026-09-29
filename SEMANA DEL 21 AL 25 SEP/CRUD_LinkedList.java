    import java.util.Iterator;
    import java.util.LinkedList;
    // 1. CREAR la colección
    public class CRUD_LinkedList {

        public static void main(String[] args) {
            // 2. AGREGAR información 
            System.out.println("\n 2. AGREGAR información" );
            LinkedList<String> materias = new LinkedList<>();
            materias.add("matematicas");
            materias.add("ingles");
            materias.add("redes");
            materias.add("bases de datos");
            materias.add("programacion");
            
            materias.forEach(System.out::println);
            
            materias.addFirst("algoritmos");
            materias.addLast("inteligencia artificial");
            
            System.out.println("\n Se agrego algoritmos al inicio de la lista e inteligencia artificial al final");
            
            System.out.println(materias);

            materias.add(2, "estructura de datos");
            System.out.println(materias);

            // 3. CONSULTAR información
            System.out.println("\n 3. CONSULTAR información" );
            System.out.println("obtener elemento por indice 3: " + materias.get(3));
            System.out.println("obtener primer elemento: " + materias.getFirst());
            System.out.println("obtener ultimo elemento: " +materias.getLast());
            System.out.println("indice donde se encuentra elemento base de datos: " + materias.indexOf("bases de datos"));
            if (materias.contains("ingles"))
            {
                System.out.println("La lista contiene Ingles");
            }
            else{
                System.out.println("Error, la lista no tiene el elemento Ingles");
            }

            //4. MODIFICAR información
            System.out.println("\n 4. MODIFICAR información" );
            System.out.println("\nLista sin modificar " + materias);
            System.out.println(materias.set(materias.indexOf("matematicas"), "matematicas aplicadas"));
            System.out.println("\n Lista Modificada " + materias);

            // 5. ELIMINAR información
            System.out.println("\n 5. ELIMINAR información");
            materias.remove("ingles"); // Por nombre
            System.out.println("Después de eliminar 'ingles': " + materias);
            
            materias.remove(3); // Por posición (índice)
            System.out.println("Después de eliminar el índice 3: " + materias);
            
            materias.removeFirst(); // Primer elemento
            System.out.println("Después de eliminar el primer elemento: " + materias);
            
            materias.removeLast(); // Último elemento
            System.out.println("Después de eliminar el último elemento: " + materias);

            // 6. RECORRER la colección
            System.out.println("\n 6. RECORRER la colección");
            System.out.println("--- Recorrido con FOR clásico ---");
            for (int i = 0; i < materias.size(); i++) {
                System.out.println(materias.get(i));
            }

            System.out.println("\n--- Recorrido con FOR-EACH ---");
            for (String materia : materias) {
                System.out.println(materia);
            }
            // 7. CONTAR y verificar
            System.out.println("\n 7. CONTAR y verificar");
            System.out.println("Quedan almacenados " + materias.size() + " elementos.");
            if (materias.isEmpty()) {
                System.out.println("La lista está vacía.");
            } else {
                System.out.println("La lista contiene información.");
            }
            

            // 8. ELIMINAR TODOS los elementos
            System.out.println("\n 8. ELIMINAR TODOS los elementos");
            materias.clear();
            System.out.println("Lista después de aplicar clear(): " + materias);
            System.out.println("¿La lista está vacía? " + materias.isEmpty());

            // RETO ADICIONAL (Usando removeIf + startsWith)
        System.out.println("\n === RETO ADICIONAL ===");
        
        materias.add("matematicas");
        materias.add("Piloto Java");
        materias.add("bases de datos");
        materias.add("Piloto Python");
        materias.add("redes");
        materias.add("Piloto Web");
        
        System.out.println("Lista inicial con las materias Piloto:");
        System.out.println(materias);
        
        // Eliminación directa sin crear objeto Iterator explícito:
        materias.removeIf(materia -> materia.startsWith("Piloto"));

        System.out.println("\nLista final después de eliminar las materias Piloto:");
        System.out.println(materias);
            
            // Alternativa más corta disponible desde Java 8+:
            // materias.removeIf(materia -> materia.startsWith("Piloto"));

            System.out.println("\nLista final después de eliminar las materias Piloto:");
            System.out.println(materias);
        
        }
    }
