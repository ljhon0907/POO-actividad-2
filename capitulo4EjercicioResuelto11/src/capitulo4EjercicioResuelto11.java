import java.util.Scanner;

public class capitulo4EjercicioResuelto11 {
    /*
    Escribir un algoritmo que acepte tres números enteros diferentes y muestre el mayor de
    ellos.
     */

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("El número 1: ");
        double num1 = entrada.nextDouble();

        System.out.print("El número 2: ");
        double num2 = entrada.nextDouble();

        System.out.print("El número 3: ");
        double num3 = entrada.nextDouble();

        double mayor;

        if (num1 > num2 && num1 > num3) {
            mayor = num1;
        }

        else if (num2 > num3) {
            mayor = num2;
        }

        else {
            mayor = num3;
        }

        System.out.println("El mayor entre " + num1 + ", " + num2 + ", " + num3 + " es: "  + mayor);

    }
}
