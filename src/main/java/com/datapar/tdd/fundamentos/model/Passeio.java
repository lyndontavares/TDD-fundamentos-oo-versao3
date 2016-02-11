package com.datapar.tdd.fundamentos.model;

import com.datapar.tdd.fundamentos.bussines.VeiculoTipo;

/**
 * @author Lyndon da Costa Tavares
 */

public final class Passeio extends Veiculo implements VeiculoTipo{

	int qtdePassageiros;

	public Passeio() {
		super();
		qtdePassageiros = 0;
	}

	public Passeio(String placa, String marca, String modelo, float veloMax,
			Motor motor, int qtdePassageiros) {
		super(placa, marca, modelo, veloMax, motor);
		this.qtdePassageiros = qtdePassageiros;
	}
	
	
	public int getQtdePassageiros() {
		return qtdePassageiros;
	}

	public void setQtdePassageiros(int qtdePassageiros) {
		this.qtdePassageiros = qtdePassageiros;
	}

	@Override
	public final void setPlaca(String placa) {
		super.setPlaca(placa);
	}

	@Override
	public final void setMarca(String marca) {
		super.setMarca(marca);
	}

	@Override
	public final void setModelo(String modelo) {
		super.setModelo(modelo);
	}

	@Override
	public final void setVeloMax(float veloMax) {
		super.setVeloMax(veloMax);  
	}

	@Override
	public final void setMotor(Motor motor) {
		super.setMotor(motor);
	}
	
	@Override
	public float calcVelo() {
		return super.getVeloMax() * 1000;
	}

	@Override
	public String toString() {
		return "Passeio [Passageiros=" + qtdePassageiros + ", Placa="
				+ getPlaca() + ", Marca=" + getMarca() + ", Modelo="
				+ getModelo() + ", VeloMax=" + calcVelo()
				+ " m/h, Motor=" + getMotor() + "]";
	}

	
	
}
