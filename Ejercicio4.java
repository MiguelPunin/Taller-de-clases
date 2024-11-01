import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el nombre del producto: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese el precio del producto: ");
        double precio = scanner.nextDouble();

        System.out.print("¿El producto tiene IVA? (true/false): ");
        boolean tieneIVA = scanner.nextBoolean();

        double precioFinal = calcularPrecioConIVA(precio, tieneIVA);

        System.out.println("El precio final del producto " + nombre + " es: " + precioFinal);

        scanner.close();
    }

    public static double calcularPrecioConIVA(double precio, boolean tieneIVA) {
        if (!tieneIVA) return precio;

        if (precio <= 500) return precio * 1.12;
        else if (precio <= 1500) return precio * 1.14;
        else return precio * 1.15;
    }
}
