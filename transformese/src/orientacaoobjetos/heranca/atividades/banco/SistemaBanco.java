package orientacaoobjetos.heranca.atividades.banco;

import orientacaoobjetos.heranca.atividades.contas.ContaPf;
import orientacaoobjetos.heranca.atividades.contas.ContaPj;

public class SistemaBanco {

	public static void main(String[] args) {
				
		ContaPf contaPF = new ContaPf("Ariel", 1234);
		
		System.out.println(contaPF.getNomeTitular());
		System.out.println(contaPF.getNumeroConta());
		
		ContaPj contaPj = new ContaPj("Tati", 5678, "Serasa", "00.000.00-0001");
		
		System.out.println(contaPj.getNomeEmpresa());
		System.out.println(contaPj.getNomeTitular());
		System.out.println(contaPj.getNumeroConta());
		System.out.println(contaPj.getNumeroCNPJ());		
		
	}
	
}
