package array;

import java.util.Arrays;

public class ArrayExemplo3 {

	public static void main(String[] args) {
		
		// Aqui eu criei o Array
		int[] idades = new int[3];
		
		// Atribui um valor
		idades[1] = 18;
		idades[0] = 10;
		idades[2] = 20;
		
		// Para mostrar os valores do Array		
		System.out.println(Arrays.toString(idades));
		 
		for (int i = 0; i < 3; i++) {
			
			System.out.println("Repetindo " + i + " com o valor " + idades[i]);
			
		}
		
		// Foreach
		
		for (int idade: idades) {
			System.out.println("Repetindo com Foreach " + idade);
		}
		
		
		
		// 0   1   2 
		//[10, 18, 20]
		
		System.out.println(idades[1]);

		
		
		
	}
	
	
}
