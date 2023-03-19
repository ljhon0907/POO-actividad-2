import java.util.Scanner;

public class capitulo4EjercicioResuelto14 {

    /*
    Una empresa con tres departamentos tiene establecido un plan de incentivos para sus
    vendedores. Al final del período, a cada departamento se le pide el importe global de las
    ventas. A los departamentos que excedan el 33% de las ventas totales se les adiciona al
    salario de los vendedores un porcentaje equivalente al 20% del salario mensual. Las
    nóminas de los tres departamentos son iguales. Si se tienen los siguientes datos:
    • Ventas del departamento 1
    • Ventas del departamento 2
    • Ventas del departamento 3
    • Salario de los vendedores de cada departamento
    Hacer un algoritmo que determine cuánto recibirán los vendedores de cada departamento
    al finalizar el período.
     */

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese las ventas del departamento 1: ");
        double ventasDepartamento1 = entrada.nextDouble();

        System.out.print("Ingrese las ventas del departamento 2: ");
        double ventasDepartamento2 = entrada.nextDouble();

        System.out.print("Ingrese las ventas del departamento 3: ");
        double ventasDepartamento3 = entrada.nextDouble();

        System.out.print("Ingrese el salario de los vendedores de cada departamento: ");
        double salario = entrada.nextDouble();

        double totalVentas = ventasDepartamento1 + ventasDepartamento2 + ventasDepartamento3;
        double porcentajeVentas = 0.33 * totalVentas;

        double salario1 = (ventasDepartamento1 > porcentajeVentas) ? salario + 0.2 * salario : salario;
        double salario2 = (ventasDepartamento2 > porcentajeVentas) ? salario + 0.2 * salario : salario;
        double salario3 = (ventasDepartamento3 > porcentajeVentas) ? salario + 0.2 * salario : salario;

        System.out.println("Salario ventas departamento 1: " + salario1);
        System.out.println("Salario ventas departamento 2: " + salario2);
        System.out.println("Salario ventas departamento 3: " + salario3);
    }
}
