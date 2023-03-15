package transformese;

import java.util.Scanner;

public class While {

	public static void main(String[] args) {
		
		// While 
		// Bar para lavar os copos
		// 9h às 12h - Quantidade indeterminada
		// 30 copos - Quantidade determinada
		
		// While determinado
		int copos = 0;
		
		while (copos <= 30) {
			
			System.out.println("Copo de número " + copos + " foi lavado");
			//copos += 1;
			//Operador unário
			//copos++;
			//Mostrar só os números pares
			copos += 1;
		}
		
		//While indeterminado
		
		Scanner entrada = new Scanner(System.in);
		
		int pratos = 0;
		
		// Palavra para 
		// número 0
		
		
		entrada.close();
	}
	
}
