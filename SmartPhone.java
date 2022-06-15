package week3.day1;

public class SmartPhone extends AndriodPhone{

	public void connectWhatsApp() {
		System.out.println("WhatsApp");
	}
	
	public void takevideo() {
		System.out.println(" Take video from Smart Phone");
	}


	
public static void main(String[] args) {
SmartPhone call = new SmartPhone();
call.connectWhatsApp();
call.takevideo();
call.sendmsg();
call.makeCall();
call.saveContact();

}
}
