package mapas.exemplo1;

import java.util.Objects;

public class Carro {
	
	// Os atributos
	private String placa;
	private String modelo;
	
	// O construtor da classe
	public Carro(String placa, String modelo) {
		this.placa = placa;
		this.modelo = modelo;
	}

	// Os métodos de acesso
	public String getPlaca() {
		return placa;
	}

	public String getModelo() {
		return modelo;
	}

	// Métodos de verificação

	@Override
	public int hashCode() {
		return Objects.hash(placa);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Carro other = (Carro) obj;
		return Objects.equals(placa, other.placa);
	}

	
	// To String
	@Override
	public String toString() {
		return "placa = " + placa + ", modelo = " + modelo;
	}
	
	
	
	
	
		
}
