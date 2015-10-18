/*
/**
 * Universidad del Valle de Guatemala
 * Algoritmos y Estructura de datos
 * Sección: 10
 * Hoja de trabajo #9
 * -------------------------------------------------
 * Freddy José Ruíz 14592 / Pedro Joaquín Coronado 14224
 * Clase: PruebasJUNIT
 *-------------------------------------------------
 * Descripción:
 * En esta clase se muestran las pruebas JUNIT 
*/
import static org.junit.Assert.*;

import org.junit.Test;


public class PruebasJUNIT {
	
	private Word val= new Word("jugar","verbo");
	private SimpleSet map1;
	private treeMap  map2;
	private RedBlackSet map3;
	private SplayTreeSet map4;
	private HashMapSet map5;
	
	@Test
	public void SimpleGet() {
		map1=new SimpleSet();
		map1.add(val);
		assertEquals(val,map1.get(val));
	}
		
	@Test
	public void TreeMapGet() {
		map2=new treeMap();
		map2.add(val);
		assertEquals(val,map2.get(val));
	}
	
	@Test
	public void HashMapGet() {
		map5=new HashMapSet();
		map5.add(val);
		assertEquals(val,map5.get(val));
	}
	
	@Test
	public void RedBlackGet() {
		map3=new RedBlackSet();
		map3.add(val);
		assertEquals(val,map3.get(val));
		
	}
	
	@Test
	public void SplayTreeGet() {
		map4=new SplayTreeSet();
		map4.add(val);
		assertEquals(val,map4.get(val));
	}

	
	
	
	

	
	


}
