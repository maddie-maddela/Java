package coffee_shop;

public abstract class Coffee {
	private double espresso_shot;
	private double steamed_milk;
	private double crema;
	
	public Coffee(double espresso_shot, double steamed_milk, double crema ) {
		this.espresso_shot = espresso_shot;
		this.steamed_milk = steamed_milk;
		this.crema = crema;
	}

	public double getEspresso_shot() {
		return espresso_shot;
	}

	public void setEspresso_shot(double espresso_shot) {
		this.espresso_shot = espresso_shot;
	}

	public double getSteamed_milk() {
		return steamed_milk;
	}

	public void setSteamed_milk(double steamed_milk) {
		this.steamed_milk = steamed_milk;
	}

	public double getCrema() {
		return crema;
	}

	public void setCrema(double crema) {
		this.crema = crema;
	}
	
	abstract void prepare();  
	
	public String toString() {
		return getEspresso_shot() + "*EspressoShot " + getSteamed_milk() + "*SteamedMilk " + getCrema() + "*Crema";
	}

}
