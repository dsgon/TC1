package edu.ort.tc1.tp01;

import java.util.Scanner;

/**
 * 
 * @author David Santiago Gonzalez
 *
 * Curso: 1C
 * 
 * Realizá un programa que al ingresar por teclado tres números enteros num1,num2 y num3,  
 * muestre el valor del mayor de todos (suponer que los tres valores son distintos). En caso de 
 * igualdad entre los tres imprimir "Los números son iguales". 
 * Test1: num1 = 12, num2 = 4, num3= 7. Resultado esperado: El mayor número es num1 
 * Test2:  num1 = 2, num2 = 65, num3= 8. Resultado esperado: El mayor número es num2 
 * Test3:  num1 = 3, num2 = 10, num3= 28. Resultado esperado: El mayor número es num3 
 * Test4:  num1 = 5, num2 = 5, num3= 5. Resultado esperado: Los números son iguales 
 *
 */

public class Ejer06 {
	
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		
		int num1,num2,num3;
	
		System.out.println("Por favor ingrese un numero:");
		num1 = input.nextInt();
		
		System.out.println("Ahora ingrese otro numero:");
		num2 = input.nextInt();
		
		System.out.println("Ahora ingrese el ultimo numero:");
		num3 = input.nextInt();
		
		if(num1 == num2 && num1 == num3)
			System.out.println("Los numeros nos iguales!");
		else{
			if(num1>num2 && num1>num3)
				System.out.println("El mayor numero es num1: "+num1);
			if(num2>num1 && num2>num3)
				System.out.println("El mayor numero es num2: "+num2);
			if(num3>num1 && num3>num2)
				System.out.println("El mayor numero es num3: "+num3);
		}

	}

}
