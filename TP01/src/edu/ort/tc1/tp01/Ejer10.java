package edu.ort.tc1.tp01;

import java.util.Scanner;

/**
 * 
 * @author David Santiago Gonzalez
 * 
 * Curso: 1C
 * 
 * Realizá un programa que, ingresar por teclado un valor entero mayor que 0 llamado num1, 
 * muestre un mensaje por pantalla indicando "el número es par" o "el número es impar".  
 * Deberá utilizar el operador “módulo” es el caracter %
 *
 */

public class Ejer10 {
	
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		
		int num1, modulo;
		
		System.out.println("Por favor ingrese un numero mayor a 0:");
		num1 = input.nextInt();
		
		if (num1<=0)
			System.out.println("El numero ingresado no es valido.");
		else{
			
			modulo = num1%2;
			
			if (modulo!=0)
				System.out.println("El numero es impar");
			else
				System.out.println("El numero es par");
			
		}
		
		input.close();

	}

}
