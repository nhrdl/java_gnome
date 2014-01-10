/*
 * java-gnome, a UI library for writing GTK and GNOME programs from Java!
 *
 * Copyright © 2006-2010 Operational Dynamics Consulting, Pty Ltd and Others
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

import org.gnome.pango.EllipsizeMode;

/**
 * A Widget that displays a small amount of text.
 * 
 * <p>
 * Labels are the backbone of any Window. They are frequently used to identify
 * other controls with names, as headings in Windows, and are the building
 * blocks that Menus and Buttons are made up of. All the difficult parts about
 * rendering text are taken care of here, such as text direction, fonts. And,
 * of course, you can enable them to allow their text to be copied.
 * 
 * <p>
 * Labels can display normal text or text that has been formatted with Pango
 * markup. FIXME with a reference to our Pango guide page.
 * 
 * <p>
 * Although you can pack multiple lines into a Label, there does come a point
 * when the amount of text you're trying to show gets out of hand. At that
 * point you might want to investigate the {@link TextView TextView} Widget.
 * 
 * @author Andrew Cowie
 * @author Srichand Pendyala
 * @author Wouter Bolsterlee
 * @author Guillaume Mazoyer
 * @since 4.0.1
 */
public class Label extends Misc
{
    protected Label(long pointer) {
        super(pointer);
    }

    /**
     * Create a Label with the specified text. This Label will be an ordinary
     * one and will interpret the argument as plain unformatted text. Note
     * that if you use this constructor you can later switch the Label to
     * interpreting the text as Pango markup by calling
     * {@link #setUseMarkup(boolean) setUseMarkup(true)}.
     * 
     * @param text
     *            the text you wish on the Label.
     * @since 4.0.1
     */
    public Label(String text) {
        super(GtkLabel.createLabel(text));
    }

    /**
     * Create an empty Label. You'll need to call {@link #setLabel(String)
     * setLabel()} to place some text it.
     * 
     * @since 4.0.11
     */
    public Label() {
        super(GtkLabel.createLabel(null));
    }

    /**
     * Set the text showing in the Label.
     * 
     * 
     * If the Label has been told to interpret Pango markup with
     * {@link #setUseMarkup(boolean) setUseMarkup(true)}, then any markup
     * included in text will be interpreted as such.
     * 
     * <p>
     * <b>WARNING</b>:<br>
     * If you have enabled <var>use-markup</var> (as is often the case),
     * beware that you must escape whatever you to this method (like you would
     * for feeding user data to any other XML or HTML like target). This
     * specifically means you need to convert <code>&amp;</code> into
     * <code>&amp;amp;</code> and likewise for angle brackets. Use
     * {@link org.gnome.glib.Glib#markupEscapeText(String)
     * Glib.markupEscapeText()}.
     * 
     * @since 4.0.1
     */
    public void setLabel(String text) {
        GtkLabel.setLabel(this, text);
    }

    /**
     * Get the text showing in the Label, including any characters which
     * indicate Pango markup syntax and embedded mnemonic underline characters
     * that may be present. Contrast with {@link #getText() getText()} which
     * returns the text unadorned.
     * 
     * @since 4.0.1
     */
    public String getLabel() {
        return GtkLabel.getLabel(this);
    }

    /**
     * Get the text showing in the Label, but with any Pango markup stripped
     * away. This is useful if you've applied some fancy formatting but just
     * want to find out the actual words that appear to the user. It also
     * strips away any embedded underlines indicating mnemonics. If you need
     * the raw text including markup, then you want {@link #getLabel()
     * getLabel()}.
     * 
     * @since 4.0.1
     */
    public String getText() {
        return GtkLabel.getText(this);
    }

    /**
     * Set whether the text showing in the Label is to be parsed as containing
     * markup in Pango's text markup language. Using this allows Labels to be
     * created with expressive formatting considerably more advanced than a
     * simple line of text.
     * 
     * @param setting
     *            If setting is true, then any markup included in the text is
     *            interpreted as such. If its set to false, markup is ignored
     *            and included as-is.
     * @since 4.0.1
     */
    public void setUseMarkup(boolean setting) {
        GtkLabel.setUseMarkup(this, setting);
    }

    /**
     * Get the current setting indicating whether the the label text is to be
     * interpreted as marked up with Pango's text markup language. When
     * enabled, the label can show formatted text instead of just a simple
     * line of text.
     * 
     * @since 4.0.4
     */
    public boolean getUseMarkup() {
        return GtkLabel.getUseMarkup(this);
    }

    /**
     * Set the {@link EllipsizeMode ellipsization mode} to use to make the
     * text fits the label width.
     * 
     * @since 4.0.13
     */
    public void setEllipsize(EllipsizeMode setting) {
        GtkLabel.setEllipsize(this, setting);
    }

    /**
     * Get the current ellipsization used.
     * 
     * @since 4.0.13
     */
    public EllipsizeMode getEllipsizeMode() {
        return GtkLabel.getEllipsize(this);
    }

    /**
     * Sets the angle of rotation for the Label. The angle is measured in
     * degrees from the horizontal, going counter-clockwise. An angle of
     * 90&#176; reads from bottom to top, an angle of 270&#176; from top to
     * bottom. The angle setting for the Label will be ignored if the Label is
     * selectable, wrapped, or ellipsized.
     * 
     * @param angle
     *            The angle that the baseline of the Label's text makes with
     *            the horizontal. The valid range (as you'd expect) is from
     *            0&#176; through 360&#176;.
     * 
     * @since 4.0.1
     */
    public void setAngle(double angle) {
        GtkLabel.setAngle(this, angle);
    }

    /**
     * Get the current angle of the Label. An angle of 90&#176; means the text
     * reads in an upwards direction (ie from bottom to top), whereas an angle
     * of 270&#176; means the text reads in a downwards direction (ie from top
     * to bottom).
     * 
     * @since 4.0.1
     */
    public double getAngle() {
        return GtkLabel.getAngle(this);
    }

    /**
     * Gets the justification of the text within the Label.
     * 
     * @since 4.0.4
     */
    public Justification getJustify() {
        return GtkLabel.getJustify(this);
    }

    /**
     * Sets the justification of the text within the Label. The default is
     * {@link Justification#LEFT LEFT}. Note that this has no effect on Labels
     * only containing a single line of text.
     * 
     * <p>
     * If you're trying to control the positioning of the Label within its
     * parent, see Misc's {@link Misc#setAlignment(float,float)
     * setAlignment()}.
     * 
     * @since 4.0.4
     */
    /*
     * TODO Advise developer to setLineWrap(true)?
     */
    public void setJustify(Justification setting) {
        GtkLabel.setJustify(this, setting);
    }

    /**
     * Explicitly set the width of the Label, in characters.
     * 
     * <p>
     * This sets the <var>width-chars</var> property. Note that if set, this
     * will take precedence over the <var>max-width-chars</var> property as
     * set by {@link #setMaxWidthChars(int) setMaxWidthChars()}.
     * 
     * <p>
     * This is not precisely reliable as a way to enforce sizing across
     * different Labels, since the character sizes could be different owing to
     * differing languages or fonts that may be in use. Still, this is
     * superior to trying to manually control Widget size by specifying the
     * horizontal dimension in pixels. If you need a series of Widgets (be
     * they Labels or otherwise) to have the same size, apply a
     * {@link SizeGroup SizeGroup}.
     * 
     * @param width
     *            The width to base the size of the Label on, in characters. A
     *            value of <code>-1</code> will turn off the override, and
     *            return the Label to automatically sizing based on the
     *            content within and the <var>max-width</var> property, if
     *            activated.
     * @since 4.0.4
     */
    public void setWidthChars(int width) {
        GtkLabel.setWidthChars(this, width);
    }

    /**
     * Set a maximum width for the Label, in characters. This will allow the
     * Label to dynamically size up to a maximum of <code>width</code> but not
     * to expand beyond that point. This is useful in conjunction with turning
     * {@link Label#setEllipsize(org.gnome.pango.EllipsizeMode)
     * setEllipsize()} on.
     * 
     * <p>
     * This sets the <var>max-width-chars</var> property.
     * 
     * <p>
     * <b>Warning</b>: If a value greater than <code>-1</code> has been
     * explicitly set as the width using {@link #setWidthChars(int)
     * setWidthChars()}, setting this property will have no effect.
     * 
     * @param width
     *            The width you wish to truncate the Label at, in characters.
     *            A value of <code>-1</code> to remove the override and return
     *            the Label to automatic sizing.
     * @since 4.0.4
     */
    public void setMaxWidthChars(int width) {
        GtkLabel.setMaxWidthChars(this, width);
    }

    /**
     * Select a region of the text in this Label. The characters between
     * <code>start</code> up to <i>but not including</i> <code>end</code> will
     * be selected. This assumes that the Label has been made selectable with
     * {@link #setSelectable(boolean) setSelectable(true)}.
     * 
     * @param end
     *            If negative, then the selection will be from
     *            <code>start</code> to the end of the text in the Label.
     * @since 4.0.6
     */
    /*
     * Description cloned from Editable
     */
    public void selectRegion(int start, int end) {
        GtkLabel.selectRegion(this, start, end);
    }

    /**
     * Whether the text in this Label can be selected by the user.
     * 
     * @since 4.0.6
     */
    public void setSelectable(boolean setting) {
        GtkLabel.setSelectable(this, setting);
    }

    /**
     * Set whether this Label will attempt to wrap the text provided. This
     * will always work, but not necessarily as you might expect. The nature
     * of the size-request/size-allocate process is such that the Label cannot
     * make it's requisition based on the parent's size because the parent's
     * size will depend on the child's request. To enforce wrapping at a
     * specific width, simply enforce the width of the Label itself with
     * {@link Widget#setSizeRequest(int, int) setSizeRequest()}.
     * 
     * <p>
     * The default is <code>false</code>.
     * 
     * @since 4.0.6
     */
    public void setLineWrap(boolean setting) {
        GtkLabel.setLineWrap(this, setting);

    }

    /**
     * Set whether underscores will be interpreted as signifying that the next
     * character should be drawn with an underline, thereby creating the
     * visual effect of a mnemonic.
     * 
     * For example, with this set to <code>true</code>, text of the form
     * <code>&quot;Op_en a copy&quot;</code> will result in
     * <blockquote>Op<u>e</u>n a copy</blockquote>
     * 
     * <p>
     * The default is <code>false</code>.
     * 
     * @since 4.0.11
     */
    public void setUseUnderline(boolean setting) {
        GtkLabel.setUseUnderline(this, setting);
    }
}
