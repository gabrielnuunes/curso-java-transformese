package equalsehashcode;

public class Exemplo1Equals {

	public static void main(String[] args) {
		
		Pessoa pessoa1 = new Pessoa();
		pessoa1.nome = "Gabriel";
		
		Pessoa pessoa2 = new Pessoa();
		pessoa2.nome = "Gabriel";
		
		Pessoa pessoa3 = new Pessoa();
		Pessoa pessoa4 = new Pessoa("Ariel");
		
		// Utilizando o Equals
		// Ele retorna verdadeiro ou falso
		
		// É falso pois o endereço de memória é diferente
		System.out.println(pessoa1 == pessoa2);
		
		System.out.println(pessoa1.equals(pessoa2));
		
		// Recebo nenhum valor
		pessoa1.dizBomDia();
		// Recebo uma String
		pessoa1.dizBomDia("Ariel");
		// Recebo uma String e um número inteiro
		pessoa1.dizBomDia("Ariel", 20);
		
		// Recebo um Objeto
		pessoa1.equals(pessoa2);
		
		int idade = 8;
		int idade2 = 8;
		
		System.out.println);
		
	}
	
}
