/**
 * Universidad del Valle de Guatemala
 * Algoritmos y Estructura de datos
 * Sección: 10
 * Hoja de trabajo #9
 * -------------------------------------------------
 * @author Freddy José Ruíz 14592 / Pedro Joaquín Coronado 14224
 * Clase: TreeMap
 *-------------------------------------------------
 * Descripción:
 * Manejo de datos a base del ordenamiento TreeMap
 */
import java.util.Iterator;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
public class treeMap implements WordSet {
	 private Map<Integer, Word> map;
	            
	public treeMap(){
		map= new TreeMap<Integer, Word>();
	}
	@Override
	public void add(Word wordObject) {
			map.put(map.size()+1, wordObject);
	}

	@Override
	public Word get(Word word) {
		Word valor= null;
		if (map.containsValue(word)){
		  Iterator it = map.keySet().iterator();
		  while(it.hasNext()){
		    Integer key = (Integer) it.next();
		    if (map.get(key).equals(word)== true){
				valor= map.get(key);
				break;
			  } 
		  }
		}
	      return valor;
}
	
}
