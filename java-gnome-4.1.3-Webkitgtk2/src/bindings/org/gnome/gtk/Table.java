/*
 * java-gnome, a UI library for writing GTK and GNOME programs from Java!
 *
 * Copyright © 2007-2010 Operational Dynamics Consulting, Pty Ltd and Others
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
 * A Container which arranges child Widgets in particular rows and columns.
 * 
 * <p>
 * Table is <b>not</b> a spreadsheet Widget! For that you would need to have
 * (say) a sea of Entry Widgets that were all hooked up to behave the same
 * (notably to pass focus between them appropriately) and which were
 * individually constrained to each be the same size (at least by default),
 * etc. By contrast, Table is for laying out Widgets in a grid but where each
 * child can happily request the size it needs.
 * 
 * <p>
 * To be honest, this Widget is a pain in the ass to use because you have to
 * manually keep track of which <code>row,column</code> edges a Widget is to
 * be constrained by. In most cases you can achieve the same alignment effects
 * with far greater flexibility by using HBoxes nested in VBoxes and
 * controlling the size allocations via {@link SizeGroup}s.
 * 
 * @author Andrew Cowie
 * @author Stefan Prelle
 * @since 4.0.6
 */
/*
 * TODO the documentation in this class still needs a lot of work.
 */
public class Table extends Container
{
    protected Table(long pointer) {
        super(pointer);
    }

    /**
     * Create a new Table. The Container will be configured to lay out
     * <code>n</code> rows of <code>n</code> columns of child Widgets.
     * 
     * @param homogeneous
     *            If <code>true</code>, all cells are sized to that requested
     *            by the largest Widget in the Table.
     * @since 4.0.6
     */
    public Table(int rows, int columns, boolean homogeneous) {
        super(GtkTable.createTable(rows, columns, homogeneous));
    }

    /**
     * Add a child Widget to this Table. This is a convenience method where
     * the more esoteric parameters of the full
     * {@link #attach(Widget, int, int, int, int, AttachOptions, AttachOptions, int, int)
     * attach()} are given appropriate default values.
     * 
     * <p>
     * Each of the parameters refer to the column or row to which the Widget
     * being added will be anchored. To put a Widget at the fourth column from
     * the left, second row down, you would do:
     * 
     * <pre>
     * table.attach(child, 3, 4, 1, 2);
     * </pre>
     * 
     * As alluded to in the class description, this is quite finicky and worse
     * is error prone.
     * 
     * @since 4.0.6
     */
    public void attach(Widget child, int leftAttach, int rightAttach, int topAttach, int bottomAttach) {
        GtkTable.attachDefaults(this, child, leftAttach, rightAttach, topAttach, bottomAttach);
    }

    /**
     * Like {@link #attach(Widget, int, int, int, int) attach()} but has finer
     * layout control for the Widget being added, mostly achieved using the
     * {@link AttachOptions}.
     * 
     * <p>
     * To define that a Widget shall grow on the x-axis, but keep the size on
     * the y-axis you would do:
     * 
     * <pre>
     * table.attach(child, 3, 4, 1, 2, AttachOptions.EXPAND, AttachOptions.SHRINK, 0, 0);
     * </pre>
     * 
     * <p>
     * A common problem is that you have Widgets of different sizes (e.g.
     * labels in a column). If a widget is smaller than the required space
     * additional padding is added to the sides, so finally the smaller Widget
     * is centered compared to the larger Widget. To avoid this you a) need to
     * encapsulate the Widget in an {@link Alignment} Container and b) need to
     * attach it here using <code>AttachOptions.FILL</code>, so that instead
     * of additional space being added to the sides, the
     * <code>Alignment</code> Container may decide how to distribute it.
     * 
     * <p>
     * The following example left-aligns the child Widget within its cell,
     * while it is vertically centered:
     * 
     * <pre>
     * final Alignment aligned;
     * 
     * aligned = new Alignment(Alignment.LEFT, Alignment.CENTER, 1.0f, 1.0f, child);
     * table.attach(aligned, 3, 4, 1, 2, AttachOptions.FILL, AttachOptions.FILL, 0, 0);
     * </pre>
     * 
     * @since 4.0.9
     */
    public void attach(Widget child, int leftAttach, int rightAttach, int topAttach, int bottomAttach,
            AttachOptions xoptions, AttachOptions yoptions, int xpadding, int ypadding) {
        GtkTable.attach(this, child, leftAttach, rightAttach, topAttach, bottomAttach, xoptions,
                yoptions, xpadding, ypadding);
    }

    /**
     * Change the number of rows and columns in the Table.
     * 
     * @since 4.0.6
     */
    public void resize(int rows, int columns) {
        GtkTable.resize(this, rows, columns);
    }

    /**
     * Set the (extra) spacing to be between <code>column</code> and the one
     * adjacent to it.
     * 
     * @since 4.0.6
     */
    public void setColumnSpacing(int column, int spacing) {
        GtkTable.setColSpacing(this, column, spacing);
    }

    /**
     * Set the (extra) spacing to be between <code>row</code> and the one
     * following it.
     * 
     * @since 4.0.6
     */
    public void setRowSpacing(int row, int spacing) {
        GtkTable.setRowSpacing(this, row, spacing);
    }

    /**
     * Set the (extra) spacing between all columns. Overwrites previous
     * settings or those made by the two argument form of
     * {@link #setColumnSpacing(int,int) setColumnSpacing()}.
     * 
     * @since 4.0.8
     */
    public void setColumnSpacing(int spacing) {
        GtkTable.setColSpacings(this, spacing);
    }

    /**
     * Set the (extra) spacing between all rows. Overwrites previous settings
     * or those made by {@link #setRowSpacing(int,int)}.
     * 
     * @since 4.0.8
     */
    public void setRowSpacing(int spacing) {
        GtkTable.setRowSpacings(this, spacing);
    }
}
