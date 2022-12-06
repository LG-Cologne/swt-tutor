package UserInterface;

public class AndroidForm extends MobileForm {
  @Override
  public void render() {
    System.out.println(getTitle());
    for (MobileElement aF : containedElems){
      aF.render();
    }
  }

  @Override
  protected void register(MobileForm form){
    containedElems.add(form);
  }
  @Override
  public void addElement(String title){
   register(AndroidFormCreator.newForm(title));
  }
}
