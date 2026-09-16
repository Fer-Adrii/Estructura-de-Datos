// Adrian Martinez - Cristian Cuervo//
class Animal {
    String nombre;
    String especie;
    int edad;
    String sonido; 
    Animal siguiente;       
    

    Animal(String nombre, String especie, int edad, String sonido) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
        this.sonido = sonido;
    }

    void mostrarInfo() {
        System.out.println(
            "Nombre: " + nombre +
            " | Especie: " + especie +
            " | Edad: " + edad
        );
    }

    void hacerSonido() {
        System.out.println(nombre + " hace: " + sonido);
    }
}

public class Main {
    public static void main(String[] args) {

        Animal a1 = new Animal("Rex", "Perro", 3, "Guau");
        Animal a2 = new Animal("Michi", "Gato", 2, "Miau");
        Animal a3 = new Animal("Piolin", "Ave", 1, "Pio");
        
        System.out.println("=== ANIMALES CREADOS ===");

        a1.mostrarInfo();
        a1.hacerSonido();

        a2.mostrarInfo();
        a2.hacerSonido();

        a3.mostrarInfo();
        a3.hacerSonido();
        
        a1.siguiente = a2;
        a2.siguiente = a3;
        a3.siguiente = null;   
        
        System.out.println("=== RECORRIDO POR MEDIO DE WHILE ===");

        Animal actual = a1;

        while (actual != null) {
             actual.mostrarInfo();
             actual.hacerSonido();
             actual = actual.siguiente;
}          
    }
}
