
package udi.tp2;

import java.util.Scanner;

/**
 *
 * @author USUARIO1
 */
public class UDITP2 {

    public static void main(String[] args) {
        UDITP2.Menu();
    }

    public static void Menu() {
        Scanner escan = new Scanner(System.in);

        int opcion, val1, val2;
        do
        {
            System.out.println("Menú - Elija una opción");
            System.out.println("1 - Área Triángulo");
            System.out.println("2 - Área Rectángulo");
            System.out.println("3 - Área Circulo");
            System.out.println("4 - Salir");

            opcion = escan.nextInt();

            switch (opcion)
            {
                case 1:
                    System.out.println("Ingrese la base");
                    val1 = escan.nextInt();
                    System.out.println("Ingrese la altura");
                    val2 = escan.nextInt();
                    System.out.println("\nEl área del triángulo es de " + UDITP2.areaTria(val1, val2) + "\n");
                    break;
                case 2:
                    System.out.println("Ingrese la base");
                    val1 = escan.nextInt();
                    System.out.println("Ingrese la altura");
                    val2 = escan.nextInt();
                    System.out.println("\nEl áres del rectángulo es de " + UDITP2.areaRecta(val1, val2) + "\n");
                    break;
                case 3:

                    break;
                case 4:
                    System.out.println("Adios");
                    break;
                default:
                    System.out.println("Error");
                    break;
            }
        } while (opcion != 4);

    }

    public static int areaTria(int val1, int val2) {
        int areaT = 0;
        areaT = (val1 * val2) / 2;
        return areaT;
    }

    public static int areaRecta(int val1, int val2) {
        int areaR = 0;
        areaR = val1 * val2;
        return areaR;
    }

}
