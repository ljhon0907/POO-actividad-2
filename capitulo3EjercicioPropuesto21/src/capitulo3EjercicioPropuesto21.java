import java.util.Scanner;

public class capitulo3EjercicioPropuesto21 {
    /*
    Dados los tres lados de un triángulo, haga un algoritmo que encuentre: perímetro,
    semiperímetro y el área del triángulo.

    semiperimetro :=  perimetro / 2
    area = sqrt(semiperimetro * (L1 - semiperimetro ) * ...)

     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la longitud del primer lado del triángulo: ");
        double lado1 = scanner.nextDouble();

        System.out.print("Ingrese la longitud del segundo lado del triángulo: ");
        double lado2 = scanner.nextDouble();

        System.out.print("Ingrese la longitud del tercer lado del triángulo: ");
        double lado3 = scanner.nextDouble();

        double perimetro = lado1 + lado2 + lado3;
        double semiperimetro = perimetro / 2;
        double area = Math.sqrt(semiperimetro * (semiperimetro - lado1) * (semiperimetro - lado2) * (semiperimetro - lado3));

        System.out.println("El perímetro del triángulo es: " + perimetro);
        System.out.println("El semiperímetro del triángulo es: " + semiperimetro);
        System.out.println("El área del triángulo es: " + area);

    }
}
