package Mobile;

import UserInterface.*;

public class Application {
	private MobileForm form;
	
	private String getOS()
	{
		/*
		 * if(os == Android) return "Android";
		 * else if (os == iOS) return "iOS";
		 * else throw Exception;
		 * */
		return "";
	}
	
	private void initialize()
	{
		if(getOS() == "Android") form = new AndroidForm();
		else if (getOS() == "iOS") form = new IOSForm();
	}
	
	public void run()
	{
		initialize();
		form.addElement("1");
		form.addElement("2");
		form.addElement("3");
		form.render();
	}
}
