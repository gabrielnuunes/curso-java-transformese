package array.exemplo1;

public class RevisaoArray {

	public static void main(String[] args) {
		
		// Criando um array
		int[] numeros = new int[4];
		
		// Atribuir valores ao array
		// numero = [0, 0, 0, 0];
		
		numeros[0] = 1;
		numeros[1] = 3;
		numeros[2] = 6;
		numeros[3] = 5;
		
		// O que eu fiz? 
		// numero = [1, 3, 6, 5];
		
		// Mostrando os valores do array com o For tradicional
		
		for (int indice = 0; indice < numeros.length; indice++) {
			
			System.out.println(numeros[indice]);
		}		
		
		// Mostrando os valores do array com o forEach
		
		for (int indice : numeros) {
			System.out.println(indice);
		}
		
		// Utilizando outra forma do For tradicional
		
		for (int numero = 0; numero <= 10; numero += 2) {
			
			System.out.println(numero);
		}
		
		System.out.println("Exemplo de números pares");
		
		// utilizando o for tradicional para mostrar números pares
		
		// o sinal de % é quando queremos descobrir o resto da divisão
		// o sinal ==   
		
		for (int valor = 0; valor <= 20; valor++ ) {
			
			if (valor % 2 == 0 ) {
				System.out.println(valor);
			}
			
		}
		
	}
	
}
