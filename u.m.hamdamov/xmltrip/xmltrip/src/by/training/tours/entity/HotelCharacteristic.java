package by.training.tours.entity;
public abstract class HotelCharacteristic {
	private String name;

	public HotelCharacteristic(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public abstract void setValue(String value);

	public abstract String getValue();

	@Override
	public String toString() {
		return getValue();
	}

	@Override
	public int hashCode() {
		return getClass().hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		return obj != null && getClass() == obj.getClass();
	}
}
