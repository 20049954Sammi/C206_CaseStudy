
public class food {
	
	
	private String food;
	private int foodid;
	private double price;
	
	public food(int foodid, String food, double price) {
		super();
		this.food = food;
		this.foodid = foodid;
		this.price = price;
	}

	public String getFood() {
		return food;
	}

	public int getFoodid() {
		return foodid;
	}

	public double getPrice() {
		return price;
	}
	
	
	
}
