package edu.ort.tc1.tp01;

import java.util.Scanner;

/**
 * 
 * @author David Santiago Gonzalez
 *
 * Curso: 1C
 * 
 * Realizá  un  programa  que  pida  al  usuario  ingresar su  nombre.  Escribí  un  mensaje  de 
 * bienvenida que incluya el nombre ingresado.  
 * 
 */

public class Ejer03 {
	
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
	
		String nombre;
		
		System.out.println("Por favor ingrese su nombre:");
		nombre = input.nextLine();
		
		System.out.println("Bienvenido "+nombre+"!");
		
		input.close();
		
	}
}
