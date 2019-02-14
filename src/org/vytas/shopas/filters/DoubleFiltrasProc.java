package org.vytas.shopas.filters;

public class DoubleFiltrasProc implements DoubleFiltras {

	public boolean isItPass(double value1, double value2, double paklaida) {
		return 1 - (Math.min(value1, value2) / Math.max(value1, value2)) < paklaida;
	}
}
