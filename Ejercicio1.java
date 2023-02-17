/*Algoritmo calcula la media de valores (por ejemplo, de las notas), introducidos por el usuario. En primer lugar, el usuario indica el número de valores cuyo promedio desea conocer. Seguidamente, introduce todos estos valores. Finalmente, se muestra la media de estos valores. */
import java.util.Scanner;   

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, i;
        double suma = 0, media;
        System.out.print("Introduzca el número de notas: ");
        n = sc.nextInt();
        for (i = 1; i <= n; i++) {
            System.out.print("Introduzca la nota 1 " + i + ": ");
            suma = suma + sc.nextDouble();
        }
        media = suma / n;
        System.out.println("La media de las notas es: " + media);
    }
}