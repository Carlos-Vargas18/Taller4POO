/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Estudiante;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Prueba de la clase Estudiante ===");
        pruebaEstudiante();

        System.out.println("\n=== Prueba de la clase Coche ===");
        pruebaCoche();

        System.out.println("\n=== Prueba de la clase Persona (Uso Incorrecto de private) ===");
        pruebaPersona();

        System.out.println("\n=== Prueba de la clase Producto (Falta de métodos get y set) ===");
        pruebaProducto();
    }

    // Método para probar la clase Estudiante
    public static void pruebaEstudiante() {
        // Crear una instancia de Estudiante
        estudiante estudiante = new estudiante("Juan", 20, 8.5);

        // Mostrar los valores iniciales
        System.out.println("Nombre inicial: " + estudiante.getNombre());
        System.out.println("Edad inicial: " + estudiante.getEdad());
        System.out.println("Nota Promedio inicial: " + estudiante.getNotaPromedio());

        // Modificar las propiedades usando los métodos set
        estudiante.setNombre("Carlos");
        estudiante.setEdad(22);
        estudiante.setNotaPromedio(9.0);

        // Mostrar los nuevos valores
        System.out.println("Nombre actualizado: " + estudiante.getNombre());
        System.out.println("Edad actualizada: " + estudiante.getEdad());
        System.out.println("Nota Promedio actualizada: " + estudiante.getNotaPromedio());

        // Intentar asignar valores inválidos
        estudiante.setEdad(-5); // Esto mostrará un mensaje de error
        estudiante.setNotaPromedio(11); // Esto también mostrará un mensaje de error
    }

    // Método para probar la clase Coche
    public static void pruebaCoche() {
        // Crear una instancia de Coche
        coche coche = new coche("Toyota", "Corolla", 180.0);

        // Mostrar los valores iniciales
        System.out.println("Marca: " + coche.getMarca());
        System.out.println("Modelo: " + coche.getModelo());
        System.out.println("Velocidad Máxima: " + coche.getVelocidadMaxima());

        // Acelerar el coche
        coche.acelerar(20.0);
        System.out.println("Nueva Velocidad Máxima: " + coche.getVelocidadMaxima());

        // Intentar acelerar con un incremento negativo
        coche.acelerar(-10.0); // Esto mostrará un mensaje de error
    }

    // Método para probar la clase Persona (Uso Incorrecto de private)
    public static void pruebaPersona() {
        // Crear una instancia de Persona
        persona persona = new persona("Juan");

        // Intentar acceder directamente a la propiedad privada (esto generará un error de compilación)
        // System.out.println(persona.nombre); // Error de compilación: nombre tiene acceso privado
        System.out.println("No se puede acceder directamente a 'nombre' porque es privado.");
        System.out.println("Nombre (usando getNombre): " + persona.getNombre()); // Acceso correcto usando get
    }

    // Método para probar la clase Producto (Falta de métodos get y set)
    public static void pruebaProducto() {
        // Crear una instancia de Producto
        producto producto = new producto(100.0);

        // Mostrar el precio usando el método get
        System.out.println("Precio inicial: " + producto.getPrecio());

        // Modificar el precio usando el método set
        producto.setPrecio(150.0);
        System.out.println("Precio actualizado: " + producto.getPrecio());
    }
}
