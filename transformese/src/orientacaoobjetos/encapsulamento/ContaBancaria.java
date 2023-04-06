package orientacaoobjetos.encapsulamento;

public class ContaBancaria {

	private String nome;
	private int idade;
	private double saldo;
	
	// Configurando o Construtor
	public ContaBancaria(double saldo, String nome) {
		this.saldo = saldo;
		this.nome = nome;
	}

	public double mostrarSaldo() {
		return saldo;	
	}	
	
	public String mostrarNome() {
		return nome;
	}
	
	//                           15
	public void maiorIdade(int idade) {
		
		if(idade > 18) {
			
		}
		
		
		
		
		// O valor ainda nem foi passado para a variável da classe
		System.out.println("Usando idade antes de passar " + idade);
		System.out.println("A idade é: usando this.idade antes " + this.idade);
		
	//        15   =  15	
		this.idade = idade;
		System.out.println("A idade é: usando this.idade " + this.idade);
		System.out.println("Usando idade depois de passar " + idade);
	}
	
	
	
}
