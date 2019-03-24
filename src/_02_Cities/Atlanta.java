package _02_Cities;

public class Atlanta extends City{
	double baseTax;
	public Atlanta(int population, double growthRate) {
		super(population, growthRate);
		baseTax = population * growthRate * 2;
	}

	@Override
	double getAnnualTaxes() {
		return baseTax;
	}

}
