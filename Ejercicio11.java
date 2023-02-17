/*Dibujar mediate el arte ASCII una de las siguientes formas:rectángulo con relleno, rectángulo sin relleno, cruz de San Andrés,triángulo rectángulo,rombo,ajedrezado.Según la elección del usuario*/

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;
        do {
            System.out.println("Elige una opción");
            System.out.println("1. Rectángulo con relleno");
            System.out.println("2. Rectángulo sin relleno");
            System.out.println("3. Cruz de San Andrés");
            System.out.println("4. Triángulo rectángulo");
            System.out.println("5. Rombo");
            System.out.println("6. Ajedrezado");
            opcion = scanner.nextInt();
        } while (opcion < 1 || opcion > 6);
        switch (opcion) {
            case 1:
                System.out.println("Rectángulo con relleno");
                System.out.println("********");
                System.out.println("*      *");
                System.out.println("*      *");
                System.out.println("*      *");
                System.out.println("********");
                break;
            case 2:
                System.out.println("Rectángulo sin relleno");
                System.out.println("********");
                System.out.println("*      *");
                System.out.println("*      *");
                System.out.println("*      *");
                System.out.println("********");
                break;
            case 3:
                System.out.println("Cruz de San Andrés");
                System.out.println("  *  ");
                System.out.println(" *** ");
                System.out.println("*****");
                System.out.println(" *** ");
                System.out.println("  *  ");
                break;
            case 4:
                System.out.println("Triángulo rectángulo");
                System.out.println("   *");
                System.out.println("  **");
                System.out.println(" ***");
                System.out.println("****");
                break;
            case 5:
                System.out.println("Rombo");
                System.out.println("  *  ");
                System.out.println(" *** ");
                System.out.println("*****");
                System.out.println(" *** ");
                System.out.println("  *  ");
                break;
            case 6:
                System.out.println("Ajedrezado");
                System.out.println("********");
                System.out.println("*      *");
                System.out.println("*      *");
                System.out.println("*      *");
                System.out.println("********");
                break;
        }
    }
}