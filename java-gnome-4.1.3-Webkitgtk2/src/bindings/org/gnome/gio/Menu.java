
package org.gnome.gio;


public class Menu
    extends MenuModel
{


    public Menu() {
        super(GMenu.createMenu());
    }

    protected Menu(long pointer) {
        super(pointer);
    }

}
