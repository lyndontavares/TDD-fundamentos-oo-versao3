package com.datapar.tdd.fundamentos.suite;

import org.junit.Test;

import com.datapar.tdd.fundamentos.bussines.MontadoraDeVeiculos;

public class TesteIniciarMontadoraDeVeiculos {


	@Test(expected = Exception.class)
	public void testeIniciarMontadoraComCapacidadeAbaixoDaMinima() throws Exception {
		
		new MontadoraDeVeiculos(MontadoraDeVeiculos.getCapacidadeMinimaDeVeiculosAMontar()-1);
		
	}

	@Test(expected = Exception.class)
	public void testeIniciarMontadoraComCapacidadeAcimaDoLimite() throws Exception {
		
		new MontadoraDeVeiculos(MontadoraDeVeiculos.getCapacidadeMaximaDeVeiculosAMontar()+1);
		
	}
	
}
