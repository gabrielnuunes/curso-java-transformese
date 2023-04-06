package testeAviao;

public class Aviao {

	// Atributos ou Dados do avião
	
	String fabricante = "Embraer";
	String modelo;
	int qtdeMotores;
	int passageiros;
	Piloto piloto;
	Motor motor = new Motor();
	
	// Comportamentos ou Ações do avião
	
	void acelerarAviao() {
		motor.velocidadeMotor += 10;
	}
	
}
