package edu.ort.tc1.tp01;

import java.util.Scanner;

/**
 * 
 * @author David Santiago Gonzalez
 *
 * Curso: 1C
 * 
 * Realizá un programa que resuelva el siguiente problema: Tres personas aportan diferente 
 * capital a una sociedad, se desea saber qué porcentaje del total aportó cada una (indicando 
 * nombre y porcentaje) y cuál es el monto del total aportado por las tres. 
 * Pedir por pantalla el ingreso del capital aportado por cada una de las personas y luego mostrar 
 * lo pedido en el siguiente formato: 
 * Nombre : capital aportado: $ .... , porcentaje del capital: %.... 
 * Monto total aportado: $ .... 
 *
 */

public class Ejer08 {
	
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		
		String nombre1,nombre2,nombre3;
		float monto1,monto2,monto3,porcentaje1,porcentaje2,porcentaje3,capital;
		
		System.out.println("Primera persona, por favor ingrese su nombre: ");
		nombre1 = input.nextLine();
		System.out.println("Segunda persona, por favor ingrese su nombre: ");
		nombre2 = input.nextLine();
		System.out.println("Tercera persona, por favor ingrese su nombre: ");
		nombre3 = input.nextLine();
		
		System.out.println(nombre1+" por favor ingrese su capital aportado");
		monto1 = input.nextFloat();		
		System.out.println(nombre2+" por favor ingrese su capital aportado");
		monto2 = input.nextFloat();
		System.out.println(nombre3+" por favor ingrese su capital aportado");
		monto3 = input.nextFloat();
		
		capital = monto1+monto2+monto3;
		
		porcentaje1 = (monto1*100)/capital;
		porcentaje2 = (monto2*100)/capital;
		porcentaje3 = (monto3*100)/capital;
		
		
		System.out.println(nombre1+": capital aportado: $ "+monto1+". Porcentaje del capital: %"+porcentaje1);
		System.out.println(nombre2+": capital aportado: $ "+monto2+". Porcentaje del capital: %"+porcentaje2);
		System.out.println(nombre3+": capital aportado: $ "+monto3+". Porcentaje del capital: %"+porcentaje3);
		
		System.out.println("Monto total aportado: $"+capital);

	}

}
