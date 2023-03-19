import java.util.Scanner;

public class capitulo4EjercicioResuelto10 {

    /*
    Cierta universidad para liquidar el pago de matrícula de un estudiante le exige los
    siguientes datos:
    • Número de inscripción
    • Nombres
    • Patrimonio.
    • Estrato social.
    La universidad cobra un valor constante para cada estudiante de $50.000. Si el patrimonio
    es mayor que $2´000.000 y el estrato superior a 3, se le incrementa un porcentaje del 3%
    sobre el patrimonio. Hacer un algoritmo que muestre:
    • Número de inscripción.
    • Nombres.
    • Pago de matrícula.
     */

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese número de inscripción: ");
        String numInscripcion = entrada.nextLine();

        System.out.print("Ingrese nombres: ");
        String nombres = entrada.nextLine();

        System.out.print("Ingrese patrimonio: ");
        double patrimonio = entrada.nextDouble();

        System.out.print("Ingrese estrato social: ");
        int estrato = entrada.nextInt();

        double valorMatricula = 50000;

        if (patrimonio > 2000000 && estrato > 3) {
            double incremento = patrimonio * 0.03;
            valorMatricula += incremento;
        }

        System.out.println("El estudiante con numero de incripción: " + numInscripcion + "" +
                " y nombre " + nombres + " debe pagar " + valorMatricula  );

    }
}
