package orientacaoobjetos.polimorfismo.exemplo1;

public class Sistema {

	public static void main(String[] args) {
		
		// Eu não posso criar objetos da classe Animal por ser abstrata
		//Animal animal1 = new Animal("Peixe", "Branco", "Nadando");
		
		Gato gato1 = new Gato("Richard", "Cinza", "Caminhando");
		
		Cachorro cachorro1 = new Cachorro("", "Caramelo", "Correndo");
		
		//Cachorro cachorro2 = new Cachorro(null, null, null);
		//System.out.println(cachorro2.getNome());
		
	}
	
}
