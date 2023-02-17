/*El arte ASCII consiste en hacer un diseño usando solo caracteres. Una de las formas más primitivas de este arte son los emoticonos: los caracteres :-) dibujan una carita sonriente.

Escriba un algoritmo que muestre un rectángulo realizado en arte ASCII según los deseos del usuario. */

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;
        do {
            System.out.println("Elige una opción");
            System.out.println("1. Rectángulo");
            System.out.println("2. Triángulo");
            System.out.println("3. Salir");
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Rectángulo");
                    System.out.println("Escribe la altura");
                    int altura = scanner.nextInt();
                    System.out.println("Escribe la anchura");
                    int anchura = scanner.nextInt();
                    for (int i = 0; i < altura; i++) {
                        for (int j = 0; j < anchura; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    System.out.println("Triángulo");
                    System.out.println("Escribe la altura");
                    int altura2 = scanner.nextInt();
                    for (int i = 0; i < altura2; i++) {
                        for (int j = 0; j < i + 1; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    System.out.println("Hasta luego");
                    break;
                default:
                    System.out.println("Opción incorrecta");
            }
        } while (opcion != 3);
    }
}
