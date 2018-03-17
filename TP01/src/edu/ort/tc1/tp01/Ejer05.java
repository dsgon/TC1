package edu.ort.tc1.tp01;

import java.util.Scanner;

/**
 * 
 * @author David Santiago Gonzalez
 *
 * Curso: 1C
 * 
 * Realizá  un programa que, dados dos números enteros num1 y num2 cargados  desde 
 * teclado por el usuario, muestre el resultado de la división del primero por el segundo siguiendo 
 * el formato num1 + “ / “ + num2 + “ = “ + resultado. En el caso de que el segundo valor num2 
 * sea cero, mostrar el siguiente mensaje de error: “No se puede dividir por cero”. 
 * 
 */

public class Ejer05 {
	
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		
		int num1, num2, resultado;
		
		System.out.println("Por favor ingrese un numero:");
		num1 = input.nextInt();
		
		System.out.println("Ahora ingrese otro numero:");
		num2 = input.nextInt();
		
		if(num2==0)
			System.out.println("No se puede dividir por cero");
		else{
			resultado = num1/num2;
			System.out.println(num1+" / "+num2+" = "+resultado);
		}
		
		/*Otra opcion para hacerlo mas directo sin manejo de una variable 
		 * y una linea menos de codigo sería 
		
		if(num2==0){
			System.out.println("No se puede dividir por cero");
		}else{
			System.out.println(num1+" / "+num2+" = "+num1/num2);
		}
		*/

	}

}
