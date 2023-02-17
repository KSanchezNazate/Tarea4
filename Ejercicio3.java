/*realizar el cálculo de la media de un conjunto de valores introducidos por el usuario, pero el usuario ya no tiene que indicar inicialmente el número de valores. Introduce los valores y cuando ha terminado, introduce un valor concreto (-1), para indicar que ha terminado de introducir valores. mostrar además el porcentaje de notas superiores a 10/20. */
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, suma = 0, contador = 0, contador2 = 0;
        double media;
        System.out.println("Introduce una nota (-1 para terminar): ");
        num = sc.nextInt();
        while (num != -1) {
            suma = suma + num;
            contador++;
            if (num > 10) {
                contador2++;
            }
            System.out.println("Introduce una nota (-1 para terminar): ");
            num = sc.nextInt();
        }
        media = (double) suma / contador;
        System.out.println("La media es: " + media);
        System.out.println("El porcentaje de notas superiores a 10 es: " + (double) contador2 / contador * 100 + "%");
    }
}