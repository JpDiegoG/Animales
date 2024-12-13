
package pryanimal;


public class PryAnimal {


    public static void main(String[] args) {
        Mamifero mamifero=new Mamifero("Tigre", 10, "Robusto");
        mamifero.Comer();
        mamifero.amamantarCrias();
        
        Ave ave=new Ave(2.5, "Aguila", 7);
        ave.Comer();
        ave.volar();

        Reptil reptil=new Reptil("lisas", "Cobra", 9);
        reptil.Comer();
        reptil.arrastrarse();
    }
    
}
