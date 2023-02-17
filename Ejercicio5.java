/*el ordenador debe adivinar un número elegido por el usuario entre 1 y 100. El usuario le indica si el número es mayor (+), menor (-) o si lo ha encontrado (=).*/
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, num2, num3;
        System.out.println("Piensa un número entre 1 y 100 indica si el número es mayor (+), menor (-) o si lo ha encontrado (=)");
        num = 1;
        num2 = 100;
        num3 = (num + num2) / 2;
        System.out.println("¿Es el número " + num3 + "?");
        String respuesta = sc.nextLine();
        while (!respuesta.equals("=")) {
            if (respuesta.equals("+")) {
                num = num3;
                num3 = (num + num2) / 2;
            } else if (respuesta.equals("-")) {
                num2 = num3;
                num3 = (num + num2) / 2;
            }
            System.out.println("¿Es el número " + num3 + "?");
            respuesta = sc.nextLine();
        }
        System.out.println("¡He acertado!");
    }
}