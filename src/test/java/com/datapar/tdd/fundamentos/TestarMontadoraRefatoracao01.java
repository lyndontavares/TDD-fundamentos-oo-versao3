package com.datapar.tdd.fundamentos;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

import com.datapar.tdd.fundamentos.bussines.MontadoraDeVeiculos;
import com.datapar.tdd.fundamentos.model.Passeio;

public class TestarMontadoraRefatoracao01 {

	private MontadoraDeVeiculos montadora;

	@Test(expected = Exception.class)
	public void testeIniciarMontadoraComCapacidadeAbaixoDaMinima() throws Exception {
		montadora = new MontadoraDeVeiculos(MontadoraDeVeiculos.getCapacidadeMinimaDeVeiculosAMontar()-1);
	}

	@Test(expected = Exception.class)
	public void testeIniciarMontadoraComCapacidadeAcimaDoLimite() throws Exception {
		montadora = new MontadoraDeVeiculos(MontadoraDeVeiculos.getCapacidadeMaximaDeVeiculosAMontar()+1);
	}

	@Test
	public void testeMontarVeiculosAcimaDaCapadidadeComTryCatch() throws Exception {
		montadora = new MontadoraDeVeiculos(MontadoraDeVeiculos.getCapacidadeMaximaDeVeiculosAMontar());
		 
		try {
			montadora.montarVeiculos(MontadoraDeVeiculos.getCapacidadeMaximaDeVeiculosAMontar()+1,Passeio.class);
			Assert.fail();
		} catch (Exception e) {

		}
	}

	@Test(expected = Exception.class)
	public void testeMontarVeiculosAcimaDaCapadidade() throws Exception {
		montadora = new MontadoraDeVeiculos(MontadoraDeVeiculos.getCapacidadeMaximaDeVeiculosAMontar());
		montadora.montarVeiculos(MontadoraDeVeiculos.getCapacidadeMaximaDeVeiculosAMontar()+1,Passeio.class);
	}

	@Test(expected = Exception.class)
	public void testeQuantidadeVeiculosMontados() throws Exception {				
		montadora = new MontadoraDeVeiculos(MontadoraDeVeiculos.getCapacidadeMaximaDeVeiculosAMontar());		
		int quantidadeMontada = montadora.montarVeiculos(MontadoraDeVeiculos.getCapacidadeMaximaDeVeiculosAMontar(),Passeio.class).size();
		assertTrue( MontadoraDeVeiculos.getCapacidadeMaximaDeVeiculosAMontar() == quantidadeMontada);
	}
	
	
}
