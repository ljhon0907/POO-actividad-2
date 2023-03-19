import java.util.Scanner;

public class capitulo4EjercicioPropuesto24 {

    /*
    Se tienen tres esferas (A,B,C) de diferente peso, elaborar un algoritmo que determine cuál es
    la esfera de mayor peso
     */

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("El peso de esfera A: ");
        double pesoA = entrada.nextDouble();

        System.out.print("El peso de esfera B: ");
        double pesoB = entrada.nextDouble();

        System.out.print("El peso de esfera C: ");
        double pesoC = entrada.nextDouble();

        if (pesoA > pesoB && pesoA > pesoC) {
            System.out.println("La esfera A es la de mayor peso");
        } else if (pesoB > pesoA && pesoB > pesoC) {
            System.out.println("La esfera B es la de mayor peso");
        } else {
            System.out.println("La esfera C es la de mayor peso");
        }
    }
}

