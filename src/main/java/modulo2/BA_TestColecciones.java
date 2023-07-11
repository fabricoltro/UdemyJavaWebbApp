package modulo2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class BA_TestColecciones {

	public static void main(String[] args) {
		
		List miLista = new ArrayList();
		miLista.add("edad1");
		miLista.add(15);
		miLista.add("edad2");
		miLista.add(21);
		miLista.add("edad3");
		miLista.add(10/2);
		
		//for(Object elementos : miLista) {
		//	System.out.println(elementos);
		//}
		
		
		// set no guarda el orden en la variable
		Set miSet = new HashSet();
		miSet.add("Lunes");
		miSet.add("Martes");
		miSet.add("Miercoles");
		miSet.add("Jueves");
		miSet.add("Viernes");
		//imprimir(miSet);
		
		
		
		Map miMapa = new HashMap();
		miMapa.put(15, "jose");
		miMapa.put(18, "carla");
		miMapa.put(21, "agus");
		miMapa.put(33, "emanuel");
		
		
		String elemento = (String) miMapa.get(15);
		//System.out.println(elemento);
		
		//key set agrega un set en conjunto pero no garantiza un orden
		imprimir(miMapa.keySet());
		
		//en cambio values trae todos los valores
		imprimir(miMapa.values());
	
	
	}
	
	public static void imprimir(Collection coleccion) {
		coleccion.forEach(elemento -> {
			System.out.println("elemento: " + elemento);
		});
	}
	
}
