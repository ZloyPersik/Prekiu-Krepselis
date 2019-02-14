package org.vytas.shopas.data;

import java.util.ArrayList;
import java.util.List;

import org.vytas.shopas.model.Preke;

public class DataLoader implements IDataLoader {

	@Override
	public List<Preke> loadData() {

		List<Preke> rezultatas = new ArrayList<Preke>();

		rezultatas.add(new Preke(21, 45, 55, 12, "sofa", "abc321"));
		rezultatas.add(new Preke(22, 45, 55, 12, "sofa raudona", "abc123"));

		return rezultatas;

	}

}
//Rusiuoti pagal matmenis, jei nera atitinkamo, pateikti artimiausius variantus tai paieskai.
//Parasyti ribas kiek nuo duotu paieskos duomenu gali skirtis pateikiami rezultatai, jei nera tikslaus varianto.