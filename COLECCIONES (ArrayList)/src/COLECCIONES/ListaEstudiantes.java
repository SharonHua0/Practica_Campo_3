/**
 * 
 */
package COLECCIONES;

/**
 * 
 */
import java.util.ArrayList;
import java.util.Scanner;

public class ListaEstudiantes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> estudiantes = new ArrayList<>();

        // Ingreso de nombres
        System.out.println("Ingresa los nombres de 5 estudiantes:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Estudiante " + (i + 1) + ": ");
            String nombre = scanner.nextLine();
            estudiantes.add(nombre);
        }


        // Mostrar lista completa
        System.out.println("Lista completa de estudiantes:");
        for (String nombre : estudiantes) {
            System.out.println(nombre);
        }

        // Eliminar el tercer nombre
        estudiantes.remove(2);

        // Mostrar la lista después de eliminar el tercer nombre
        System.out.println("\nLista después de eliminar el tercer nombre:");
        for (String nombre : estudiantes) {
            System.out.println(nombre);
        }
    }
}
