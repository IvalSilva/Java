package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		Queue<String> fila = new LinkedList<>();
		
		fila.offer("Maria");
		fila.offer("Joao");
		fila.add("Pedro");
		System.out.println(fila.size());	
	}
	
}
