import javax.swing.JOptionPane;

import org.opentutorials.iot.DimmingLights;
import org.opentutorials.iot.Elevator;
import org.opentutorials.iot.Lighting;
import org.opentutorials.iot.Security;

public class OkayJavaGoInHomeInput {

	// parameter, 매개변수
	public static void main(String[] args) {
		
		// Input을 프로그램으로 어떻게 끌어들여 사용할 수 있는가 ? by구글링을 통해 
		// showInputDialog를 이용하여 Input값을 주었다.
		// String id = JOptionPane.showInputDialog("Enter a id");
		
		//arguments에 값을 입력할 수 있고, args라는 매개변수를 통해 입력값을 표현할 수 있다.
		//Run configurations - 해당 클래스 - arguments - 값 입력
		String id = args[0];
		String bright = args[1];
		
		// Elevator call
		Elevator myElevator = new Elevator(id);
		myElevator.callForUp(1);
		
		// Security off
		Security mySecurity = new Security(id);
		mySecurity.off();
		
		// Light on
		Lighting hallLamp = new Lighting(id + " / Hall Lamp");
		hallLamp.on();
		
		Lighting floorLamp = new Lighting(id + " / floor Lamp");
		floorLamp.on();
		
		DimmingLights moodLamp = new DimmingLights(id+" moodLamp");
		moodLamp.setBright(Double.parseDouble(bright));
		moodLamp.on();
	}

}
