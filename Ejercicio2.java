/* realizar el cálculo de la media de un conjunto de valores introducidos por el usuario, pero el usuario ya no tiene que indicar inicialmente el número de valores. Introduce los valores y cuando ha terminado, introduce un valor concreto (-1), para indicar que ha terminado de introducir valores. */
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = 0;
        int suma = 0;
        int contador = 0;
        double media = 0;
        System.out.println("Introduce la nota (introducir -1 para terminar) : ");
        numero = sc.nextInt();
        while (numero != -1) {
            suma = suma + numero;
            contador++;
            System.out.println("Introduce la nota (introducir -1 para terminar) : ");
            numero = sc.nextInt();
        }
        media = (double) suma / contador;
        System.out.println("La media de la notas es: " + media);
    }
}