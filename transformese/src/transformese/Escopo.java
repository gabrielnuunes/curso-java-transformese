package transformese;

public class Escopo {

	public static void main(String[] args) {
		
		//Aqui eu criei a variável
		// Aqui é uma constante
		double juros = 11.12;	
		
		// Aqui é uma variável
		double salario = 1000.50;
				
		int idade;
		
		idade = 20;
		System.out.println("A idade agora é " + idade);
		
		idade = 30;
		System.out.println("A idade agora é " + idade);
		
		
		
		
		
		
		
		
		
		
		
		
		
		if(idade > 20) {			
			//Aqui dentro estou passando um valor para ela
			juros = 2.50;			
			
			idade = 50;
		}
		
		
	}
	
}
