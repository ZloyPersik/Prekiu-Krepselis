package org.vytas.shopas.filters;

public class DoubleFiltras {

	public boolean isItPass(double value1, double value2, double paklaida) {
		return Math.abs(value1-value2)<paklaida;
		
	}
}
