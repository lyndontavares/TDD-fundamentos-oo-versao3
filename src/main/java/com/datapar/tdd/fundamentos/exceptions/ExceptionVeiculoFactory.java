package com.datapar.tdd.fundamentos.exceptions;

public class ExceptionVeiculoFactory extends Exception {
	private static final long serialVersionUID = 1L;
	public ExceptionVeiculoFactory(String msg) {
		super(msg);
		System.err.println(msg);
	}

}
