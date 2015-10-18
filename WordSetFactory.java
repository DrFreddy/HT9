/*
/**
 * Universidad del Valle de Guatemala
 * Algoritmos y Estructura de datos
 * Sección: 10
 * Hoja de trabajo #9
 * -------------------------------------------------
 * Freddy José Ruíz 14592 / Pedro Joaquín Coronado 14224
 * Autor de la clase: Eduardo Castellanos
 * Clase: WordSetFactory
 *-------------------------------------------------
 * Descripción:
 *WordSetFactory. Clase  utilizada para instanciar los diferentes tipos de sets. 
*/
class WordSetFactory {
	
	// Metodo que genera un objeto que implementa WordSet
	// parametro tipo: 1 = SimpleSet
	//                         2 = implementado con Red black tree
	//                         3 = implementado con Splay Tree
	//                         4 = implementado con Hash Table
	//                         5 = implementado con TreeMap (de Java Collection Framework)
	
	public static WordSet generateSet(int tipo)
	{
	// aqui se regresara el set empleando sus implementaciones:
	    if (tipo == 1)
		    return new SimpleSet();
	 // if tipo == 2 cree una instancia para un Wordset implementao con Red Black Tree
	    else if (tipo == 2)
			return new null;
	 // if tipo == 3 cree una instancia para un Wordset implementado con Splay Tree
	    else if (tipo == 3)
			return  new SplayTreeSet();
	 // if tipo == 4 cree una instancia para un Wordset implementado con Hash table
	    else if (tipo == 4)
			return new HashMapSet();
	 // if tipo == 5 cree una instancia para un Wordset implementado con TreeMap
	    else if (tipo == 5)
			return new treeMap();
	    else 
	    	return new treeMap();	    												
		}
	
	
}
