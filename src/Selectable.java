/**
 * an interface model for selecting objects
 * author: Miray Ayerdem
 * version : 03/11/2020
 */
public interface Selectable {
    //methods
    public boolean getSelected();
    public void setSelected(boolean a);
    public Shape contains(int x, int y);

}
