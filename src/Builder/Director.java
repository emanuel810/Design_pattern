package Builder;

public class Director {
	
	private Builder builder;
	
	
	public Builder hacerCarro(Builder builder) {
		this.builder = builder;
		return builder;
	}
	
	
	
	public Builder construirHilux(Builder builder) {
		builder.reset();
		builder.setAsiento(2);
		builder.setMotor("V8");
		builder.setGPS("mundial");
	
		return builder;
	}
	
	
	

	public Builder construirToyota(Builder builder) {
		builder.reset();
		builder.setAsiento(4);
		builder.setMotor("V3");
		builder.setGPS("intercontinental");
	
		return builder;
	}
	
	
}
