package HW4;

public class Latte extends Coffee{
	private double l1;
	
	public Latte(double espresso_shot, double steamed_milk, double crema) {
		super(espresso_shot, steamed_milk, crema);
	}
	
	public void prepare() {
		//First add milk, then espresso_shot an finally crema
		//Everything is mixed together
		l1 = super.getSteamed_milk() + super.getEspresso_shot() + super.getCrema();
	}

	public String toString() {
		return "Latte Recipe: " + super.toString();
	}
}
