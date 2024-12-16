package pryanimal;


public class Reptil extends Animal{
    public String tipoEscamas;

    public Reptil(String tipoEscamas, String nombre, int edad) {
        super(nombre, edad);
        this.tipoEscamas = tipoEscamas;
    }

    public String getTipoEscamas() {
        return tipoEscamas;
    }

    public void setTipoEscamas(String tipoEscamas) {
        this.tipoEscamas = tipoEscamas;
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
    
    public void arrastrarse(){
        System.out.println(nombre+" se está arrastrando con sus escamas de tipo "+tipoEscamas+".");
    }
    
}
