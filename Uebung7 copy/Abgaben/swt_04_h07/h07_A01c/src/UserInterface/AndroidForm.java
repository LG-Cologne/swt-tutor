package UserInterface;

public class AndroidForm extends MobileForm{
	
	public void addElement(String title)
	{
		AndroidElement temp = new AndroidElement(title);
		elements.add(temp);
		temp.register(this);
	}
}
