package orientacaoobjetos.polimorfismo.exemplo3.contas;

public class ContaCorrente extends Conta {

	// Atributos
    double emprestimo;
    
    // Construtor
    public ContaCorrente(String numeroDaConta, String numeroAgencia, double emprestimo) {
    	super(numeroDaConta, numeroAgencia);
    	this.emprestimo = emprestimo;
    }
	
	// Métodos de acesso Getters e os Setters
    public double getEmprestimo() {
        return emprestimo;
    }
    
    public void setEmprestimo(double emprestimo) {
        this.emprestimo = emprestimo;
    }
    
}
