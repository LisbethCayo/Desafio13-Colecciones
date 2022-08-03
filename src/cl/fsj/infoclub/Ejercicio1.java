package cl.fsj.infoclub;

import java.util.ArrayList;

public class Ejercicio1 {

	public static void main(String[] args) {
		ArrayList<String> marcas = new ArrayList<>();
		marcas.add("fiat");
		marcas.add("fruu");
		marcas.add("tony");
		marcas.add("retbull");
		marcas.add("toyo");
		marcas.add("giat");
		marcas.add("habb");
		marcas.add("cocac");
		marcas.add("linkyn");
		marcas.add("mitxw");
	
   System.out.println(marcas);
   
   //*********Agragar tres marcas al listado********//
   
   
   ArrayList<String>  otrasMarcas = new ArrayList<>();
   
   otrasMarcas.add("blocMaster");
   otrasMarcas.add("carrefout");
   otrasMarcas.add("jetix");
   
   marcas.addAll(otrasMarcas);
   System.out.println(marcas);
   
   //***********Cambiar nombre de la lista por estar mal escrito usando metodo set*******///
  
   marcas.set(10, "blokBuster");
   System.out.println(marcas);
   //***********Eliminar elemento de la lista utilizando el metodo remove()*******//
   
   marcas.remove(11);
   System.out.println(marcas);
   
   ArrayList<String> posiblesMarcas = new ArrayList<>();
   posiblesMarcas.add("rotw");
   posiblesMarcas.add("art");
   posiblesMarcas.add("peth");
   posiblesMarcas.add("pullt");
   posiblesMarcas.add("pood");
  marcas.addAll(posiblesMarcas);
   System.out.println(marcas);
   //******conteo de elementos ********//
   //marcas.contains(posiblesMarcas)
   System.out.println(marcas.size());
   
 	}

}
