package pryanimal;


public class Mamifero extends Animal{
    public String tipoPelaje;

    public Mamifero(String tipoPelaje, String nombre, int edad) {
        super(nombre, edad);
        this.tipoPelaje = tipoPelaje;
    
    }

    public String getTipoPelaje() {
        return tipoPelaje;
    }

    public void setTipoPelaje(String tipoPelaje) {
        this.tipoPelaje = tipoPelaje;
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
    public void amamantarCrias(){
        System.out.println(nombre+" está amamantando a sus crías.");
    }
    public void pelajedelAnimal(){
        System.out.println(nombre+" tiene un pelaje "+tipoPelaje+".");
    }
}
