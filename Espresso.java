package HW4;

public class Espresso extends Coffee {
	private double es1;
	
	public Espresso (double espresso_shot, double steamed_milk, double crema) {
		super(espresso_shot, steamed_milk, crema);
	}
	
	public void prepare() {
		//first add espresso_shot
		//then add crema
		es1 = super.getEspresso_shot() + super.getCrema();
	}

	public String toString() {
		return "Espresso Recipe: " + super.toString();
	}

}
