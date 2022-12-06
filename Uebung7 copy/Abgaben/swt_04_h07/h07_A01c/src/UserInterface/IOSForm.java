package UserInterface;

public class IOSForm extends MobileForm{

	public void addElement(String title)
	{
		IOSElement temp = new IOSElement(title);
		elements.add(temp);
		temp.register(this);
	}
}
