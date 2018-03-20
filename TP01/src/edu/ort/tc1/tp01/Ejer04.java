package edu.ort.tc1.tp01;

import java.util.Scanner;

/**
 * 
 * @author David Santiago Gonzalez
 * 
 * Curso: 1C
 * 
 * Realizá un programa que pida al usuario ingresar dos números enteros num1 y num2. 
 * Luego, mostrar el resultado de la suma entre ambos, utilizando el siguiente formato: 
 * “La suma entre “ + num1 + “ y “ + num2 + “ da como resultado “ + num1 + num2 
 * ¿El resultado que se ve en pantalla es correcto? ¿Cómo se puede solucionar? 
 *
 */

public class Ejer04 {
	
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		
		int num1, num2;
		
		System.out.println("Por favor ingrese un numero:");
		num1 = input.nextInt();
		
		System.out.println("Ahora ingrese otro numero:");
		num2 = input.nextInt();
		
		System.out.println("La suma entre " + num1 + " y " + num2 + " da como resultado " + num1 + num2);
		
		//El resultado no es correcto. La solucion es:
		System.out.println("La suma entre " + num1 + " y " + num2 + " da como resultado " + (num1 + num2));
		
		input.close();

	}

}
