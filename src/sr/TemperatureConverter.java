package sr;

/**
 * @author Matthew Romleski
 */

public class TemperatureConverter {

	private double tempC;
	
	public double getTempC() {
		return this.tempC;
	}
	
	public double getTempF() {
		return this.tempC * 9/5 + 32;
	}

	public double getTempK() {
		return this.tempC + 273.15;
	}
	
	public void setTempC(double newTemp) {
		this.tempC = newTemp;
	}
	
	@Override
	public String toString() {
		String message = "";
		message += "Celsius: " + this.getTempC() + "\n";
		message += "Fahrenheit: " + this.getTempF() + "\n";
		message += "Kelvin: " + this.getTempK() + "\n";
		
		return message;
	}
}
