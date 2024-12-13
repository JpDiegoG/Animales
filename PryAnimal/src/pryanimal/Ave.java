
package pryanimal;


public class Ave extends Animal{
    public double envergaduraAlas;

    public Ave(double envergaduraAlas, String nombre, int edad) {
        super(nombre, edad);
        this.envergaduraAlas = envergaduraAlas;
    }
    
    public void volar(){
        System.out.println(nombre+" está volando con una envergadura de "+envergaduraAlas+" metros");
    }
    
}
