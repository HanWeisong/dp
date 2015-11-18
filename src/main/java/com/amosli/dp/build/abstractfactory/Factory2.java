package com.amosli.dp.build.abstractfactory;

public class Factory2 extends AbstractFactory{

	@Override
	public AbstractProductA createProductA() {
		return new ProductA2();
	}

	@Override
	public AbstractProductB createProductB() {
		return new ProductB2();
	}

}