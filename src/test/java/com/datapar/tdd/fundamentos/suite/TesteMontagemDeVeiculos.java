package com.datapar.tdd.fundamentos.suite;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

import com.datapar.tdd.fundamentos.bussines.MontadoraDeVeiculos;
import com.datapar.tdd.fundamentos.model.Passeio;

public class TesteMontagemDeVeiculos {

	private MontadoraDeVeiculos montadora;

	@Test
	public void testeMontarVeiculosAcimaDaCapadidadeComTryCatch() throws Exception {
		montadora = new MontadoraDeVeiculos(MontadoraDeVeiculos.getCapacidadeMaximaDeVeiculosAMontar());

		try {
			montadora.montarVeiculos(MontadoraDeVeiculos.getCapacidadeMaximaDeVeiculosAMontar() + 1, Passeio.class);
			Assert.fail();
		} catch (Exception e) {

		}
	}

	@Test(expected = Exception.class)
	public void testeMontarVeiculosAcimaDaCapadidade() throws Exception {
		montadora = new MontadoraDeVeiculos(MontadoraDeVeiculos.getCapacidadeMaximaDeVeiculosAMontar());
		montadora.montarVeiculos(MontadoraDeVeiculos.getCapacidadeMaximaDeVeiculosAMontar() + 1, Passeio.class);
	}

	@Test
	public void testeQuantidadeVeiculosMontados() throws Exception {
		montadora = new MontadoraDeVeiculos(MontadoraDeVeiculos.getCapacidadeMaximaDeVeiculosAMontar());

		int quantidadeMontada = montadora
				.montarVeiculos(MontadoraDeVeiculos.getCapacidadeMaximaDeVeiculosAMontar(), Passeio.class).size();

		assertTrue(MontadoraDeVeiculos.getCapacidadeMaximaDeVeiculosAMontar() == quantidadeMontada);
	}

}
