/*algoritmo debe generar un número entero aleatorio entre 1 y 100. El usuario tiene que encontrar este número. Con cada intento del usuario, se le debe indicar si el número es mayor, menor o igual al valor introducido. El programa finaliza cuando el usuario ha encontrado el número. */
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = 0;
        int aleatorio = (int) (Math.random() * 100 + 1);
        System.out.println("Introduce un número: ");
        numero = sc.nextInt();
        while (numero != aleatorio) {
            if (numero > aleatorio) {
                System.out.println("El número es menor");
            } else {
                System.out.println("El número es mayor");
            }
            System.out.println("Introduce un número: ");
            numero = sc.nextInt();
        }
        System.out.println("Has acertado");
    }
}