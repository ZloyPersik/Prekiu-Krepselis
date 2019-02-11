package org.vytas.shopas.filters;

public class StringFiltras {
	public boolean arPanasusTekstai(String str1, String str2) {
		
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();
		
		return str2.contains(str1) || str1.contains(str2);
		
		
		
	}
}
//kaip lyginami tekstai intiek

//string metodas contains(_)