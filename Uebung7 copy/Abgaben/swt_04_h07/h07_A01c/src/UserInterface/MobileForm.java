package UserInterface;

import java.util.*;

public abstract class MobileForm {
	protected String title;
	protected ArrayList<MobileElement> elements;
	
	public abstract void addElement(String title);
	
	public void render()
	{
		for(MobileElement curr:elements)
		{
			curr.render();
		}
	}
}
