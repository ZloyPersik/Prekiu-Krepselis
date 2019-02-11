package org.vytas.shopas;

import java.util.ArrayList;
import java.util.List;

import org.vytas.shopas.data.DataLoader;
import org.vytas.shopas.filters.Filtras;
import org.vytas.shopas.model.Preke;

public class PrekeAPP {

	public static void main(String[] args) {

		DataLoader duomenuIkroviklis = new DataLoader();
		
		List<Preke> duomenys = duomenuIkroviklis.loadData();
		
		for (Preke preke : duomenys) {
			System.out.println(preke.getPavadinimas());
		}
		
		System.out.println();
		
		Filtras naujasFiltras = new Filtras(1);
		List<Preke> result = naujasFiltras.paieska(duomenys,21.98, 45.05, null, null, null, null);
		for (Preke preke : result) {
			System.out.println(preke.getPavadinimas());
		}
	}

}

//pasibaigt su duomenim
//pasimokint apie komporatorius







//*****Butu nuostabu kad pasirasytum komporatoriu







