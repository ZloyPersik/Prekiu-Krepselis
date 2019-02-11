package org.vytas.shopas.filters;

import java.util.ArrayList;
import java.util.List;

import org.vytas.shopas.model.Preke;

public class Filtras {
	
	private double paklaida;
	

	public Filtras(double paklaida) {
		this.paklaida = paklaida;
	}

	public Filtras() {
		this.paklaida = 0.1;
	}

	public List<Preke> paieska(List<Preke> duomenys, Double plotis, Double aukstis, Double gylis, Double svoris,
			String pavadinimas, String serijosNr) {

		DoubleFiltras dFiltras = new DoubleFiltras();
		StringFiltras sFiltras = new StringFiltras();

		List<Preke> result = new ArrayList<Preke>();

		boolean filterFlag = true;
		boolean searchCrit = false;

		for (Preke preke : duomenys) {
			searchCrit = false;
			filterFlag = true;

			if (plotis != null) {
				searchCrit = true;

				filterFlag = filterFlag && dFiltras.isItPass(preke.getPlotis(), plotis, paklaida);
			}

			if (aukstis != null) {
				searchCrit = true;

				filterFlag = filterFlag && dFiltras.isItPass(preke.getAukstis(), aukstis, paklaida);
			}
			if (gylis != null) {
				searchCrit = true;
				filterFlag = filterFlag && dFiltras.isItPass(preke.getGylis(), gylis, paklaida);

			}
			if (svoris != null) {
				searchCrit = true;
				filterFlag = filterFlag && dFiltras.isItPass(preke.getSvoris(), svoris, paklaida);

			}
			
			if (pavadinimas != null) {
				searchCrit = true;
				filterFlag = filterFlag && sFiltras.arPanasusTekstai(preke.getPavadinimas(), pavadinimas);

			}
			
			if (serijosNr != null) {
				searchCrit = true;
				filterFlag = filterFlag && sFiltras.arPanasusTekstai(preke.getSerijosNr(), serijosNr);

			}
			
			if (searchCrit && filterFlag) {
				result.add(preke);
			}

		}

		return result;
	}

}

