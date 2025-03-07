package Estudiante; 

        public class estudiante {
    // Propiedades privadas
    private String nombre;
    private int edad;
    private double notaPromedio;

    // Constructor
    public estudiante(String nombre, int edad, double notaPromedio) {
        this.nombre = nombre;
        this.edad = edad;
        this.notaPromedio = notaPromedio;
    }

    // Métodos get y set para nombre
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Métodos get y set para edad con validación
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad >= 0) {
            this.edad = edad;
        } else {
            System.out.println("La edad no puede ser negativa.");
        }
    }

    // Métodos get y set para notaPromedio con validación
    public double getNotaPromedio() {
        return notaPromedio;
    }

    public void setNotaPromedio(double notaPromedio) {
        if (notaPromedio >= 0 && notaPromedio <= 10) {
            this.notaPromedio = notaPromedio;
        } else {
            System.out.println("La nota promedio debe estar entre 0 y 10.");
        }
    }
}
