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

public int tama�o()
{
	NodoDoble aux=inicio;
	while(aux.getSiguiente()!=inicio)
	{
		size++;
		aux=aux.getSiguiente();
	}
	return size;
	
}

public void agregarInicio(String dato){
    NodoDoble nuevo=new NodoDoble(dato);
    if(inicio==null){
              inicio=nuevo;
              
    }
    else if(inicio.getSiguiente()==null){
    	inicio.setSiguiente(nuevo);
    	inicio.setAnterior(nuevo);
    	nuevo.setSiguiente(inicio);
    	nuevo.setAnterior(inicio);
    	inicio = nuevo;
    }
    else{
              NodoDoble aux=inicio;
              while(aux.getSiguiente()!=inicio)
                       aux=aux.getSiguiente();
              aux.setSiguiente(nuevo);
              nuevo.setAnterior(aux);
              nuevo.setSiguiente(inicio);
              inicio.setAnterior(nuevo);
              inicio=nuevo;
             
    }
  }
public void agregarFinal(String dato){
    NodoDoble nuevo=new NodoDoble(dato);
    if(inicio==null)
              inicio=nuevo;
    else{
              NodoDoble aux=inicio;
              while(aux.getSiguiente()!=inicio)
                       aux=aux.getSiguiente();
              aux.setSiguiente(nuevo);
              nuevo.setAnterior(aux);
              nuevo.setSiguiente(inicio);
              inicio.setAnterior(nuevo);
    }
  }

public NodoDoble buscar(String dato){
    NodoDoble aux=inicio;
    
        while(aux.getSiguiente()!=inicio){
            if (aux.getElement().equalsIgnoreCase(dato)){
                return aux; 
            }
            
            aux=aux.getSiguiente();
            
            
        }
        return aux;
    }
public NodoDoble buscar(int pos){
    NodoDoble aux=inicio;
    
    int cont=1;
    
    if(pos<1 || pos>tama�o()){
        System.out.println("La posicion insertada no es correcta");
        
    }else{
        while(aux.getSiguiente()!=inicio){
            if (pos == cont){

                return aux; 
            }

            aux=aux.getSiguiente();
            cont++;
            
        }
        
    }
   
    
    return aux;
    
}



public void eliminar(String dato){
    if(inicio!=null){
              NodoDoble aux=inicio;
              NodoDoble ant=null;
              while(aux.getSiguiente()!=inicio){
                       if(aux.getElement().equalsIgnoreCase(dato)){
                                 if(ant==null){
                                          if(aux.getSiguiente()==inicio)
                                                   inicio=null;
                                          else{
                                                   ant=aux.getAnterior();
                                                   ant.setSiguiente(aux.getSiguiente());
                                                   aux=aux.getSiguiente();
                                                   aux.setAnterior(ant);
                                                   inicio=aux;
                                                   ant=null;
                                          }
                                 }else{
                                          aux.setAnterior(null);
                                          ant.setSiguiente(aux.getSiguiente());
                                          aux=aux.getSiguiente();
                                          aux.setAnterior(ant);
                                 }
              }else{
                       ant=aux;
                       aux=aux.getSiguiente();
              }
    }
    }
  }


public void eliminar(int pos){
	 
    NodoDoble aux=inicio;
    NodoDoble anterior=null;
    int contador=1;

    if(pos<1 || pos>=tama�o()){
        System.out.println("La posicion insertada no es correcta");
    }else{
        while(aux!=null){
            if (pos == contador){
                if (anterior==null){
                    inicio = inicio.getSiguiente();
                }else {
                    //Actualizamos el anterior
                    anterior.setSiguiente(aux.getSiguiente());
                }
                aux=null;
            }else{
                anterior=aux;
                aux=aux.getSiguiente();
                contador++;
            }
        }
    }
}

    
public  void vaciar(){
	  inicio=null;
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
