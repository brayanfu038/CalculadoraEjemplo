import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        double num1, num2, resultado;
        int operacion;

        // Mostrar un menú de opciones al usuario
        System.out.println("Calculadora en Java");
        System.out.println("Selecciona una operación:");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");

        // Leer la opción de operación
        operacion = scanner.nextInt();

        // Leer los dos números con los que se va a operar
        System.out.print("Introduce el primer número: ");
        num1 = scanner.nextDouble();

        System.out.print("Introduce el segundo número: ");
        num2 = scanner.nextDouble();

        // Realizar la operación seleccionada
        switch (operacion) {
            case 1:
                resultado = num1 + num2;
                System.out.println("Resultado: " + resultado);
                break;
            case 2:
                resultado = num1 - num2;
                System.out.println("Resultado: " + resultado);
                break;
            case 3:
                
                break;
            case 4:
               
            default:
                System.out.println("Opción no válida.");
        }

        // Cerrar el scanner
        scanner.close();
    }
}
