import java.util.Scanner;

public class capitulo4EjercicioResuelto12 {

    /*
    Determinar la cantidad de dinero recibida por un trabajador por concepto de las horas
    semanales trabajadas en una empresa, sabiendo que cuando las horas de trabajo exceden
    de 40, el resto se considera horas extras y se pagan al doble de una hora normal, cuando
    no exceden de 8; si las horas extras exceden de 8, se pagan las primeras 8 al doble de lo
    que se paga una hora normal y el resto al triple. Del trabajador se conocen los siguientes
    datos: nombres, número de horas trabajadas en la semana y valor recibido por una hora
    normal de trabajo.
     */

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese los nombres del trabajador: ");
        String nombres = entrada.nextLine();

        System.out.print("Ingrese el número de horas trabajadas en la semana: ");
        int horasTrabajadas = entrada.nextInt();

        System.out.print("Ingrese el valor recibido por una hora normal de trabajo: ");
        double valorHoraNormal = entrada.nextDouble();

        double valorHorasNormales;
        if (horasTrabajadas <= 40) {
            valorHorasNormales = horasTrabajadas * valorHoraNormal;
        } else {
            valorHorasNormales = 40 * valorHoraNormal;
        }

        double valorHorasExtras = 0;
        int horasExtras = horasTrabajadas - 40;
        if (horasExtras > 0 && horasExtras <= 8) {
                valorHorasExtras = horasExtras * valorHoraNormal * 2;
            }

        else {
                valorHorasExtras = 8 * (valorHoraNormal * 2)
                        + (horasExtras - 8) * (valorHoraNormal * 3);
            }

        double valorTotal = valorHorasNormales + valorHorasExtras;

        System.out.println("Valor a pagar al trabajador " + nombres + ": $" + valorTotal);

    }
}
