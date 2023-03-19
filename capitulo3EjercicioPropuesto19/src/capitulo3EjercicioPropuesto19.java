import java.util.Scanner;

public class capitulo3EjercicioPropuesto19 {

    /*
    Dado el valor del lado en un triángulo equilátero, haga un algoritmo que obtenga el
    perímetro, el valor de la altura y el área del triángulo.
     */

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Lado:");
        double lado = entrada.nextDouble();

        double perimetro = lado * 3;
        double altura = (Math.sqrt(3) / 2) * lado;
        double area = (Math.sqrt(3) / 4) * lado * lado;

        System.out.println("El perímetro del triángulo es: " + perimetro + " (unidades)");
        System.out.println("La altura del triángulo es: " + altura + " (unidades)");
        System.out.println("El área del triángulo es: " + " (unidades^2)");
    }
}



