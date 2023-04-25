package lista;

import java.util.List;
import java.util.ArrayList;

public class Exemplo1Lista {

	public static void main(String[] args) {
		
		List<String> nomes = new ArrayList<>();
		
		// Para adicionar um elemento na lista
		
		nomes.add("Tati");
		nomes.add("Ariel");
		
		// Para adicionar um elemento em uma determinada posição
		
		nomes.set(0, "Gabriel");

		// Para mostrar todos os elementos
		
		for (String nome : nomes) {
			System.out.println(nome);
		}
		
		// Adicionar sem remover um elemento
		
		nomes.add(0, "Tati que vai estar brava");
		
		// Para mostrar todos os elementos novamente
		
		for (String nome : nomes) {
			System.out.println(nome);
		}
		
		// Para acessar determinado elemento
		
		String terceiroElemento = nomes.get(2);
		
		System.out.println("Mostrando terceiro elemento");
		System.out.println(terceiroElemento);
		
	}
	
}