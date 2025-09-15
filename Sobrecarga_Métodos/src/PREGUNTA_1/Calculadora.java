package PREGUNTA_1;

public class Calculadora {
	// Acepta dos enteros y devuelve la suma
    public int sumar(int a, int b) {
        return a + b;
    }

    // Método sumar sobrecargado que acepta tres enteros y devuelve la suma
    public int sumar(int a, int b, int c) {
        return a + b + c;
    }

    // Método sumar sobrecargado que acepta dos números decimales y devuelve la suma
    public double sumar(double a, double b) {
        return a + b;
    }

	public static void main(String[] args) {
		Calculadora resultado = new Calculadora();

        // Resultado de la suma dos enteros
        System.out.println("Sumar 2 enteros: " + resultado.sumar(5, 10));

        // Resultado de la suma tres enteros
        System.out.println("Sumar 3 enteros: " + resultado.sumar(1, 2, 3));

        // Resultado de la suma dos números decimales
        System.out.println("Sumar 2 decimales: " + resultado.sumar(3.5, 4.7));

	}

}
