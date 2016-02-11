package com.datapar.tdd.fundamentos.model;

/**
 * @author Lyndon da Costa Tavares
 */


public class Teste {

	public static void main(String[] args) {

		Passeio passeio1 = new Passeio();
		passeio1.setMarca("Audi");
		passeio1.setModelo("A6");
		passeio1.setPlaca("PAS-0101");
		passeio1.setVeloMax(100);
		passeio1.getMotor().setDtdPst(6);
		passeio1.getMotor().setPotencia(200);
		passeio1.setQtdePassageiros(4);

		System.out
				.println("-----------------------------------------------------");
		System.out
				.println("Info Passeio 1: (*Instanciado por Construtor padrão*)");
		System.out.println(passeio1);

		
		Passeio passeio2 = new Passeio("PAS-0202", "VW", "GOL", 100, new Motor( 6, 300) , passeio1.getQtdePassageiros() );
		
		System.out
				.println("------------------------------------------------------------");
		System.out
				.println("Info Passeio 2: (*Instanciado por Construtor com parâmtros*)");
		System.out.println(passeio2);

		
		
		Carga carga1 = new Carga();
		carga1.setMarca("Ford");
		carga1.setModelo("F250");
		carga1.setPlaca("CAR-0101");
		carga1.setVeloMax(100);
		carga1.getMotor().setDtdPst(12);
		carga1.getMotor().setPotencia(600);
		carga1.setTara(2000);
		carga1.setCargaMax(10000);
		
		System.out
				.println("-----------------------------------------------------");
		System.out
				.println("Info Carga 1: (*Instanciado por Construtor padrão*)");
		System.out.println(carga1);

		
		
		
		Carga carga2 = new Carga("CAR-0202", "Ford", "F4000", 100, new Motor(12,800),	4000, 20000);

		System.out
				.println("------------------------------------------------------------");
		System.out
				.println("Info Carga 2: (*Instanciado por Construtor com parâmtros*)");
		System.out.println(carga2);

	}

}
