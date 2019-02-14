package org.vytas.shopas.filters;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.vytas.shopas.model.Preke;

public class FiltrasTest {

	private Filtras paklaida;
	private List<Preke> preke;

	@Before
	public void paklaidosTestas() {

		preke = new ArrayList<>();
		preke.add(new Preke(1, 1, 1, 10, "aaa", "1"));
		preke.add(new Preke(1.5, 1, 1, 10, "aaa", "2"));
		preke.add(new Preke(1, 1, 1, 10, "bbb", "3"));
		preke.add(new Preke(1, 1, 1, 10, "ccc", "4"));
		preke.add(new Preke(1, 1, 1, 10, "dddaaa", "5"));
		
		paklaida = new Filtras(preke);
	}
//paklaida.paieska(preke ,1, 1, 1, 10, "aaa", "1"));

	@Test
	public void plotisOnlyTest() {
		paklaida = new Filtras(preke, 0.1, new DoubleFiltrasProc());
		
		List<Preke> rez = paklaida.paieska(1.5, null, null, null, null, null);
		Assert.assertEquals(1, rez.size());
		
		rez = paklaida.paieska(1.59, null, null, null, null, null);
		Assert.assertEquals(1, rez.size());
		
		rez = paklaida.paieska(1.41, null, null, null, null, null);
		Assert.assertEquals(1, rez.size());

	}
	
	@Test
	public void ismatavimaiVisiProcTest() {
		paklaida = new Filtras(preke, 0.1, new DoubleFiltrasProc());
		
		List<Preke> rez = paklaida.paieska(1.5, 1.0, 1.0, 10.0, null, null);
		Assert.assertEquals(1, rez.size());
		
		rez = paklaida.paieska(1.59,  1.09, 1.09, 10.9, null, null);
		Assert.assertEquals(1, rez.size());
		
		rez = paklaida.paieska(1.41,  0.91, 0.91, 9.1, null, null);
		Assert.assertEquals(1, rez.size());

	}
	
	@Test
	public void ismatavimaiVisiSiSiTest() {
		paklaida = new Filtras(preke, 0.1, new DoubleFiltrasSiVienetas());
		
		List<Preke> rez = paklaida.paieska(1.5, 1.0, 1.0, 10.0, null, null);
		Assert.assertEquals(1, rez.size());
		
		rez = paklaida.paieska(1.59,  1.09, 1.09, 10.09, null, null);
		Assert.assertEquals(1, rez.size());
		
		rez = paklaida.paieska(1.41,  0.91, 0.91, 9.91, null, null);
		Assert.assertEquals(1, rez.size());

	}
	
}
//parasyt testa jei paklaida yra 0.01 kazkas tokio

