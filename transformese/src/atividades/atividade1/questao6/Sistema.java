package atividades.atividade1.questao6;

public class Sistema {

	public static void main(String[] args) {
		
		Computador computador1 = new Computador(true);
		
		// 
		computador1.imprimir();
		
		// 1º pedido
		computador1.desligar();		
		computador1.imprimir();
		
		// 2º pedido
		computador1.ligar();		
		computador1.imprimir();
	}
	
}