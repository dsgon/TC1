package edu.ort.tc1.tp01;

import java.util.Scanner;

/**
 * 
 * @author David Santiago Gonzalez
 * 
 * Curso: 1C
 * 
 * Realizá un programa que dados 2 valores numéricos enteros num1 y num2, ingresados 
 * por teclado, asigne en la variable booleana sonIguales el valor correspondiente a partir de los 
 * valores  de  la  comparación  entre  ambos  (verdadero  si  son  iguales,  falso  si  no  lo  son). 
 * imprimiendo el mensaje "los números son iguales" o "los números no son iguales". 
 *
 */

public class Ejer11 {
	
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		
		int num1, num2;
		boolean sonIguales;
		
		System.out.println("Por favor ingrese un numero");
		num1 = input.nextInt();
		System.out.println("Por favor ingrese un segundo numero");
		num2 = input.nextInt();
		
		if(num1==num2){
			sonIguales = true;
			System.out.println("Los numeros son iguales y el valor de 'sonIguales' es: "+sonIguales);
		}else{
			sonIguales = false;
			System.out.println("Los numeros no son iguales y el valor de 'sonIguales' es: "+sonIguales);
		}
		
		input.close();

	}

}
