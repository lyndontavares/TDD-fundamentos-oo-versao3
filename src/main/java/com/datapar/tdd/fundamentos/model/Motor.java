package com.datapar.tdd.fundamentos.model;

/**
 * @author Lyndon da Costa Tavares
 */

public class Motor {

	private int dtdPst;
	private int potencia;
	
	
	public Motor(){
		this.dtdPst=0;
		this.potencia=0;
	}
	
	public Motor( int dtdPst, int potencia ){
		this.dtdPst=dtdPst;
		this.potencia=potencia;
	}
	
	public int getDtdPst() {
		return dtdPst;
	}
	public void setDtdPst(int dtdPst) {
		this.dtdPst = dtdPst;
	}
	public int getPotencia() {
		return potencia;
	}
	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	@Override
	public String toString() {
		return "Motor [ Pistões=" + dtdPst + ", potencia=" + potencia + "]";
	}
	
	
	
	
}
