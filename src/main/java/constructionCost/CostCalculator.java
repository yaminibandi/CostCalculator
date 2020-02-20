package constructionCost;

import java.util.HashMap;
import java.util.Map;

public class CostCalculator {
	
	int FinalCost;
	
	public void CalculateCost(){
		InputParameters inputParameters=new InputParameters();
		Catalogue catalogue = new Catalogue();
		
		catalogue.addCatalogue();
		inputParameters.readInput();
		
		int area=inputParameters.getArea();
		String materialStandard=inputParameters.getMaterialStandard();
		
		Map<String,Integer> items=catalogue.getCatalogue();
		int costPerSquareFeet=items.get(materialStandard.toLowerCase());
		setFinalCost(costPerSquareFeet*area);
		
	}
	
	public int getFinalCost() {
		return FinalCost;
	}
	
	public void setFinalCost(int finalCost) {
		FinalCost = finalCost;
	}
	
}
