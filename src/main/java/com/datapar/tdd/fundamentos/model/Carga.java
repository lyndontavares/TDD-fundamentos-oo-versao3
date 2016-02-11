package com.datapar.tdd.fundamentos.model;

import com.datapar.tdd.fundamentos.bussines.VeiculoTipo;

/**
 * @author Lyndon da Costa Tavares
 */

public final class Carga extends Veiculo implements VeiculoTipo {

	int tara;
	int cargaMax;

	public Carga() {
		super();
		tara = 0;
		cargaMax = 0;
	}

	public Carga(String placa, String marca, String modelo, float veloMax,
			Motor motor, int tara, int cargaMax) {
		super(placa, marca, modelo, veloMax, motor);
		this.tara = tara;
		this.cargaMax = cargaMax;
	}

	public int getTara() {
		return tara;
	}

	public void setTara(int tara) {
		this.tara = tara;
	}

	public int getCargaMax() {
		return cargaMax;
	}

	public void setCargaMax(int cargaMax) {
		this.cargaMax = cargaMax;
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
		return super.getVeloMax() * 100000;
	}

	@Override
	public String toString() {
		return "Carga [tara=" + tara + ", cargaMax=" + cargaMax
				+ ", Placa=" + getPlaca() + ", Marca=" + getMarca()
				+ ", Modelo=" + getModelo() + ", VeloMax="
				+ calcVelo() + " cm/h, Motor=" + getMotor() + " ]";
	}

}
