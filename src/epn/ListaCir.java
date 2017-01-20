package epn;

public class ListaCir {
	NodoDoble inicio;
	NodoDoble fin;
	protected int size;
public ListaCir(){
	inicio=null;
	
}

public boolean estaVacia(){
	return inicio == null;
	
}

public void agregar(String dato) {
	NodoDoble nuevo = new NodoDoble(dato);
	
      if (estaVacia()) 
	  inicio = fin = nuevo;
      else 
	  nuevo.setSiguiente(inicio);
      nuevo.setAnterior(inicio);
      inicio.setAnterior(nuevo);
      inicio.setSiguiente(nuevo);

  }
public void imprimirLista(){
	System.out.println("Contenido de la lista");
    System.out.println("---------------------");
     
    NodoDoble aux= inicio;
     
    do{
        System.out.println(aux.getElement());
        aux=aux.getSiguiente();
    }while(aux!=inicio);
}






}
