import java.util.Scanner;

public class capitulo4EjercicioPropuesto22 {

    /*
    Elaborar un algoritmo que entre el nombre de un empleado, su salario básico por hora y el
    número de horas trabajadas en el mes; escriba su nombre y salario mensual si éste es mayor
    de $450.000, de lo contrario escriba sólo el nombre.
     */

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Nombre del empleado: ");
        String nombre = entrada.nextLine();

        System.out.print("Salario básico por hora: ");
        double salarioHora = entrada.nextDouble();

        System.out.print("Número de horas trabajadas en el mes: ");
        double horasTrabajadas = entrada.nextDouble();

        double salarioMensual = salarioHora * horasTrabajadas;

        if (salarioMensual > 450000) {
            System.out.println(nombre + ": " + salarioMensual);
        } else {
            System.out.println(nombre);
        }
    }
}
