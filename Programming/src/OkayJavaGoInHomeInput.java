import javax.swing.JOptionPane;

import org.opentutorials.iot.DimmingLights;
import org.opentutorials.iot.Elevator;
import org.opentutorials.iot.Lighting;
import org.opentutorials.iot.Security;

public class OkayJavaGoInHomeInput {

	// parameter, �Ű�����
	public static void main(String[] args) {
		
		// Input�� ���α׷����� ��� ����鿩 ����� �� �ִ°� ? by���۸��� ���� 
		// showInputDialog�� �̿��Ͽ� Input���� �־���.
		// String id = JOptionPane.showInputDialog("Enter a id");
		
		//arguments�� ���� �Է��� �� �ְ�, args��� �Ű������� ���� �Է°��� ǥ���� �� �ִ�.
		//Run configurations - �ش� Ŭ���� - arguments - �� �Է�
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
