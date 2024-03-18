package coffee_shop;

public class Macchiato extends Coffee {
		private double m1;
		public Macchiato(double espresso_shot, double steamed_milk, double crema) {
			super(espresso_shot, steamed_milk, crema);
		}
		
		public void prepare() {
			//add double espresso_shot to the milk and top it off with crema
			m1 = 2*super.getEspresso_shot() + super.getSteamed_milk() + super.getCrema();
		}

		public String toString() {
			return "Macchiato Recipe: " + super.toString();
		}

}
