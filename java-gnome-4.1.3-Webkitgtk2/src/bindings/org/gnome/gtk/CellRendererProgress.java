/*
 * java-gnome, a UI library for writing GTK and GNOME programs from Java!
 *
 * Copyright © 2007-2011 Operational Dynamics Consulting, Pty Ltd and Others
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
package org.gnome.gtk;

/**
 * Renderer a progress indicator similar to a ProgressBar in a TreeViewColumn.
 * 
 * @author Andrew Cowie
 * @author Serkan Kaba
 * @since 4.0.12
 */
public class CellRendererProgress extends CellRenderer
{
    /**
     * Construct a new CellRendererPixbuf.
     * 
     * @since 4.0.17
     */
    public CellRendererProgress(CellLayout vertical) {
        super(GtkCellRendererProgress.createCellRendererProgress(), vertical, true);
    }

    /**
     * Indicate the DataColumn containing the plain text to render on the
     * progress indicator. See ProgressBar's
     * {@link ProgressBar#setText(String) setText()}.
     * 
     * @since 4.0.12
     */
    public void setText(DataColumnString column) {
        GtkCellLayout.addAttribute(vertical, this, "text", column.getOrdinal());
    }

    /**
     * Indicate the DataColumn containing the percentage complete to show in
     * the indicator.
     * 
     * <p>
     * Percentage complete is expressed in the range of <code>0</code> to
     * <code>100</code>.
     * 
     * <p>
     * <i>Note that for some reason this was not implemented in GTK like
     * ProgressBar's <var>fraction</var> property, where percentage complete
     * is expressed as a double between <code>0.0</code> and <code>1.0</code>
     * !</i>
     * 
     * @since 4.0.12
     */
    public void setValue(DataColumnInteger column) {
        GtkCellLayout.addAttribute(vertical, this, "value", column.getOrdinal());
    }
}
