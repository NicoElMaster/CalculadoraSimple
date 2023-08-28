//                             El objetivo de esta actividad es crear una calculadora simple que pueda sumar y restar dos números ingresados por el usuario.
//                               La calculadora debe estar dividida en dos clases: una llamada "Main" que gestionará la entrada del usuario y mostrará los
//                                       resultados, y otra llamada "Operaciones" que contendrá los métodos para realizar las operaciones matemáticas.

package packpageMain;

import packpageOperaciones.Operaciones;
import java.util.Scanner;

public class ClaseConMain {

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        Operaciones objOperaciones = new Operaciones();

        System.out.println("--------------------< Bienvenido a la calculadora >--------------------");
        System.out.println("---------------< Realizado por Nicolas Moreno Jiménez >----------------");

        System.out.println("\nDigite el primer número");

        Double p1 = Double.valueOf(sc.next());

        System.out.println("\nDigite el segundo número");

        Double p2 = Double.valueOf(sc.next());

        System.out.println("\nAhora :" + "\nDigite 1 para sumar" + "\nDigite 2 para restar" + "\nDigite 3 para multiplicar" + "\nDigite 4 para dividir");
        int operacion = Integer.parseInt(sc.next());

        switch (operacion) {
            case 1:
                System.out.println("\nEl resultado de sumar " + p1 + " + " + p2 + " es : ");
                System.out.println(objOperaciones.sumar(p1, p2));
                break;
            case 2:
                System.out.println("\nEl resultado de restar " + p1 + " - " + p2 + " es : ");
                System.out.println(objOperaciones.restar(p1, p2));
                break;
            case 3:
                System.out.println("\nEl resultado de multiplicar " + p1 + " * " + p2 + " es : ");
                System.out.println(objOperaciones.multiplicar(p1, p2));
                break;
            case 4:
                System.out.println("\nEl resultado de dividir " + p1 + " / " + p2 + " es :");
                System.out.println(objOperaciones.dividir(p1, p2));
                break;

            default:
                System.out.println("\nOpción no válida");
        }
        System.out.println("\n--------------------< Gracias por utilizar el programa <3 >--------------------");

    }

}
