
package pryanimal;

public class Animal {
    public String nombre;
    public int edad;

    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    public void datosdelAnimal(){
        System.out.println(nombre+" tiene una edad de "+edad+" años.");
    }
    public void Comer(){
        System.out.println(nombre+" está comiendo.");
    }
    public void Dormir(){
        System.out.println(nombre+" está durmiendo.");
    
    }
    
}
