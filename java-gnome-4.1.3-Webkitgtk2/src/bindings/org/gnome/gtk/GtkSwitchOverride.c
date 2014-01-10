/*
 * java-gnome, a UI library for writing GTK and GNOME programs from Java!
 *
 * Copyright © 2011 Operational Dynamics Consulting, Pty Ltd and Others
 *
 * The code in this file, and the program it is a part of, is made available
 * to you by its authors as open source software: you can redistribute it
 * and/or modify it under the terms of the GNU General Public License version
 * 2 ("GPL") as published by the Free Software Foundation.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE. See the GPL for more details.
 *
 * You should have received a copy of the GPL along with this program. If not,
 * see http://www.gnu.org/licenses/. The authors of this program may be
 * contacted through http://java-gnome.sourceforge.net/.
 *
 * Linking this library statically or dynamically with other modules is making
 * a combined work based on this library. Thus, the terms and conditions of
 * the GPL cover the whole combination. As a special exception (the
 * "Classpath Exception"), the copyright holders of this library give you
 * permission to link this library with independent modules to produce an
 * executable, regardless of the license terms of these independent modules,
 * and to copy and distribute the resulting executable under terms of your
 * choice, provided that you also meet, for each linked independent module,
 * the terms and conditions of the license of that module. An independent
 * module is a module which is not derived from or based on this library. If
 * you modify this library, you may extend the Classpath Exception to your
 * version of the library, but you are not obligated to do so. If you do not
 * wish to do so, delete this exception statement from your version.
 */

#include <jni.h>
#include <gtk/gtk.h>
#include "bindings_java.h"
#include "org_gnome_gtk_GtkSwitchOverride.h"

static guint signalID = 0;
static GtkSwitch* source;

static void
emit_activated
(
	GObject *obj,
	GParamSpec *pspec,
	gpointer *data
)
{
	g_signal_emit_by_name(source, "notify-activated", NULL);
}

/**
 * called from
 *   org.gnome.gtk.GtkSwitchOverride.setActivateSignal()
 */
JNIEXPORT void JNICALL
Java_org_gnome_gtk_GtkSwitchOverride_gtk_1switch_1set_1activated_1signal
(
	JNIEnv* env,
	jclass cls,
	jlong _self
)
{
	// convert parameter self
	source = (GtkSwitch*) _self;

	if (signalID == 0) {
		signalID = g_signal_new("notify-activated",
					GTK_TYPE_SWITCH,
					G_SIGNAL_ACTION,
					0,
					NULL,
					NULL,
					NULL,
					G_TYPE_NONE,
					0,
					NULL);
	}

	// call function
	g_signal_connect_object(source, "notify::active",
			G_CALLBACK(emit_activated), NULL, G_CONNECT_AFTER);
}
