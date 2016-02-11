package com.datapar.tdd.fundamentos.model;

/**
 * @author Lyndon da Costa Tavares
 */

abstract class Veiculo  {

	private String placa;
	private String marca;
	private String modelo;
	private float velocMax;
	private Motor motor;
	
	public Veiculo(){
		this.placa = " ";
		this.marca = " ";
		this.modelo = " ";
		this.velocMax = 0;
		this.motor = new Motor();
	}

	
	public Veiculo(String placa, String marca, String modelo, float veloMax,
			Motor motor) {
		super();
		this.placa = placa;
		this.marca = marca;
		this.modelo = modelo;
		this.velocMax = veloMax;
		this.motor = motor;
	}

	
	public float calcVelo(){
		return getVeloMax();
	}
	
	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public float getVeloMax() {
		return velocMax;
	}

	public void setVeloMax(float veloMax) {
		this.velocMax = veloMax;
	}

	public Motor getMotor() {
		return motor;
	}

	public void setMotor(Motor motor) {
		this.motor = motor;
	}


	@Override
	public String toString() {
		return "Veiculo [placa=" + placa + ", marca=" + marca + ", modelo="
				+ modelo + ", veloMax=" + velocMax + ", motor=" + motor + "]";
	}
	
	 
	
	
}
