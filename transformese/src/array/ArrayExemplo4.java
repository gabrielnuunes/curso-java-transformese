package array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayExemplo4 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Quantas notas serão?");
		int quantidade = entrada.nextInt();
		
		
		double[] notas = new double[quantidade];
		
		for (int i = 0; i < quantidade; i++) {
			
			System.out.printf("Informe a nota %d do aluno \n", i + 1);
			notas[i] = entrada.nextDouble();
		}
		
		System.out.println(Arrays.toString(notas));
		
		//Comentario do Suda
		
		//  0   1   2   3   
		//[ 2 , 3 , 3 , 4 ]
		
		//        0             1             2         
		
		// [ [1 , 2 , 3 ], [4 , 5 , 6 ], [7 , 8 , 9 ]  ]
		
		// i++ 
		// i + 1
		
		
		
		entrada.close();
	}
	
}
