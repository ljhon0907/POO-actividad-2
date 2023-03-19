import java.util.Scanner;

public class capitulo4EjercicioResuelto7 {

    /*
    Hacer un algoritmo que, dados dos valores numéricos A y B, escriba un mensaje diciendo
    si A es mayor, menor o igual a B.
     */

    public static void main(String[] args) {

    Scanner entra = new Scanner(System.in);

        System.out.print("Ingrese el valor A: ");
        double A = entra.nextDouble();
        System.out.print("Ingrese el valor B: ");
        double B = entra.nextDouble();

        if (A > B) {
            System.out.println("A es mayor que B");
        } else if (A < B) {
            System.out.println("A es menor que B");
        } else {
            System.out.println("A es igual a B");
        }
    }
}
