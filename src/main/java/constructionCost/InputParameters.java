package constructionCost;

import java.util.Scanner;

public class InputParameters {
	
	int area;
	String materialStandard;
	
	public void readInput(){
		Scanner scanner=new Scanner(System.in);
		setArea(scanner.nextInt());
		setMaterialStandard(scanner.next());
	}
	public int getArea() {
		return area;
	}

	public void setArea(int area) {
		this.area = area;
	}

	public String getMaterialStandard() {
		return materialStandard;
	}

	public void setMaterialStandard(String materialStandard) {
		this.materialStandard = materialStandard;
	}
	
}
