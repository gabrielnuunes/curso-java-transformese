package transformese;

public class MetodosTeste {

	public static void main(String[] args) {
		// Escrevi um método aqui
		
		/*
		String nome = "Alan";		
		System.out.println("O nome é " + nome);
		 */
		
		Pessoa pessoa1 = new Pessoa();
		pessoa1.nome = "Gabriel";
		pessoa1.sobreNome = "Nunes";
		
		Pessoa pessoa2 = new Pessoa();
		pessoa2.nome = "Leticia";
		pessoa2.sobreNome = "Matos";
		
		System.out.println(pessoa1.nome);
		System.out.println(pessoa1.sobreNome);
		
		//Método sem parâmetro e com retorno
		//System.out.println(pessoa1.dadosDaPessoa());
		
		// Método sem parâmetro e sem retorno
//		pessoa1.dadosDaPessoa();
//		pessoa2.dadosDaPessoa();
		
		//Método com parâmetro e com retorno		
		
//		System.out.println(
//				"A idade da pessoa somado 5 é " + pessoa1.mostrarIdadeCom5(10));
		
		// Método com parâmetro e sem retorno
		
		pessoa1.dizBomDia("Anderson", "boa noite");
		
	}
	
}
