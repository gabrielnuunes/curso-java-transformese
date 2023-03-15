package transformese;

public class Pessoa {

	// Atributos ou os Dados
	
	String nome;
	String sobreNome;
	
	//Método sem parâmetro e com retorno
//	String dadosDaPessoa() {
//		
//		return "O nome da pessoa é " + nome + " e o sobrenome é " + sobreNome;
//	}
	
	// Método sem parâmetro e sem retorno
	
//	void dadosDaPessoa() {
//		
//		System.out.println(
//				"O nome da pessoa é " + nome + " e o sobrenome é " + sobreNome);
//		
//	}
	
	//Método com parâmetro e com retorno
	
//	int mostrarIdadeCom5( int idade ) {
//		
//		return idade + 5;
// 	}
	
	// Método com parâmetro e sem retorno
	
	void dizBomDia( String nomeRecebido, String saudacao ) {
		
		System.out.printf(
				"Olá meu nome é %s e estou desejando %s ", nomeRecebido, saudacao); 
		
	}
	
	
}
