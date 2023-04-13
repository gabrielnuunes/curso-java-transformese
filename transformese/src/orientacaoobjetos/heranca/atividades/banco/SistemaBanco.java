package orientacaoobjetos.heranca.atividades.banco;

import orientacaoobjetos.heranca.atividades.contapremium.ContaPremium;
import orientacaoobjetos.heranca.atividades.contas.ContaPf;
import orientacaoobjetos.heranca.atividades.contas.ContaPj;
import orientacaoobjetos.heranca.atividades.titular.Titular;

public class SistemaBanco {

	public static void main(String[] args) {
				
		ContaPf contaPF = new ContaPf(1234, 800.0);
		
		
//		System.out.println(contaPF.getNomeTitular());
//		System.out.println(contaPF.getNumeroConta());
		
		ContaPj contaPj = new ContaPj(5678, "Serasa", 1000.0, "00.000.00-0001");
		
//		System.out.println(contaPj.getNomeEmpresa());
//		System.out.println(contaPj.getNomeTitular());
//		System.out.println(contaPj.getNumeroConta());
//		System.out.println(contaPj.getNumeroCNPJ());	
		
		ContaPremium contaPremium = new ContaPremium(7894, 500.0,"Cartão black");
		
//		System.out.println(contaPF.getNomeTitular());
//		System.out.println(contaPj.getNomeTitular());
//		System.out.println(contaPremium.getNomeTitular());
		
		// Simulando emprestimo
		
		System.out.println(contaPremium.getSaldo());
		
		System.out.println(contaPremium.emprestimo(200.0));
		
		// Como podemos criar um objeto de Titular no nosso sistema?
		// 1 - Criando o objeto dentro da classe conta
		// 2 - Criando durante a execução do sistema
		
		contaPF.titular = new Titular();
		
		// Exemplo para evitar o erro NullPointException
		
		ContaPj contaPJ2 = new ContaPj(0, "Serasa", 0, "00000");
		
		System.out.println(contaPJ2.getNomeEmpresa());
		System.out.println(contaPJ2.getNumeroCNPJ());
		
		// Exemplo de verificação pelo método
		
		System.out.println("O saldo é: " + contaPF.getSaldo());
		
		contaPF.sacar(200.0);
		
		System.out.println("O saldo é: " + contaPF.getSaldo());
		
		contaPF.sacar(1000.0);
		
		System.out.println("O saldo é: " + contaPF.getSaldo());
	}
	
}
