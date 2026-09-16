import java.util.ArrayList;
import java.util.Arrays; // Necesario para Arrays.asList
import java.util.List;

public class fruteria {
    public static void main(String[] args) {
        List<String> Consolidado = new ArrayList<>();

        String[] sem1 = {"Manzana", "Plátano", "Fresa", "Bolsas plásticas", "Balanza digital"};
        String[] sem2 = {"Mango", "Piña", "Papaya", "Cajas de cartón", "Etiquetas de precio"};
        String[] sem3 = {"Arándano", "Frambuesa", "Cereza", "Envases de plástico", "Guantes desechables"};
        String[] sem4 = {"Limón", "Mandarina", "Kiwi", "Malla protectora", "Cuchillos"};
        String[] sem5 = {"Melón", "Sandía", "Ciruela", "Bolsas biodegradables", "Tabla de picar"};

        // Convertimos el array a lista con Arrays.asList()
        Consolidado.addAll(Arrays.asList(sem1));
        Consolidado.addAll(Arrays.asList(sem2));
        Consolidado.addAll(Arrays.asList(sem3));
        Consolidado.addAll(Arrays.asList(sem4));
        Consolidado.addAll(Arrays.asList(sem5));

        // Imprimimos todo el inventario
        Consolidado.forEach(System.out::println);
    }
}
