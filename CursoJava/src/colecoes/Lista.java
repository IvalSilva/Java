package colecoes;

import java.util.ArrayList;
import java.util.List;

public class Lista {
	
	public static void main(String[] args) {
		List<String> aprovados = new ArrayList<>();
		aprovados.add("Joao");
		aprovados.add("Pedro");
		aprovados.add("Maria");
		aprovados.add("Rafael");
		System.out.println("Get ...");
		System.out.println(aprovados.get(1));
	}

}
