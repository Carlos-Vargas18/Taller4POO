/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Estudiante;

public class persona {
    private String nombre;

    public persona(String nombre) {
        this.nombre = nombre;
    }

    // Método get para nombre (añadido para evitar errores en la clase de prueba)
    public String getNombre() {
        return nombre;
    }
}