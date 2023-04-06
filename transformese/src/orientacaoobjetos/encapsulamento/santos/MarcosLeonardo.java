package orientacaoobjetos.santos;

import orientacaoobjetos.flamengo.ViniciusJr;

public class MarcosLeonardo {

	public static void main(String[] args) {
		
		ViniciusJr viniciusJr = new ViniciusJr();	
		
		// Este é público
		System.out.println(viniciusJr.nome);
		
		// Este é privado
		//System.out.println(viniciusJr.formaDeJogar);
		// Este é pacote ou package
		//System.out.println(viniciusJr.planoDeDefesa);
		// Este é o protegido ou protected
		//System.out.println(viniciusJr.baterFalta);
		
		viniciusJr.alteraFormaDeJogar("Marcos pediu pra trocar de camiseta");
	}
	
}
