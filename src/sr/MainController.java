package sr;

/**
 * @author Matthew Romleski
 */

public class MainController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TemperatureConverter aConverter = new TemperatureConverter();
		ConsoleView aView = new ConsoleView();
		
		aConverter.setTempC(100);
		aView.print(aConverter.toString());
		
		aConverter.setTempC(0);
		aView.print(aConverter.toString());
		
		aConverter.setTempC(-40);
		aView.print(aConverter.toString());
		
	}

}
