package array;

import java.util.Arrays;

public class ArrayExemplo1 {

	public static void main(String[] args) {
		
		// Para criar um array
		int[] idades = new int[4];
		
		// Para atribuir valores 
		idades[0] = 5;
		idades[1] = 4;
		idades[2] = 6;


		System.out.println(idades[0]);
		System.out.println(idades[1]);
		System.out.println(idades[2]);

		
		// 5, 4, 6, 6
		
		// Jeito errado
		System.out.println(idades);
		
		// Jeito certo
		
		//Arrays.toString();
		
		System.out.println(Arrays.toString(idades));
	
		String[] nomes = new String[5];
		
		nomes[0] = "Ana";
		nomes[1] = "Bia";
		nomes[2] = "Carol";
		nomes[3] = "Daniel";
		nomes[4] = "Everton";

		
		System.out.println(Arrays.toString(nomes));
		
		// Se quisermos ver o tamanho do Array utilizamos o lenght
		
		// Pacote Arrays
		// Arrays.
		
		System.out.println(nomes.length);
		
		
		
	}
	
}




















