import java.util.ArrayList;
import java.util.List;

public class InterfazList {

    
        private static void imprimirLista(List<String> arraylist)
        {

        
            // The loop must be inside the main method
            for (int i = 0; i < arraylist.size(); i++) 
            {
                System.out.println("Imprimiendo elemento " + i);
                //System.out.println(i);
                System.out.println(arraylist.get(i));
                System.out.println("\n");

            }
        }

        public static void main(String[] args) {
            List<String> lista = new ArrayList<>();
            lista.add("cadena 1"); // agregar elementos al ArrayList
            lista.add("cadena 2");
            lista.add("cadena 3");
            lista.add("cadena 4");
            lista.add("cadena 5");

            //imprimirLista(lista);

            //lista.addFirst("String de prueba");

            //imprimirLista(lista);

            //lista.set(3,"Cambiando Strings");

            //imprimirLista(lista);

            //lista.remove(4);

            //imprimirLista(lista);

            //lista.removeFirst();

            imprimirLista(lista);


        }


        

}
