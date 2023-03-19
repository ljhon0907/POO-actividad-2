import java.util.Scanner;

public class Capitulo3EjercicioPropuesto18 {
    /*
    Se tiene la siguiente información de un empleado:
    · código del empleado,
    · nombres,
    · número de horas trabajadas al mes,
    · valor hora trabajada,
    · porcentaje de retención en la fuente.
    Haga un algoritmo que muestre: código, nombres, salario bruto y salario neto.
 */
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double salarioBruto, retencionFuente, salarioNeto;

        System.out.println("Codigo: ");
        int codigoEmpleado = entrada.nextInt();
        System.out.println("Nombre: ");
        String nombre = entrada.next();
        System.out.println("Numero de horas trabadas por mes: ");
        double numeroHorasTrabajadasMes = entrada.nextDouble();
        System.out.println("Valor hora: ");
        double valorHora = entrada.nextDouble();
        System.out.println("porcentaje de retención en la fuente: ");
        double porcentajeRetencion = entrada.nextDouble();

        salarioBruto = numeroHorasTrabajadasMes * valorHora;
        retencionFuente = salarioBruto * (porcentajeRetencion / 100);
        salarioNeto =  salarioBruto - retencionFuente;

        System.out.println("Codigo: " + codigoEmpleado);
        System.out.println("Nombres: " + nombre);
        System.out.println("Salario bruto: " + salarioBruto + "$");
        System.out.println("Salario neto: " + salarioNeto + "$");
    }
}








