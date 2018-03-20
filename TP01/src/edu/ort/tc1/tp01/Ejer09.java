package edu.ort.tc1.tp01;

import java.util.Scanner;

/**
 * 
 * @author David Santiago Gonzalez
 *
 * Curso: 1C
 *
 * Suponiendo que el primer día de la semana es el Domingo, pedir un número entre 1 y 7 
 * (inclusive) y mostrar el nombre del día correspondiente. Si el día no está en el rango permitido 
 * debe emitir por pantalla el mensaje de error "El día ingresado no es válido". 
 *
 */

public class Ejer09 {

	private static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int numero;
		
		System.out.println("Por favor ingrese un numero: ");
		numero = input.nextInt();
		
		switch (numero) {
		case 1:
			System.out.println("Domingo");
			break;
		case 2:
			System.out.println("Lunes");
			break;
		case 3:
			System.out.println("Martes");
			break;
		case 4:
			System.out.println("Miercoles");
			break;
		case 5:
			System.out.println("Jueves");
			break;
		case 6:
			System.out.println("Viernes");
			break;
		case 7:
			System.out.println("Sabado");
			break;
		default:
			System.out.println("El dia ingresado no es valido");			
			break;

		}
		
		input.close();

	}

}
