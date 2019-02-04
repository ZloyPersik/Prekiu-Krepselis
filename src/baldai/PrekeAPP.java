package baldai;

import java.util.ArrayList;
import java.util.List;

public class PrekeAPP {

	public static void main(String[] args) {

		DataLoader duomenuIkroviklis = new DataLoader();
		
		List<Preke> duomenys = duomenuIkroviklis.loadData();
		
		for (Preke preke : duomenys) {
			System.out.println(preke.getPavadinimas());
		}
		
		
		
	}

}
