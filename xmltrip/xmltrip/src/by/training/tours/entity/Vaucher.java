package by.training.tours.entity;
import java.util.HashSet;
import java.util.Set;

public class Vaucher {
	private String identity;
	private String type;
	private String country;
	private Integer days;
	private Integer deltaNights;
	private TransportType transportType;
	private Long cost;
	private Set<HotelCharacteristic> characteristics = new HashSet<HotelCharacteristic>();
	public String getIdentity() {
		return identity;
	}
	public void setIdentity(String identity) {
		this.identity = identity;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public Integer getDays() {
		return days;
	}
	public void setDays(Integer days) {
		this.days = days;
	}
	public Integer getDeltaNights() {
		return deltaNights;
	}
	public void setDeltaNights(Integer deltaNights) {
		this.deltaNights = deltaNights;
	}
	public TransportType getTransportType() {
		return transportType;
	}
	public void setTransportType(TransportType transportType) {
		this.transportType = transportType;
	}
	public Long getCost() {
		return cost;
	}
	public void setCost(Long cost) {
		this.cost = cost;
	}
	public Set<HotelCharacteristic> getCharacteristics() {
		return characteristics;
	}
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ID: ").append(getIdentity()).append('\n');
		builder.append("Вид путёвки: ").append(getType()).append('\n');
		builder.append("Страна: ").append(getCountry()).append('\n');
		builder.append("Количе�?тво дней/ночей: ").append(getDays()).append('/').append(getDays() + getDeltaNights()).append('\n');
		builder.append("Тран�?порт: ").append(getTransportType().getName()).append('\n');
		for(HotelCharacteristic characteristic : getCharacteristics()) {
			builder.append(characteristic.getName()).append(": ").append(characteristic.getValue()).append('\n');
		}
		builder.append("Стоимо�?ть: ").append(getCost()).append('\n');
		return builder.toString();
	}
}
