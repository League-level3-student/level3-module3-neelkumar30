package _01_AnimalFarm;
import java.util.ArrayList;

public class Farm {
	public static void main(String[] args) {
		ArrayList<Animal> farm = new ArrayList<Animal>();
		Cow cow = new Cow();
		farm.add(cow);
		farm.add(new Horse());
		farm.add(new Pig());
		farm.add(new Chicken());
		farm.add(new Dog());
		farm.add(new Cat());
		for (int i = 0; i < farm.size(); i++) {
			farm.get(i).makeNoise();
			farm.get(i).name();
		}
	}
}
