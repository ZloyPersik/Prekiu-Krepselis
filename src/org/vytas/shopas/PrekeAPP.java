package org.vytas.shopas;

import java.util.List;

import org.vytas.shopas.data.DataLoader;
import org.vytas.shopas.data.IDataLoader;
import org.vytas.shopas.filters.Filtras;
import org.vytas.shopas.model.Preke;

public class PrekeAPP {

	public static void main(String[] args) {

		IDataLoader duomenuIkroviklis = new DataLoader();
		
		List<Preke> duomenys = duomenuIkroviklis.loadData();
		
		for (Preke preke : duomenys) {
			System.out.println(preke.getPavadinimas());
		}
		
		System.out.println();
		
		Filtras naujasFiltras = new Filtras(duomenys);
		List<Preke> result = naujasFiltras.paieska(21.98, 45.05, null, null, null, null);
		for (Preke preke : result) {
			System.out.println(preke.getPavadinimas());
		}
	}

}

//pasibaigt su duomenim
//pasimokint apie komporatorius







//*****Butu nuostabu kad pasirasytum komporatoriu







