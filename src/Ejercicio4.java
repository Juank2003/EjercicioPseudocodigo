/*Escriba un algoritmo que calcule la velocidad media de desplazamiento del usuario.

A continuación, se muestra un ejemplo de posibles visualizaciones y entradas durante una ejecución del algoritmo (los valores introducidos por el usuario están escritos en negrita y cursiva):

Introduzca la distancia recorrida (km).

370

Introduzca el tiempo del recorrido (min).

240

Se ha desplazado a una velocidad de 92,5 km/h.*/
//

import java.util.Scanner;

public class Ejercicio4 {
     public static void main(String[] args) {
         Scanner teclado = new Scanner(System.in);
         double distancia, tiempo, velocidad;
         System.out.println("Introduzca la distancia recorrida (km).");
         distancia = teclado.nextDouble();
         System.out.println("Introduzca el tiempo del recorrido (min).");
         tiempo = teclado.nextDouble();
         velocidad = distancia / tiempo;
         System.out.println("Se ha desplazado a una velocidad de " + velocidad + " km/h.");
     }
 }