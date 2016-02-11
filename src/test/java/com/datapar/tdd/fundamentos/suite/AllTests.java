package com.datapar.tdd.fundamentos.suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({
	TesteIniciarMontadoraDeVeiculos.class,
	TesteMontagemDeVeiculos.class,
	TesteDaFabricaDeVeiculos.class})
public class AllTests {
}
