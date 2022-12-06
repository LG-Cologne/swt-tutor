package UserInterface;

public class AndroidElement implements MobileElement{
	private String title;
	private MobileForm form;

	protected AndroidElement(String title)
	{
		this.title = title;
	}

	public void render()
	{
		
	}
	
	public void register(MobileForm form)
	{
		this.form = form;
	}
}
