
public class UseButton implements Button{
	
	Button myButton = new UseButton();
	public String status = "Never gonna give you up";
	public int clicked = 0;
	
	public void push() {
		clicked++;
		System.out.println("This button has been clicked " + clicked + " times");
		
		if(myButton.state().equals("Never gonna give you up")) {
			status="Never gonna let you down";
		} else if(myButton.state().equals("Never gonna let you down")) {
			status="Never gonna run around and";
		} else if(myButton.state().equals("Never gonna run around and")) {
			status="Desert you";
		} else {
			status="Never gonna give you up";
		}
		
	}

	public String state() {
		return status;
	}

	

}
