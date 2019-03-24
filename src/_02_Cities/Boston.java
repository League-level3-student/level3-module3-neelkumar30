package _02_Cities;

public class Boston extends City {
	double baseTax;
	double bonus;
	public Boston(int population, double growthRate) {
		super(population, growthRate);
		baseTax = population * growthRate;
		bonus = population *0.5;
	}

	@Override
	double getAnnualTaxes() {
		double totalTax = baseTax + bonus;
		return totalTax; 
		
	}

}
