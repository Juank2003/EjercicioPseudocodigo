/*¿Qué hace este algoritmo?

Algo QueHace
# ¿Qué hace este algoritmo?
Variable valor1, valor2: real
Inicio
   valor1 <- enter("Introduza un valor: ")
   valor2 <- enter("Introduza otro valor: ")
   # tratamiento
   valor1 <- valor2
   valor2 <- valor1
   escribir("valor1 = " & valor1 & "; valor2 = " & valor2)
Fin */
//
 import java.util.Scanner;
 public class Ejercicio3 {
     public static void main(String[] args) {
         Scanner teclado = new Scanner(System.in);
         double valor1, valor2;
         System.out.println("Introduza un valor: ");
         valor1 = teclado.nextDouble();
         System.out.println("Introduza otro valor: ");
         valor2 = teclado.nextDouble();
         valor1 = valor2;
         valor2 = valor1;
         System.out.println("valor1 = " + valor1 + "; valor2 = " + valor2);
     }
 }
