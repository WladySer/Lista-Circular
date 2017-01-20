package epn;

import java.util.Scanner;

public class Aplicacion {

	public static void main(String[] args) {

		ListaCir lista = new ListaCir();
	
		lista.agregar("Lucia");
		lista.agregar("Juan");
		lista.agregar("Juana");
		lista.agregar("Pedro");
		lista.agregar("Lorena");
		
		
		
		lista.imprimirLista();// imprimimos la lista
		/*System.out.println("\nLa lista contiene "+lista.tamaño()+" elementos.\n");// numero de elementos de lista
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Ingrese la posicion que desea buscar");//busqueda por posicion
		int pos= Integer.parseInt(scn.nextLine());
		
		if(lista.buscar(pos)!=null)
			System.out.println(lista.buscar(pos));
		else
			System.out.println("la posicion ingresada no existe.");
		
		lista.imprimirLista();
		
		System.out.println("\nIngrese el nombre que desea buscar");//busqueda por nombre
		String dato= scn.nextLine();
		if(lista.buscar(dato)!=null)
			System.out.println(lista.buscar(dato));
		else
			System.out.println("El nombre ingresado no existe.");
		
		System.out.println("Ingrese el nombre que desea eliminar.");// eliminar por dato
		String dat = scn.nextLine();
		if(lista.buscar(dat)!=null){
			lista.eliminar(dat);
			lista.imprimirLista();
		}
		else
			System.out.println("El nombre ingresado no existe.");
		
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
