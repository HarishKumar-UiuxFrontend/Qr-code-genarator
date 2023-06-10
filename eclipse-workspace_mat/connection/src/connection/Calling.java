package connection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Calling extends Storage2 {

	Map<String, PrimaryData> map = new HashMap<>();

	public void addData() {
		for (PrimaryData pd : list1) {
			map.put(pd.getId(), pd);
			for (SecondaryData sd : list2) {
				if (pd.getId().equals(sd.getId())) {
					pd.setId(sd.getDesignation());
					map.put(sd.getId(), pd);
				}
			}
		}
		System.out.println(map);
		
	}
}


