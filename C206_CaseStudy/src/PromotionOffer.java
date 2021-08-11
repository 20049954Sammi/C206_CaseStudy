
public class PromotionOffer {

	 private int PromotionCode;
	 private String fooditem;
	 private int StallID;



	public PromotionOffer(int promotionCode, String fooditem, int stallID) {
		
		PromotionCode = promotionCode;
		this.fooditem = fooditem;
		StallID = stallID;
	}

	public int getPromotionCode() {
		return PromotionCode;
	}

	public void setPromotionCode(int promotionCode) {
		PromotionCode = promotionCode;
		
	}

	public int getStallID() {
		return StallID;
	}

	public void setStallID(int stallID) {
		StallID = stallID;
	}

	public String getFooditem() {
		
		return fooditem;
	}

	public void setFooditem(String fooditem) {
		this.fooditem = fooditem;
	}
	public String toString(){
		String output = "";

		output = String.format("%-15d%-30s%-25s\n", PromotionCode,fooditem ,StallID);
		return output;
	}
	
	
}
