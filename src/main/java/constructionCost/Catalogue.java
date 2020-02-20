package constructionCost;

import java.util.HashMap;
import java.util.Map;

public class Catalogue {
	
	Map<String,Integer> items=new HashMap();
	
	public void addCatalogue(){
		items.put("standard materials", 1200);
		items.put("above standard materials", 1200);
		items.put("high standard materials", 1200);
		items.put("high standard materials and fully automated", 1200);
	}
	
	public Map<String, Integer> getCatalogue() {
		return items;
	}
}
