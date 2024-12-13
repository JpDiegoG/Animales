
package pryanimal;


public class Reptil extends Animal{
    public String tipoEscamas;

    public Reptil(String tipoEscamas, String nombre, int edad) {
        super(nombre, edad);
        this.tipoEscamas = tipoEscamas;
    }
    
    public void arrastrarse(){
        System.out.println(nombre+" se está arrastrando con sus escamas de tipo "+tipoEscamas);
    }
    
}
