package coffee_shop;

public class Cappuccino extends Coffee {
 private double c1;
	public Cappuccino (double espresso_shot, double steamed_milk, double crema) {
		super(espresso_shot, steamed_milk, crema);
	}
	
	public void prepare() {
		//uniformity is the key here
		//three equal layers of the ingredients
		c1 = (1/3)*3;
	}
	public String toString() {
		return "Cappuccino Recipe: " + super.toString();
	}
}
