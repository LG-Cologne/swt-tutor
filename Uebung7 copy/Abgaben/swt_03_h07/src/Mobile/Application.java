package Mobile;

import UserInterface.AndroidFormCreator;
import UserInterface.MobileForm;

public class Application {
  MobileForm form;
  private String getOS(){
    return "Android";
  }
  private void initialize(){
    if (getOS().equals("Android")){
      form = AndroidFormCreator.newForm("Android-Form");
    }
    else {
      throw new RuntimeException("Braucht eh keiner");
    }
  }
  public void run(){
    initialize();
    for (int i = 0; i < 3; i++) {
      form.addElement("Element No"+i);
    }
    //rendert auch die Unter-Elemente
    form.render();
  }
}
