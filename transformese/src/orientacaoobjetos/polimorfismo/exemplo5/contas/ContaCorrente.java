package orientacaoobjetos.polimorfismo.exemplo5.contas;

public class ContaCorrente extends Conta {

	// Atributos
    double emprestimo;
    
    // Construtor
    public ContaCorrente(String numeroDaConta, String numeroAgencia, double saldo, double emprestimo) {
    	super(numeroDaConta, numeroAgencia, saldo);
    	this.emprestimo = emprestimo;
    }
	
    @Override
    public double mostrarSaldo() {    	
    	saldo = saldo - emprestimo;
    	return saldo;
    }
    
	// Métodos de acesso Getters e os Setters
    public double getEmprestimo() {
        return emprestimo;
    }
    
    public void setEmprestimo(double emprestimo) {
        this.emprestimo = emprestimo;
    }
    
}
