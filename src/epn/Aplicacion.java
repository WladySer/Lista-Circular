package epn;

import java.util.Scanner;

public class Aplicacion {

	private static Scanner scn;

	public static void main(String[] args) {

		ListaCir lista = new ListaCir();
	
		lista.agregarFinal("Lucia");
		lista.agregarInicio("Juan");
		lista.agregarInicio("Juana");

		
		
		
		lista.imprimirLista();// imprimimos la lista
		scn = new Scanner(System.in);
		
		System.out.println("Ingrese la posicion que desea buscar");//busqueda por posicion
		int pos= Integer.parseInt(scn.nextLine());
		
		if(lista.buscar(pos)!=null)
			System.out.println(lista.buscar(pos));
		else
			System.out.println("la posicion ingresada no existe.");
		
		
		System.out.println("\nIngrese el nombre que desea buscar");//busqueda por nombre
		String dat= scn.nextLine();
		if(lista.buscar(dat)!=null)
			System.out.println(lista.buscar(dat));
		else
			System.out.println("El nombre ingresado no existe.");
	
		System.out.println("Ingrese el nombre que desea eliminar.");// eliminar por dato
		String da = scn.nextLine();
		if(lista.buscar(da)!=null){
			lista.eliminaValor(da);
			lista.imprimirLista();
		}
		else
			System.out.println("El nombre ingresado no existe.");
		/*
		System.out.println("Ingrese la posicion que desea eliminar.");// eliminar por posicion
		int datoe = scn.nextInt();
		if(lista.buscar(datoe)!=null){
			lista.eliminar(datoe);
			lista.imprimirLista();
		}
		else
			System.out.println("El posicion ingresada no existe.");
		
		lisdob.vaciar(); //vaciado de lista
		if (lisdob.estaVacia())
			 System.out.println("\nLista vacia");
		else
		lisdob.imprimirLista();
		scn.close();
		*/

	}

}
