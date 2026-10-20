import java.util.Vector;

public class Operaciones_vectores {
    public static void main(String[] args) {
        Vector <String> estudiantes = new Vector<>(4);
        //Creacion de elementos 
        estudiantes.add("Ana");
        estudiantes.add("Luis");
        estudiantes.add("Sara");
        estudiantes.add("Mon");
        estudiantes.add("Andres");
        estudiantes.add("Mila");
        estudiantes.add("Coco");
        estudiantes.add("lisa");
        estudiantes.add("Adrian");
        estudiantes.add("Ana");
        estudiantes.add("Luis");
        estudiantes.add("Sara");
        estudiantes.add("Mon");
        estudiantes.add("Andres");
        estudiantes.add("Mila");
        estudiantes.add("Coco");
        estudiantes.add("lisa");
        
        //Operaciones de vectores

        //Obtener indice por medio de get()
        System.out.println(estudiantes);
        System.out.println(estudiantes.get(1));
        System.out.println(estudiantes.size());

        //Sustituir un elemento del vecrtor por medio de indice y valor a cambiar
        estudiantes.set(0, "Adrian");
        System.out.println(estudiantes.get(0));

        //Ver tamaño y capacidad del vector
        System.out.println("Tamaño : "+ estudiantes.size());
        System.out.println("Capacidad : "+ estudiantes.capacity());

        //Remover elemento por indice y valor
        estudiantes.remove(1);
        estudiantes.remove("Mon");

        //Mostrar la cantidad de elementos del vector (size) y la capacidad de elementos de dicho vector(capacity)
        System.out.println(estudiantes);
        System.out.println("Tamaño : "+ estudiantes.size());
        System.out.println("Capacidad : "+ estudiantes.capacity());



    }
    
}
