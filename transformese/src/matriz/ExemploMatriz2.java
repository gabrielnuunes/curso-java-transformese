package matriz;

import java.util.Arrays;

public class ExemploMatriz2 {
	
	public static void main(String[] args) {
		
	double[][] alunos = new double[3][3];		
	
	// 0 , 1 , 2 
	
	alunos[0][0] = 5.2;
	alunos[0][1] = 4.7;
	alunos[1][0] = 6.2;
	alunos[2][0] = 8.7;
	alunos[1][2] = 2.1;
	
	// Foreach
	
	for (double[] nota: alunos ) {
		System.out.println(Arrays.toString(nota));
	}
	
	// Coleções 
	// FILA, PILHA, 
	
	
	// Próxima aula 
	// 1- Modificadores de acesso
	// 2- Orientação a Objetos
	
	
	
}
	


}
