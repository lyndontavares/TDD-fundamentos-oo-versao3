package com.datapar.tdd.fundamentos.suite;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.datapar.tdd.fundamentos.bussines.VeiculoFactory;
import com.datapar.tdd.fundamentos.exceptions.ExceptionVeiculoFactory;
import com.datapar.tdd.fundamentos.model.Carga;
import com.datapar.tdd.fundamentos.model.Passeio;

public class TesteDaFabricaDeVeiculos {

	@Test
	public void testeCriacaoVeiculoDePasseio() throws ExceptionVeiculoFactory{
		
		assertTrue( new VeiculoFactory().getVeiculo( Passeio.class ).getClass().equals( Passeio.class )   );
		
	}

	@Test
	public void testeCriacaoVeiculoDeCarga() throws ExceptionVeiculoFactory{
		
		assertTrue( new VeiculoFactory().getVeiculo( Carga.class ).getClass().equals( Carga.class )   );
		
	}
	
	@Test(expected = ExceptionVeiculoFactory.class)
	public void testeCriacaoVeiculoTipoDesconhecido() throws ExceptionVeiculoFactory{
		
		new VeiculoFactory().getVeiculo( null );
		
	}
		
}
