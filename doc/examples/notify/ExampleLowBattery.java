/*
 * ExampleLowBattery.java
 *
 * Copyright (c) 2009 Operational Dynamics Consulting Pty Ltd
 *
 * The code in this file, and the program it is a part of, are made available
 * to you by the authors under the terms of the "GNU General Public Licence,
 * version 2" See the LICENCE file for the terms governing usage and
 * redistribution.
 */
package notify;

import org.gnome.gtk.Gtk;
import org.gnome.gtk.Menu;
import org.gnome.gtk.MenuItem;
import org.gnome.gtk.StatusIcon;
import org.gnome.notify.Notification;
import org.gnome.notify.Notify;

public class ExampleLowBattery
{

    /**
     * A simple program that sits in tray and displays a low battery warning.
     * 
     * @author Serkan Kaba
     * @since 4.0.11
     */
    public static void main(String[] args) {

        /*
         * Initialize GTK.
         */

        Gtk.init(args);

        /*
         * Initialize notification system.
         */

        Notify.init("low-battery-example");

        /*
         * Create a StatusIcon with GNOME Power Manager icon. Note that
         * StatusIcon can not be directly constructed with an icon name.
         */

        StatusIcon icon = new StatusIcon();
        icon.setFromIconName("gnome-power-manager");

        /*
         * Attach a popup menu with a single Quit MenuItem to StatusIcon.
         */

        icon.connect(new org.gnome.gtk.StatusIcon.PopupMenu() {

            public void onPopupMenu(StatusIcon source, int button, int activateTime) {
                Menu trayMenu = new Menu();
                MenuItem quitItem = new MenuItem("Quit");
                quitItem.connect(new org.gnome.gtk.MenuItem.Activate() {

                    public void onActivate(MenuItem source) {
                        Gtk.mainQuit();
                    }

                });
                trayMenu.add(quitItem);
                trayMenu.showAll();
                trayMenu.popup(source);

            }

        });

        /*
         * Create a notification with a warning icon, attached to StatusIcon.
         */

        Notification notification = new Notification("Low Battery Example", "Your battery is low!",
                "messagebox_warning", icon);

        /*
         * Display the notification.
         */

        notification.show();

        /*
         * Run the main loop.
         */

        Gtk.main();
    }

}
