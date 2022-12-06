package UserInterface;

import java.util.ArrayList;

public abstract class MobileForm extends MobileElement{
  ArrayList<MobileElement> containedElems;
  public abstract void render();
  @Override
  protected abstract void register(MobileForm form);
  public abstract void addElement(String title);

}
