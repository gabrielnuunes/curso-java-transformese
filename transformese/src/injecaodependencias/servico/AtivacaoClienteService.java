package injecaodependencias.servico;

import injecaodependencias.modelo.Cliente;
import injecaodependencias.notificao.NotificarPorEmail;
import injecaodependencias.notificao.NotificarPorSMS;

public class AtivacaoClienteService {

	public void ativar(Cliente cliente) {
		cliente.ativar();
		
		System.out.println("O cliente foi ativado");
		
		NotificarPorSMS notificador = new NotificarPorSMS();
		
		notificador.notificar(cliente, "Seu cadastro está ativado");
	}	
}
