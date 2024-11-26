package org.generation.LoopsyCondiciones;
import java.util.Scanner;

public class loopsyCondiciones {
//WHILE
	public static void main(String[] args) {
		int contador = 1;
		while (contador <= 5) {
			System.out.println("iteración: " + contador);
			contador++;
		}
//DO WHILE
		int contadorDoWhile = 1;
		do {
			System.out.println("iteraciónDoWhile: " + contadorDoWhile);
			contadorDoWhile++;
		} while (contadorDoWhile <= 5);
//FOR
		for(int i = 1; i<=5 ; i++) {
            System.out.println("Contador For: " + i);
        }
//FOREACH 
		 String[] names = {"xamitl ", "maggy ","alex "};
	        
	        String misCompaneros = "";
	        for(String name : names) {
	            misCompaneros += name;
	        }
	        System.out.println(misCompaneros);
	        
/*Ejercicio For: Parte 3: Bucles For*/
	        
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Ingresa tu nombre: ");
	        String nombre =scanner.nextLine();
	        for (int i = 0; i < nombre.length(); i++) {
	            char letra = nombre.charAt(i);
	            System.out.println(letra);
	        }
	        scanner.close();
	}
}
