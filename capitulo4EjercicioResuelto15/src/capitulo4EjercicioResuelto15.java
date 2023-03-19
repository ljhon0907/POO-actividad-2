import java.util.Scanner;

public class capitulo4EjercicioResuelto15 {

    /*
    Se tienen cuatro esferas (A, B, C, D) de las cuales se sabe que tres son de igual peso y una
    diferente. Elaborar un algoritmo que determine cuál es la esfera diferente y si es de mayor
    o menor peso.
     */

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese el peso de la esfera A: ");
        double pesoA = entrada.nextDouble();
        System.out.print("Ingrese el peso de la esfera B: ");
        double pesoB = entrada.nextDouble();
        System.out.print("Ingrese el peso de la esfera C: ");
        double pesoC = entrada.nextDouble();
        System.out.print("Ingrese el peso de la esfera D: ");
        double pesoD = entrada.nextDouble();

        if (pesoA == pesoB && pesoA == pesoC) {
            if (pesoD > pesoA) {
                System.out.println("La esfera D es la diferente y es de mayor peso");
            } else {
                System.out.println("La esfera D es la diferente y es de menor peso");
            }
        } else if (pesoA == pesoB && pesoA == pesoD) {
            System.out.println("La esfera C es la diferente");
            if (pesoC > pesoA) {
                System.out.println("y es de mayor peso");
            } else {
                System.out.println("y es de menor peso");
            }
        } else if (pesoA == pesoC && pesoA == pesoD) {
            System.out.println("La esfera B es la diferente");
            if (pesoB > pesoD) {
                System.out.println("y es de mayor peso");
            } else {
                System.out.println("y es de menor peso");
            }
        } else {
            System.out.println("La esfera A es la diferente");
            if (pesoA > pesoB) {
                System.out.println("y es de mayor peso");
            } else {
                System.out.println("y es de menor peso");
            }
        }
    }

}
