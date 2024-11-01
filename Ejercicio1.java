import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

// Clase base Figura
abstract class Figura {
    public abstract double calcularArea();
    public abstract double calcularPerimetro();
}

// Clase Triangulo
class Triangulo extends Figura {
    private double base;
    private double altura;
    private double lado1;
    private double lado2;
    private double lado3;

    public Triangulo(double base, double altura, double lado1, double lado2, double lado3) {
        this.base = base;
        this.altura = altura;
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    @Override
    public double calcularArea() {
        return (base * altura) / 2;
    }

    @Override
    public double calcularPerimetro() {
        return lado1 + lado2 + lado3;
    }
}

// Clase Cuadrado
class Cuadrado extends Figura {
    private double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return lado * lado;
    }

    @Override
    public double calcularPerimetro() {
        return 4 * lado;
    }
}

// Clase Rectangulo
class Rectangulo extends Figura {
    private double largo;
    private double ancho;

    public Rectangulo(double largo, double ancho) {
        this.largo = largo;
        this.ancho = ancho;
    }

    @Override
    public double calcularArea() {
        return largo * ancho;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * (largo + ancho);
    }
}

// Clase principal
public class Ejercicio1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Triangulo
        System.out.println("Ingrese los datos del Triángulo:");
        System.out.print("Base: ");
        double base = Double.parseDouble(reader.readLine());
        System.out.print("Altura: ");
        double altura = Double.parseDouble(reader.readLine());
        System.out.print("Lado 1: ");
        double lado1 = Double.parseDouble(reader.readLine());
        System.out.print("Lado 2: ");
        double lado2 = Double.parseDouble(reader.readLine());
        System.out.print("Lado 3: ");
        double lado3 = Double.parseDouble(reader.readLine());

        Triangulo triangulo = new Triangulo(base, altura, lado1, lado2, lado3);
        System.out.println("Área del Triángulo: " + triangulo.calcularArea());
        System.out.println("Perímetro del Triángulo: " + triangulo.calcularPerimetro());

        // Cuadrado
        System.out.println("\nIngrese el dato del Cuadrado:");
        System.out.print("Lado: ");
        double lado = Double.parseDouble(reader.readLine());

        Cuadrado cuadrado = new Cuadrado(lado);
        System.out.println("Área del Cuadrado: " + cuadrado.calcularArea());
        System.out.println("Perímetro del Cuadrado: " + cuadrado.calcularPerimetro());

        // Rectangulo
        System.out.println("\nIngrese los datos del Rectángulo:");
        System.out.print("Largo: ");
        double largo = Double.parseDouble(reader.readLine());
        System.out.print("Ancho: ");
        double ancho = Double.parseDouble(reader.readLine());

        Rectangulo rectangulo = new Rectangulo(largo, ancho);
        System.out.println("Área del Rectángulo: " + rectangulo.calcularArea());
        System.out.println("Perímetro del Rectángulo: " + rectangulo.calcularPerimetro());
    }
}
