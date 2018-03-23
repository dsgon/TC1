package edu.ort.tc1.tp01;

import java.util.Scanner;

/**
 * 
 * @author David Santiago Gonzalez
 * 
 * Curso: 1C
 * 
 * Realizá un programa que resuelva el siguiente problema:  
 * Deberás solicitar el ingreso de una fecha de compra, un nombre de comprador, un nombre de 
 * producto  y  una  cantidad  y  precio  del  producto  comprado.  Mostrá  a  modo  de  ticket,  la 
 * información ingresada y el monto a pagar.  
 * Modelo de Ticket:  
 * Fecha de Compra: YYYYMMDD 
 * Nombre del Comprador: xxxxx xxxxx 
 * Producto solicitado: xxxxx  
 * Cantidad solicitada: xx  
 * Precio Unitario: $xxx  
 * Total a Pagar: $xxxxx 
 *
 */

public class Ejer12 {

	private static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {

		String fechaCompra,nombreCompleto,producto;
		int cantidad;
		double precioUnitario,totalAPagar;
		
		System.out.println("Por favor ingrese la fecha de la compra en el formato YYYYMMDD. Ej: 20180317.");
		fechaCompra = input.nextLine();
		System.out.println("Por favor ingrese su nombre.");
		nombreCompleto = input.nextLine();
		System.out.println("Por favor ingrese un producto a comprar.");
		producto = input.nextLine();
		System.out.println("Por favor ingrese la cantidad del producto a comprar.");
		cantidad = input.nextInt();
		System.out.println("Por favor ingrese el precio del producto a comprar.");
		precioUnitario = input.nextDouble();
		
		totalAPagar = cantidad * precioUnitario;
		
		System.out.println();
		System.out.println("********TICKET DE VENTA********");
		System.out.println("Fecha de compra:       "+fechaCompra);
		System.out.println("Nombre del comprador:  "+nombreCompleto);
		System.out.println("Producto solicitado:   "+producto);
		System.out.println("Cantidad solicitada:   "+cantidad);
		System.out.println("Precio unitario:      $"+precioUnitario);
		System.out.println("Total a pagar:        $"+totalAPagar);
		System.out.println("******** FIN DE TICKET ********");

		input.close();

	}

}
