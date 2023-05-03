package injecaodependencias;

import injecaodependencias.modelo.Cliente;
import injecaodependencias.modelo.Produto;
import injecaodependencias.servico.AtivacaoClienteService;
import injecaodependencias.servico.EmissaoNotaFiscalService;

public class Sistema {

	public static void main(String[] args) {
		
		Cliente tati = new Cliente("Tati", "tati@email.com", "009999-8888");
		Cliente ariel = new Cliente("Ariel", "ariel@email.com", "1177776666");
		
		AtivacaoClienteService ativacaoCliente = new AtivacaoClienteService();
		
		// Verificando se eles estão ativados no sistema
		System.out.println(tati.isAtivo());
		System.out.println(ariel.isAtivo());
		
		// Ativando os clientes
		ativacaoCliente.ativar(ariel);
		ativacaoCliente.ativar(tati);
		
		// Verificando se eles estão ativados no sistema
		System.out.println(tati.isAtivo());
		System.out.println(ariel.isAtivo());
		
		// Testando o serviço de emissão de nota fiscal

		// Para importar as classes Ctrl + Shift + o
		
		// Vamos criar os produtos que iremos utilizar na emissão da nota fiscal
		Produto impressora = new Produto("Impressora", 250.00);
		Produto notebook = new Produto("Notebook", 1500.00);
		
		// Criando o objeto de EmissaoNotaFiscal para termos acesso a função de emitir
		EmissaoNotaFiscalService emitirNotaFiscal = new EmissaoNotaFiscalService();
		
		// Utilizando o serviço para emitir a nota fiscal e notificar o cliente por email
		emitirNotaFiscal.emitir(ariel, impressora);
		emitirNotaFiscal.emitir(tati, notebook);
	}
	
}
