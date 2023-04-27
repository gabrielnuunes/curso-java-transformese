package equalsehashcode.exemplo3;

public class Exemplo3 {

	public static void main(String[] args) {
		
		Produto produto1 = new Produto("1", "Borracha");
		Produto produto2 = new Produto("1", "Borracha");
		
		//Aqui estou pegando o código do valor de cada produto
		System.out.println(produto1.hashCode());
		System.out.println(produto2.hashCode());
		
		System.out.println(produto1.equals(produto2));
		
	}	
}
