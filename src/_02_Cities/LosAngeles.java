package _02_Cities;

public class LosAngeles extends City{
	double baseTax;
	public LosAngeles(int population, double growthRate) {
		super(population, growthRate);
		baseTax = population * (growthRate * growthRate/2);
	}

	@Override
	double getAnnualTaxes() {
		return baseTax;
	}
	
}
