package pryanimal;

import java.util.Scanner;

public class PryAnimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            System.out.println("Seleccione la clase con la que desea trabajar:");
            System.out.println("1. Mamífero");
            System.out.println("2. Ave");
            System.out.println("3. Reptil");
            System.out.print("Opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el tipo de pelaje del animal");
                    String pelajeMamifero = scanner.nextLine();
                    System.out.println("Ingrese el nombre del mamífero:");
                    String nombreMamifero = scanner.nextLine();
                    System.out.println("Ingrese la edad del mamífero:");
                    int edad = scanner.nextInt();
                    scanner.nextLine();

                    Mamifero mamifero = new Mamifero(pelajeMamifero, nombreMamifero, edad);
                    mamifero.datosdelAnimal();
                    mamifero.Comer();
                    mamifero.amamantarCrias();
                    mamifero.pelajedelAnimal();
                    break;

                case 2:

                    System.out.println("Ingrese el nombre del ave:");
                    String nombreAve = scanner.nextLine();
                    System.out.println("Ingrese la edad del ave:");
                    int edadAve = scanner.nextInt();
                    System.out.println("Ingrese la envergadura de las alas del ave:");
                    double envergaduraAlasAve = scanner.nextDouble();
                    scanner.nextLine();

                    Ave ave = new Ave(envergaduraAlasAve, nombreAve, edadAve);
                    ave.datosdelAnimal();
                    ave.Comer();
                    ave.volar();
                    break;

                case 3: 
                    System.out.println("Ingrese el tipo de escamas reptil:");
                    String escamasReptil = scanner.nextLine();
                    System.out.println("Ingrese el nombre del reptil:");
                    String nombreReptil = scanner.nextLine();
                    System.out.println("Ingrese la edad del reptil:");
                    int edadReptil = scanner.nextInt();

                    Reptil reptil = new Reptil(escamasReptil, nombreReptil, edadReptil);
                    reptil.datosdelAnimal();
                    reptil.Comer();
                    reptil.arrastrarse();
                    break;

                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
    }
}