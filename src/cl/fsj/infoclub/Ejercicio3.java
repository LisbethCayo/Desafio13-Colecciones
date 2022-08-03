package cl.fsj.infoclub;

import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class Ejercicio3 {

	public static void main(String[] args) {
		Map<String, Integer> golosinas = new TreeMap<>();
		golosinas.put("Chocman", 100);
		golosinas.put("Trululu", 100);
		golosinas.put("Centella", 100);
		golosinas.put("kilate", 50);
		golosinas.put("miti-miti", 30);
		golosinas.put("Traga Traga", 150);
		golosinas.put("tableton", 5);
		System.out.println(golosinas);
								//goloisinas.entrySet()
		Map<String, Integer> filtro = golosinas.entrySet()
					.stream()
					.filter(map -> map.getValue()<100)//filtrado por valores
					.collect(Collectors.toMap(map -> map.getKey(), map -> map.getValue()));
	    System.out.println("Golosinas menores de 100: " + filtro);
	 }
		
	}


