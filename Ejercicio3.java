import javax.swing.JOptionPane;

public class Ejercicio3 {

    public static void main(String[] args) {
        String numeroMotor = JOptionPane.showInputDialog("Ingrese el número de motor:");
        int ventanas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de ventanas:"));
        int puertas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de puertas:"));
        String marca = JOptionPane.showInputDialog("Ingrese la marca:");
        String modelo = JOptionPane.showInputDialog("Ingrese el modelo:");
        int kilometrajeInicial = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el kilometraje inicial:"));
        int kilometrajeFinal = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el kilometraje final:"));

        int kilometrosRecorridos = calcularKilometrosRecorridos(kilometrajeInicial, kilometrajeFinal);

        String informacion = String.format("""
            Vehículo:
            Número de motor: %s
            Ventanas: %d
            Puertas: %d
            Marca: %s
            Modelo: %s
            Kilómetros recorridos: %d
            """, numeroMotor, ventanas, puertas, marca, modelo, kilometrosRecorridos);

        JOptionPane.showMessageDialog(null, informacion);
    }

    public static int calcularKilometrosRecorridos(int inicial, int fin) {
        return fin - inicial;
    }
}
