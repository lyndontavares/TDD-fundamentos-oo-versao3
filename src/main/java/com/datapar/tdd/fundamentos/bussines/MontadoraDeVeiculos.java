package com.datapar.tdd.fundamentos.bussines;

import java.util.ArrayList;
import java.util.List;

import com.datapar.tdd.fundamentos.exceptions.ExceptionLimiteMontagem;

public class MontadoraDeVeiculos {

	private static int CAPACIDADE_MAXIMA_DE_MONTAGEM = 1000; 
	private static int CAPACIDADE_MINIMA_DE_MONTAGEM = 1;
	
	private int quantidadeDeVeiculosMontados;
	private int capacidadeDeVeiculosAMontar;
	
	public MontadoraDeVeiculos (int capacidadeDeVeiculosAMontar) throws Exception {

		if (capacidadeDeVeiculosAMontar < CAPACIDADE_MINIMA_DE_MONTAGEM ) {
			throw new ExceptionLimiteMontagem("Capacidade de veiculos a montar deve ser maior ou igual a "+CAPACIDADE_MINIMA_DE_MONTAGEM);
		}

		if (capacidadeDeVeiculosAMontar > CAPACIDADE_MAXIMA_DE_MONTAGEM) {
			throw new ExceptionLimiteMontagem("Capacidade de veiculos a montar deve ser maior menor ou igual a "+CAPACIDADE_MAXIMA_DE_MONTAGEM);
		}

		quantidadeDeVeiculosMontados = 0;
		this.capacidadeDeVeiculosAMontar = capacidadeDeVeiculosAMontar;
		
	}

	public int getQuantidadeDeVeiculosMontados() {
		return quantidadeDeVeiculosMontados;
	}

	public static int getCapacidadeMaximaDeVeiculosAMontar() {
		return CAPACIDADE_MAXIMA_DE_MONTAGEM;
	}

	public static int getCapacidadeMinimaDeVeiculosAMontar() {
		return CAPACIDADE_MINIMA_DE_MONTAGEM;
	}
	
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public List<VeiculoTipo> montarVeiculos(int quantidade, Class clazz ) throws Exception {
		
		if ( quantidadeDeVeiculosMontados + quantidade > capacidadeDeVeiculosAMontar ){
			throw new ExceptionLimiteMontagem("Excede capacidade de fabricacao: "+capacidadeDeVeiculosAMontar+" veiculos");
		}
		
		List<VeiculoTipo> ListaDeveiculos = new ArrayList<VeiculoTipo>();
		
		for (int n = 1; n <= quantidade; n++) {
			ListaDeveiculos.add(  new VeiculoFactory().getVeiculo(clazz)  );
		}
		
		return ListaDeveiculos;
	}

}
