package _02_Cities;

public class SanDiego extends City{
	double baseTax;
	public SanDiego(int population, double growthRate) {
		super(population, growthRate);
		baseTax = population * growthRate;
	}

	@Override
	double getAnnualTaxes() {
		double totalTax = 1000000 + baseTax;
		return totalTax;
	}
}
