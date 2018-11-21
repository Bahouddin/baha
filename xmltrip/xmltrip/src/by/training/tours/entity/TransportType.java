package by.training.tours.entity;
public enum TransportType {
	AVIA("авиа"), RAILWAY("ж/д"), AUTO("авто"), SHIP("лайнер");
	
	private String name;

	public String getName() {
		return name;
	}

	private TransportType(String name) {
		this.name = name;
	}

	public static TransportType getByName(String name) {
		for(TransportType type : values()) {
			if(type.getName().equals(name)) {
				return type;
			}
		}
		throw new EnumConstantNotPresentException(TransportType.class, name);
	}
}
