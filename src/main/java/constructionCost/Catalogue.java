package constructionCost;

import java.util.HashMap;
import java.util.Map;

public class Catalogue {
	
	Map<String,Integer> items=new HashMap();
	
	public void addCatalogue(){
		items.put("standard materials", 1200);
		items.put("above standard materials", 1500);
		items.put("high standard materials", 1800);
		items.put("high standard materials and fully automated", 2500);
	}
	
	public Map<String, Integer> getCatalogue() {
		return items;
	}
}
