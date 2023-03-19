import java.util.Scanner;

public class capitulo4EjercicioPropuesto23 {

    /*
    Dados los valores A, B y C que son los parámetros de una ecuación de segundo grado,
    elaborar un algoritmo para hallar las posibles soluciones de dicha ecuación.
     */

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Valor de A: ");
        double a = entrada.nextDouble();

        System.out.print("Valor de B: ");
        double b = entrada.nextDouble();

        System.out.print("Valor de C: ");
        double c = entrada.nextDouble();

        double discriminante = Math.pow(b, 2) - 4 * a * c;

        if (discriminante < 0) {
            System.out.println("Las soluciones no pertenecen a los reales.");
        } else if (discriminante == 0) {
            double x = -b / (2 * a);
            System.out.println("La solución es x (multiplicidad 2) = " + x);
        } else {
            double x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
            double x2 = (-b - Math.sqrt(discriminante)) / (2 * a);
            System.out.println("Las soluciones son x1 = " + x1 + " y x2 = " + x2);
        }
    }
}
