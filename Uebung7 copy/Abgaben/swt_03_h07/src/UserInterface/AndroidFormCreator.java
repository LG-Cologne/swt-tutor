package UserInterface;

public class AndroidFormCreator implements FormCreator{
  public static MobileForm newForm(String title){
    AndroidForm neu = new AndroidForm();
    neu.setTitle(title);
    return neu;
  }
}
