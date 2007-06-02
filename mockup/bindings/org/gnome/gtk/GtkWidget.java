/*
 * GtkWidget.java
 *
 * Copyright (c) 2006-2007 Operational Dynamics Consulting Pty Ltd and Others
 * 
 * The code in this file, and the library it is a part of, are made available
 * to you by the authors under the terms of the "GNU General Public Licence,
 * version 2" plus the "Classpath Exception" (you may link to this code as a
 * library into other programs provided you don't make a derivation of it).
 * See the LICENCE file for the terms governing usage and redistribution.
 *
 *                      THIS FILE WILL BE GENERATED CODE!
 *
 * To modify its contents or behaviour, either update the generation program,
 * change the information in the source defs file, or implement an override
 * for this class.
 */
package org.gnome.gtk;

import org.gnome.glib.Plumbing;
import org.gnome.glib.Signal;

final class GtkWidget extends Plumbing
{
    private GtkWidget() {}

    static final void show(Widget self) {
        synchronized (lock) {
            gtk_widget_show(pointerOf(self));
        }
    }

    private static native final void gtk_widget_show(long self);

    static final void showAll(Widget self) {
        synchronized (lock) {
            gtk_widget_show_all(pointerOf(self));
        }
    }

    private static native final void gtk_widget_show_all(long self);

    interface DELETE_EVENT extends Signal
    {
        boolean onDeleteEvent(Widget source, Object event);
    }

    static final void connect(Widget self, GtkWidget.DELETE_EVENT handler) {
        connectSignal(self, handler, GtkWidget.class, "delete-event");
    }

    protected static final boolean handleDeleteEvent(Signal handler, long source, long event) {
        return ((GtkWidget.DELETE_EVENT) handler).onDeleteEvent((Widget) objectFor(source), null); // FIXME
    }

    interface ENTER_NOTIFY_EVENT extends Signal
    {
        boolean onEnterNotifyEvent(Widget source, Object event);
    }

    static final void connect(Widget self, GtkWidget.ENTER_NOTIFY_EVENT handler) {
        connectSignal(self, handler, GtkWidget.class, "enter-notify-event");
    }

    protected static final boolean handleEnterNotifyEvent(Signal handler, long source, long event) {
        return ((GtkWidget.ENTER_NOTIFY_EVENT) handler).onEnterNotifyEvent((Widget) objectFor(source),
                null); // FIXME
    }

    interface FOCUS_OUT_EVENT extends Signal
    {
        boolean onFocusOutEvent(Widget source, Object event);
    }

    static final void connect(Widget self, GtkWidget.FOCUS_OUT_EVENT handler) {
        connectSignal(self, handler, GtkWidget.class, "focus-out-event");
    }

    protected static final boolean handleFocusOutEvent(Signal handler, long source, long event) {
        return ((GtkWidget.FOCUS_OUT_EVENT) handler).onFocusOutEvent((Widget) objectFor(source), null); // FIXME
    }

    interface EXPOSE_EVENT extends Signal
    {
        boolean onExposeEvent(Widget source, Object event);
    }

    static final void connect(Widget self, GtkWidget.EXPOSE_EVENT handler) {
        connectSignal(self, handler, GtkWidget.class, "expose-event");
    }

    protected static final boolean handleExposeEvent(Signal handler, long source, long event) {
        return ((GtkWidget.EXPOSE_EVENT) handler).onExposeEvent((Widget) objectFor(source), null); // FIXME
    }
}
