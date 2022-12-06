package UserInterface;

public class IOSElement implements MobileElement{
	private String title;
	private MobileForm form;

	protected IOSElement(String title)
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
