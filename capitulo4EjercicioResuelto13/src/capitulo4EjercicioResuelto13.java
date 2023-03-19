import java.util.Scanner;

public class capitulo4EjercicioResuelto13 {

    /*
    Un almacén efectúa una promoción en la cual se hace un descuento sobre el valor de la
    compra total, según el color de la bolita que el cliente saque al pagar en caja. Si la bolita
    es blanca no se le hará descuento alguno, si es verde se le hará un 10% de descuento, si es
    amarilla un 25%, si es azul un
    50% y si es roja un 100%. Hacer un algoritmo para determinar la cantidad final que un
    cliente deberá pagar por su compra. Se sabe que sólo hay bolitas de los colores
    mencionados
     */

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el valor total de la compra: ");
        double valorCompra = entrada.nextDouble();

        System.out.print("Ingrese el color de la bolita (blanca, verde, amarilla, azul o roja): ");
        String colorBolita = entrada.next();

        double descuento = 0.0;
        switch(colorBolita) {
            case "verde":
                descuento = valorCompra * 0.1;
                break;
            case "amarilla":
                descuento = valorCompra * 0.25;
                break;
            case "azul":
                descuento = valorCompra * 0.5;
                break;
            case "roja":
                descuento = valorCompra;
                break;
            default:
                break;
        }

        double valorFinal = valorCompra - descuento;

        System.out.println("El valor final de la compra es: " + valorFinal);

    }

}
