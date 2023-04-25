package equalsehashcode;

import java.util.Objects;

public class Pessoa {

	String nome;
	
	// Construtor padrão
	// Sobrecarga do construtor
	Pessoa() {
		
	}
	
	Pessoa(String nome) {
		this.nome = nome;
	}
	
	
	//Sobrecarga
	
	public void dizBomDia() {
		System.out.println("Olá, bom dia!");
	}
	
	public void dizBomDia(String nome) {
		System.out.println("Olá, bom dia " + nome);
	}
	
	public void dizBomDia(String nome, int hora) {
		System.out.println("Olá, bom dia " + nome + " agora são " + hora + " horas");
	}
	
	// Método para cadastrar uma pessoa
	
	public void cadastrar(String nome, String cpf) {
		System.out.println("Olá " + nome + " cadastro realizado.");
	}



	
	// Exemplo de uma pessoa usando
	
	//pessoa1.cadastrar("Suda", 10, "São Paulo", "Analista");
    
	
	// Exemplo de Equals 
	

	@Override
	public boolean equals(Object objeto) {
		
		// Verificando se o endereço de memória são iguais
		if (this == objeto)			
			return true;
		
		if (objeto == null) 
			return false;
		
		// Pegando a classe do objeto atual
		// E verificando se é diferente do 
		// que eu estou comparando 
		
		if (getClass() != objeto.getClass())
			return false;
		
		
		Pessoa other = (Pessoa) objeto;
		return Objects.equals(nome, other.nome);
	}
	
	
	
	
}
