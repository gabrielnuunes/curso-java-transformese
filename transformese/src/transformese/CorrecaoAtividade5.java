package transformese;

import java.util.Scanner;

public class CorrecaoAtividade5 {

	public static void main(String[] args) {
		
		// 5 > 5 = falso MAIOR
		// 5 != 5 = falso DIFERENTE
		// 5 < 5 = falso MENOR
		// 5 == 5 = verdadeiro IGUAL
		
		/*
		  Atalhos
		Para adicionar identação. tecla TAB
		Para remover identação. Shift + TAB
		Comentar bloco. Selecione o bloco e aperte Ctrl + /
		Para descomentar bloco. Selecione o bloco e aperte Ctrl + /
		 
		 */ 
		
		Scanner entrada = new Scanner(System.in);
		
		//Declaração das variáveis
		int hora;
		String pessoa;
				
//		System.out.println("Informe a hora do dia: ");
//		hora = entrada.nextInt();
		
//		System.out.println("Informe o seu tipo de pessoa: ");
//		pessoa = entrada.next(); 
		
		// Primeira forma com o IF
		
		// a função equal serve para verificar a igualdade
//		if (pessoa.equals("fisica")) {
//			
//			System.out.println("Você é uma pessoa física");
//		} else if (pessoa.equals("juridica")) {
//			
//			System.out.println("Você é uma pessoa jurídica");
//		} else {
//			System.out.println("Favor informar um valor válido");
//		}
		
		// IF para verificar a hora
		
//		if(hora >= 0 && hora <= 12) {
//			System.out.println("Bom dia!");
//			
//		} else if (hora >= 13 && hora <= 18) {
//			System.out.println("Boa tarde!");
//			
//		} else if (hora >= 19 && hora <= 23) {
//			System.out.println("Boa noite!");
//			
//		} else {
//			System.out.println("Hora inválida");
//		}
		
		// Segunda forma Switch
		
//		switch (hora) {
//			case 0: case 1: case 2:	case 3:
//				System.out.println("Bom dia!");
//				break;
//			default:
//				System.out.println("A hora informada é inválida");
//				break;
//		}
	
		
		// Java 8 Java 11
		// Switch Expressions - Java 12
		// Precisa do JDK superior ao JDK 11
//		switch (hora) {
//			case 1, 2, 3, 4, 5, 6 -> System.out.println("Bom dia!");
//			case 13, 14, 15, 16, 17 -> System.out.println("Boa tarde!");
//			default -> System.out.println("Valor inválido!");
//		} 
		
		
		// Pegar os dados da pessoa com Switch
		
//		switch (pessoa) {
//		case "fisica": case "física": 
//			System.out.println("Você é uma pessoa física");
//			break;
//		case "juridica": case "jurídica": 
//			System.out.println("Você é uma pessoa jurídica");
//			break;
//		default:
//			System.out.println("A pessoa informada é inválida");
//			break;
//	}
		
		//Caso a pessoa passe o cpf ou cnpj
		// CPF 111.222.333-44 = 14
		// CNPJ 00.000.000/0000-00 = 18
		// CNPJ sem ponto 00000000000000 = 14
		
		
		//Como a gente consegue verificar o tamanho de uma String?
		// função lenght 
		
		String nome = "Gabriel";
		
		System.out.println("O meu nome tem " + nome.length() + " letras.");
		
		System.out.println("Informe o seu cpf ou cnpj");
		String documento = entrada.next();
		
		// Com ponto "000.000.000-00"
		// Sem ponto 00000000000
		
		if(documento.length() == 14) {
			System.out.println("O seu cpf é válido");
			
		} else if (documento.contains("/")) {
			System.out.println("Esse documento é um cnpj");
			
		} else if (documento.length() == 18){
			System.out.println("O seu cnpj é valido");
		}
		
		
		
		
		
		
		
		
		
		// WHILE FOR
		
		entrada.close();
	}
	
}
