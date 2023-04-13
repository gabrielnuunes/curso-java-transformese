package orientacaoobjetos.heranca.atividades.contas;

import orientacaoobjetos.heranca.atividades.titular.Titular;

public class ContaPf {
	
	private int numeroConta;
	protected double saldo;
	// O nível Pacote ou Package
	public Titular titular;
	
	public ContaPf(int numeroConta, double saldo) {
		this.numeroConta = numeroConta;
		this.saldo = saldo;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	public double getSaldo() {
		return saldo;
	}
 
	public void sacar(double valorSaque) {
		
		if(saldo < valorSaque) {
			System.out.println("Saldo insuficiente.");
		} else {
			this.saldo -= valorSaque;
		}
		
	}
	
	
	/*
	 
	  Parâmetros de uma função ou os métodos
	  
	  public void somar(int a, int b) {
	  
	  	a + b;
	  
	  }
	  
	  public void armazenarPessoa(Pessoa pessoa1) {
	  
	  	//Aqui dentro eu processe essas informações 
	  	 
	  
	  }
	  
	  
	  
	 */
	
}
