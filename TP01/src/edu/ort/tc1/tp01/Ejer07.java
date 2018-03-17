package edu.ort.tc1.tp01;

import java.util.Scanner;

/**
 * 
 * @author David Santiago Gonzalez
 *
 * Curso: 1C
 * 
 * Sabiendo que en una caja entran 8 manzanas, solicit� el ingreso por teclado de una cantidad 
 * de manzanas. Determin� cu�ntas cajas se requerir�an para guardar las manzanas ingresadas. 
 * Ten� en cuenta que la cantidad de manzanas que entran por caja debe ser declarada como 
 * una constante llamada CANTIDAD_MANZANAS_X_CAJON. 
 * Test1: 8. Resultado esperado: Se necesita de 1 caj�n 
 * Test 2: 17. Resultado esperado: Se necesita de 3 cajones 
 *
 */

public class Ejer07 {
	
	private static Scanner input = new Scanner(System.in);
	private static final int CANTIDAD_MANZANAS_X_CAJON = 8;

	public static void main(String[] args) {
		
		int manzanas, cantidadCajones,residuo;
		
		System.out.println("Por favor ingrese una cantidad de manzanas...");
		manzanas = input.nextInt();
		
		residuo = manzanas%CANTIDAD_MANZANAS_X_CAJON;
		cantidadCajones = manzanas/CANTIDAD_MANZANAS_X_CAJON;
		
		if (residuo>=1){
			if (cantidadCajones==1)
				System.out.println("Se necesita de "+(cantidadCajones+1)+" caj�n");
			else
				System.out.println("Se necesitan de "+(cantidadCajones+1)+" cajones");
		}else{
			if (cantidadCajones==1)
				System.out.println("Se necesita de "+cantidadCajones+" caj�n");
			else
				System.out.println("Se necesitan de "+cantidadCajones+" cajones");
		}
			
		
		
		

	}

}
