/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Estudiante;

public class producto {
    private double precio;

    public producto(double precio) {
        this.precio = precio;
    }

    // Método get para precio (añadido para evitar errores en la clase de prueba)
    public double getPrecio() {
        return precio;
    }

    // Método set para precio (añadido para evitar errores en la clase de prueba)
    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
