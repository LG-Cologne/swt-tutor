package UserInterface;

/* Ja ist eigentlich nen Interface aber wie soll ich nen Attribut title sinnvoll in nem Interface nutzen?*/
public abstract class MobileElement {

  private String title = "";

  protected String getTitle() {
    return title;
  }

  protected void setTitle(String title) {
    this.title = title;
  }

  abstract void render();
  abstract void register(MobileForm form);
}
