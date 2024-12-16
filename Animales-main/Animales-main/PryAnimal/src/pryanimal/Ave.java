package pryanimal;


public class Ave extends Animal{
    public double envergaduraAlas;

    public Ave(double envergaduraAlas, String nombre, int edad) {
        super(nombre, edad);
        this.envergaduraAlas = envergaduraAlas;
        
    }

    public double getEnvergaduraAlas() {
        return envergaduraAlas;
    }

    public void setEnvergaduraAlas(double envergaduraAlas) {
        this.envergaduraAlas = envergaduraAlas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public void volar(){
        System.out.println(nombre+" está volando con una envergadura de "+envergaduraAlas+" metros.");
        
    }
}
