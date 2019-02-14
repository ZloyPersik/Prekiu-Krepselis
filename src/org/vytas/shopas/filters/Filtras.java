package org.vytas.shopas.filters;

import java.util.ArrayList;
import java.util.List;

import org.vytas.shopas.model.Preke;

public class Filtras {

	private double paklaida;

	private DoubleFiltras dFiltras = null;
	private List<Preke> duomenys;

	
	
	
	
	
	public Filtras(List<Preke> duomenys) {
		this(duomenys, 0.15);
	}

	public Filtras(List<Preke> duomenys, double paklaida) {
		this(duomenys, paklaida, new DoubleFiltrasProc());
	}

	public Filtras(List<Preke> duomenys, double paklaida, DoubleFiltras df) {
		this.paklaida = paklaida;
		this.duomenys = duomenys;
		this.dFiltras = df;
	}

	
	
	
	
	
	
	
	public List<Preke> paieska(Double plotis, Double aukstis, Double gylis, Double svoris, String pavadinimas,
			String serijosNr) {

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
