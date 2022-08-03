package cl.fsj.infoclub;

import java.util.Set;
import java.util.TreeSet;

public class Ejercicio2 {

	public static void main(String[] args) {
		//******* la impresion del treeSet es en orden alfabetico******/
		Set<String> invitados = new TreeSet<String>();
		invitados.add("Daniel");
		invitados.add("Paola");
		invitados.add("Facundo");
		invitados.add("Pedro");
		invitados.add("Jacinta");
		invitados.add("Florencia");
		invitados.add("JuanPablo");
		System.out.println(invitados); 
		
		Set<String> posiblesInvitados = new TreeSet<String>();
		posiblesInvitados.add("Jorge");
		posiblesInvitados.add("Francisco");
		posiblesInvitados.add("Marcos");
		
		invitados.addAll(posiblesInvitados);
		System.out.println(invitados);
		
		//********* Eliminar un elemento de la lista******////
		invitados.remove("Jorge");
		System.out.println(invitados);
		


	}

}
