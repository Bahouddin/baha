package by.training.tours.entity;
public class Food extends HotelCharacteristic {
	public Food() {
		super("питание");
	}

	private FoodType foodType; 
	
	@Override
	public void setValue(String value) {
		foodType = FoodType.valueOf(value);
	}

	@Override
	public String getValue() {
		return foodType.toString();
	}
}
