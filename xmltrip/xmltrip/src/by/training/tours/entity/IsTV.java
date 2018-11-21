package by.training.tours.entity;
public class IsTV extends HotelCharacteristic {
	public IsTV() {
		super("Е�?ть ли телевизор");
	}

	private Boolean is; 
	
	@Override
	public void setValue(String value) {
		is = Boolean.parseBoolean(value);
	}

	@Override
	public String getValue() {
		return String.valueOf(is);
	}
}
