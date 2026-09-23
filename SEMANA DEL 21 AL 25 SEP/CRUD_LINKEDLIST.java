
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
        System.out.println(materias);
        System.out.println(materias.set(materias.indexOf("matematicas"), "matematicas aplicadas"));
        System.out.println(materias);
    }
}
