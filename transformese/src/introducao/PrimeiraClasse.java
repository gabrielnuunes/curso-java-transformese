package introducao;

public class PrimeiraClasse {
	
	public static void main(String[] args) {
		
		
		// Isso aqui é um comentário
		
		/* 		  
		  Isso aqui é um comentário de mais de uma linha
		  		  
		 */
		
		// Este é o método para imprimir no console
		//System.out.println(" ");
		
		// Variáveis  
		// Tipo, o nome e o valor 
		
		int idade = 10; // inteiro
		double altura = 1.70; // decimal
		String nome = "Gabriel"; // String ou palavras
		boolean estaCalor = true;
		
		//Constantes 
		
		final int media = 5;
		
		System.out.println("O valor da média é " + media);
		
		// Não pode 
		// media = 10;

		final int HORA = 24;

		// Strings 
		
		String sobreNome = "Tatiana";
		
		System.out.println(sobreNome.length());
		System.out.println(sobreNome.toUpperCase());
		System.out.println(sobreNome.toLowerCase());
		
		System.out.println(sobreNome.equals("Tatiana"));
		
		// Operadores aritméticos
		
		int a = 5;
		int b = 5;
		
		System.out.println("Operadores Aritméticos");
		
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);

		// Módulo, ou resto de uma divisão
		System.out.println("O resto da divisão é " + 11 % 3);

	}
	
}
