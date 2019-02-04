package baldai;

import java.util.ArrayList;
import java.util.List;

public class DataLoader {

	public List<Preke> loadData() {

		List<Preke> rezultatas = new ArrayList<Preke>();

		rezultatas.add(new Preke(21, 45, 55, 12, "sofa", "abc321"));
		rezultatas.add(new Preke(22, 45, 55, 12, "sofa raudona", "abc123"));

		return rezultatas;

	}

}
