import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cédula: ");
        String cedula = scanner.nextLine();

        System.out.print("Ingrese el nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese el apellido: ");
        String apellido = scanner.nextLine();

        System.out.print("Ingrese el género: ");
        String genero = scanner.nextLine();

        System.out.print("Ingrese el salario: ");
        double salario = scanner.nextDouble();

        System.out.print("Ingrese el año de nacimiento: ");
        int anioNacimiento = scanner.nextInt();

        System.out.print("Ingrese el año de ingreso: ");
        int anioIngreso = scanner.nextInt();

        LocalDate fechaNacimiento = LocalDate.of(anioNacimiento, 1, 1);
        LocalDate fechaIngreso = LocalDate.of(anioIngreso, 1, 1);

        int edad = calcularEdad(fechaNacimiento);
        int antiguedad = calcularAntiguedad(fechaIngreso);

        double prestaciones = calcularPrestaciones(antiguedad, salario);

        System.out.printf("""
                Empleado:
                Cédula: %s
                Nombre: %s %s
                Género: %s
                Edad: %d
                Antigüedad: %d años
                Prestaciones: %.2f
                """, cedula, nombre, apellido, genero, edad, antiguedad, prestaciones);

        scanner.close();
    }

    public static int calcularEdad(LocalDate fechaNacimiento) {
        return Period.between(fechaNacimiento, LocalDate.now()).getYears();
    }

    public static int calcularAntiguedad(LocalDate fechaIngreso) {
        return Period.between(fechaIngreso, LocalDate.now()).getYears();
    }

    public static double calcularPrestaciones(int antiguedad, double salario) {
        return (antiguedad * salario) / 12;
    }
}
