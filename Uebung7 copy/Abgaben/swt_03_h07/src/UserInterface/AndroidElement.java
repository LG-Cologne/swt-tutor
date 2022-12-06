package UserInterface;

public class AndroidElement extends MobileForm {
  @Override
  public void render() {
    System.out.println("Rendering mobile form:" + getTitle());
    for (MobileElement elem : containedElems) {
      elem.render();
    }
  }

  @Override
  protected void register(MobileForm form) {
    containedElems.add(form);
  }

  public void addElement(String title) {

  }

}
