package conjuntos;

import java.util.Set;
import java.util.TreeSet;

public class ExemploTreeSet {

	public static void main(String[] args) {
		
		//Criando um conjunto em Java
		Set<String> pessoas = new TreeSet<>();
		
		// Para adicionar elementos
		pessoas.add("Tati");
		pessoas.add("Ariel");
		pessoas.add("Gabriel");
		pessoas.add("José");
		pessoas.add("Nazaré");
		
		// Para verificar se contém um elemento no conjunto
		System.out.println(pessoas.contains("Tati"));
		
		// Para mostrar todos os elementos do conjunto
		for (String elemento : pessoas) {
			System.out.println(elemento);
		}
		
		// Para mostrar o tamanho do conjunto
		System.out.println(pessoas.size());
		
		// Para verificar se está vazio o conjunto
		System.out.println(pessoas.isEmpty());
		
	}
	
}
