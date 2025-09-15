package Pregunta_2;
import java.util.Scanner; //IMPORTAR LA CLASE SCANNER

public class Usuario {

	public static void main(String[] args) {
		 Scanner usuario= new Scanner(System.in);
		 //Escribe un programa que solicite al usuario ingresar dos números enteros y realice la  división.
		// Implementa manejo de excepciones para evitar ArithmeticException (división entre cero).
		 // Si ocurre un error, muestra un mensaje: “Error: división entre cero no permitida”.
		 
        System.out.print("Ingrese el primer numero (entero): ");
        int dividendo = usuario.nextInt();

        System.out.print("Ingrese el segundo numero (entero): ");
        int divisor = usuario.nextInt();

        try {
            // Intentamos realizar la división
            int resultado = dividendo / divisor;
            System.out.println("Resultado de la división: " + resultado);
        } catch (ArithmeticException e) {
            // Capturamos la excepción en caso de división entre cero
            System.out.println("Error: división entre cero no permitida");
        }

        usuario.close();
    }
}