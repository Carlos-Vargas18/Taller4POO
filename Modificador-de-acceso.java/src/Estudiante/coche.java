/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Estudiante;

public class coche {
    // Propiedades privadas
    private String marca;
    private String modelo;
    private double velocidadMaxima;

    // Constructor
    public coche(String marca, String modelo, double velocidadMaxima) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadMaxima = velocidadMaxima;
    }

    // Métodos get para marca y modelo
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    // Método get para velocidadMaxima
    public double getVelocidadMaxima() {
        return velocidadMaxima;
    }

    // Método acelerar con validación
    public void acelerar(double incremento) {
        if (incremento > 0) {
            velocidadMaxima += incremento;
        } else {
            System.out.println("El incremento debe ser positivo.");
        }
    }
}
