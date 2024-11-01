import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el primer número:");
        double num1 = scanner.nextDouble();

        System.out.println("Ingrese el segundo número:");
        double num2 = scanner.nextDouble();

        System.out.println("Seleccione una operación: 1. Suma, 2. Resta, 3. Multiplicación, 4. División");
        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1 -> System.out.println("Resultado de la suma: " + sumar(num1, num2));
            case 2 -> System.out.println("Resultado de la resta: " + restar(num1, num2));
            case 3 -> System.out.println("Resultado de la multiplicación: " + multiplicar(num1, num2));
            case 4 -> System.out.println("Resultado de la división: " + dividir(num1, num2));
            default -> System.out.println("Opción no válida");
        }

        scanner.close();
    }

    public static double sumar(double a, double b) {
        return a + b;
    }

    public static double restar(double a, double b) {
        return a - b;
    }

    public static double multiplicar(double a, double b) {
        return a * b;
    }

    public static double dividir(double a, double b) {
        return b != 0 ? a / b : Double.NaN;
    }
}
