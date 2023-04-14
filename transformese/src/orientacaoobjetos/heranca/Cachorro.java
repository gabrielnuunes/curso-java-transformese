package orientacaoobjetos.heranca;

public class Cachorro extends Animal{

	// Exemplos usando Polimorfismo
	
	// É um exemplo de sobrescrita de métodos
	@Override
	public void animalMovendo() {
		System.out.println("O cachorro está correndo.");
	}
	
	@Override
	public void emitirSom() {
		System.out.println("O cachorro está latindo.");
	}
	
	
	// Um exemplo de sobrecarga de métodos
	// Ela só vai funcionar em métodos que forem da classe
	// Se forem herdados não vai funcionar
	
	public void dizNomeDoCachorro(String nomeCachorro) {
		System.out.println("O nome do cachorro é " + nomeCachorro);
	}
	
	public void dizNomeDoCachorro(String nomeCachorro, String corDoCachorro) {
		System.out.println(
			"O nome do cachorro é " + nomeCachorro + "e a cor " + corDoCachorro);
	}
}
