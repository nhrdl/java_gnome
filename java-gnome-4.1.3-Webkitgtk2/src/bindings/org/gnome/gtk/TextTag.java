/*
 * java-gnome, a UI library for writing GTK and GNOME programs from Java!
 *
 * Copyright © 2007-2011 Operational Dynamics Consulting, Pty Ltd
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

import java.lang.reflect.Field;

import org.gnome.glib.Object;
import org.gnome.pango.FontDescription;
import org.gnome.pango.Scale;
import org.gnome.pango.Style;
import org.gnome.pango.Underline;
import org.gnome.pango.Weight;

import static org.gnome.gtk.TextBuffer.getDefaultTable;

/**
 * TextTags are used to apply markup and formatting for regions of text in a
 * TextBuffer.
 * 
 * <p>
 * All TextTags belong to a TextTagTable, and likewise all TextBuffers are
 * constructed by specifying the TextTagTable that it will draw tags from.
 * That said, if you don't mind sharing your TextTags between all TextBuffers
 * in your application, then you can use the no-arg convenience constructors
 * here and in TextBuffer. We will in all our examples.
 * 
 * <p>
 * You can create a new and unique TextTag every time you go to apply
 * formatting, but in general you'll want to reuse them and that will be more
 * efficient. Given:
 * 
 * <pre>
 * TextTag bold;
 * TextBuffer buffer;
 * TextIter start, end, pointer;
 * ...
 * </pre>
 * 
 * and assuming the TextBuffer was created with the no-arg constructor, create
 * a TextTag and apply some formatting:
 * 
 * <pre>
 * bold = new TextTag();
 * bold.setWeight(Weight.BOLD);
 * ...
 * </pre>
 * 
 * As you will see, there are any number of properties and font
 * characteristics that can be applied with a tag. See the setter methods on
 * this class for all the current possibilities.
 * 
 * <p>
 * Now, to make use of the tag, you'll call TextBuffer's
 * {@link TextBuffer#applyTag(TextTag, TextIter, TextIter) applyTag()}. It
 * needs a pair of TextIters to delineate the range you want to apply the
 * TextTag to. You could, for example, react to the currently selected region:
 * 
 * <pre>
 * start = buffer.getSelectionBound().getIter();
 * end = buffer.getInsert().getIter();
 * </pre>
 * 
 * And now apply your tag:
 * 
 * <pre>
 * buffer.applyTag(bold, start, end);
 * </pre>
 * 
 * As an alternative, you can apply a TextTag when
 * {@link TextBuffer#insert(TextIter, String, TextTag) insert()}ing text:
 * 
 * <pre>
 * buffer.insert(pointer, &quot;Hello World&quot;, bold);
 * </pre>
 * 
 * Either way, going forward, you've now got <code>bold</code> which you can
 * apply on other regions of your TextBuffer.
 * 
 * <p>
 * Finally, if you want to know what TextTags are applying at a given spot in
 * a TextBuffer, then get a TextIter pointing there and use its
 * {@link TextIter#getTags() getTags()} method.
 * 
 * <p>
 * <i>All TextTags created in java-gnome are "anonymous"; the underlying
 * library has a notion of named tags but we have no need of this and have not
 * exposed it. In order to reuse a TextTag later just keep a reference to
 * it.</i>
 * 
 * @author Andrew Cowie
 * @since 4.0.9
 */
/*
 * This class is interesting and unusual in that there are no direct setter
 * functions; all the various properties are only exposed through the GObject
 * GValue property setting mechanism.
 */
public class TextTag extends Object
{
    /**
     * An internal reference to the TextTagTable that this TextTag was
     * constructed with. This is used for validation by TextBuffer's
     * checkTag() to protect against misuse of our no-arg conveniences.
     */
    final TextTagTable table;

    protected TextTag(long pointer) {
        super(pointer);
        /*
         * FIXME Does this ever actually get hit? If so, we're in trouble; how
         * can we find out what table it is actually in? Probably means
         * changing the logic in checkTag().
         */
        this.table = null;
    }

    /**
     * Create a new TextTag and place it in the default TextTagTable. This
     * will be usable by a TextBuffer created with the
     * {@link TextBuffer#TextBuffer() no-arg} constructor.
     * 
     * @since 4.0.9
     */
    public TextTag() {
        super(GtkTextTag.createTextTag(null));
        this.table = getDefaultTable();
        GtkTextTagTable.add(table, this);
    }

    /**
     * Create a new TextTag and place it in the default TextTagTable. The
     * supplied <code>name</code> has no particular effect but can be helpful
     * for debugging. Otherwise just use TextTag {@link TextTag#TextTag()
     * &lt;init&gt;()}.
     * 
     * @since 4.1.1
     */
    public TextTag(String name) {
        super(GtkTextTag.createTextTag(name));
        this.table = getDefaultTable();
        GtkTextTagTable.add(table, this);
    }

    /**
     * Create a new TextTag. You pass the TextTagTable that will enclose this
     * TextTag as the argument to the constructor.
     * 
     * <p>
     * <i>In native GTK you have to add TextTags to TextTagTables; we do this
     * for you automatically.</i>
     * 
     * @since 4.0.9
     */
    public TextTag(TextTagTable table) {
        super(GtkTextTag.createTextTag(null));
        this.table = table;
        GtkTextTagTable.add(table, this);
    }

    /**
     * @since 4.1.1
     */
    public TextTag(TextTagTable table, String name) {
        super(GtkTextTag.createTextTag(name));
        this.table = table;
        GtkTextTagTable.add(table, this);
    }

    /**
     * Specify that you want the text scaled up or scaled down from the
     * otherwise extant font size. The default is
     * {@link org.gnome.pango.Scale#NORMAL NORMAL} (that is, a scaling factor
     * of <code>1.0</code> which thereby has no effect).
     * 
     * @since 4.0.9
     */
    /*
     * Be aware in passing that this obscures the Scale in org.gnome.gtk
     */
    public void setScale(Scale scale) {
        setPropertyDouble("scale", GtkTextTagOverride.valueOf(scale));
    }

    /**
     * Specify the amount by which this paragraph is to be indented, in
     * pixels. Interestingly, this <i>can</i> be negative, in which case you
     * get a hanging indent. The default is <code>0</code>.
     * 
     * @since 4.0.9
     */
    public void setIndent(int pixels) {
        setPropertyInteger("indent", pixels);
    }

    /**
     * Specify the left margin, in pixels. The default is <code>0</code>.
     * 
     * @since 4.1.1
     */
    public void setMarginLeft(int pixels) {
        if (pixels < 0) {
            throw new IllegalArgumentException("Margin property must be positive");
        }
        setPropertyInteger("left-margin", pixels);
    }

    /**
     * Specify the right margin, in pixels. The default is <code>0</code>.
     * 
     * @since 4.1.1
     */
    public void setMarginRight(int pixels) {
        if (pixels < 0) {
            throw new IllegalArgumentException("Margin property must be positive");
        }
        setPropertyInteger("right-margin", pixels);
    }

    /**
     * Specify the font weight. The useful one is
     * {@link org.gnome.pango.Weight#BOLD BOLD}; the default is
     * {@link org.gnome.pango.Weight#NORMAL NORMAL}.
     * 
     * @since 4.0.9
     */
    public void setWeight(Weight weight) {
        setPropertyInteger("weight", GtkTextTagOverride.valueOf(weight));
    }

    /**
     * Specify the underling mode to be used for this text. Single underlining
     * is {@link org.gnome.pango.Underline#SINGLE SINGLE}.
     * {@link org.gnome.pango.Underline#NONE NONE} is the default, obviously.
     * 
     * @since 4.0.9
     */
    public void setUnderline(Underline underline) {
        setPropertyEnum("underline", underline);
    }

    /**
     * Specify that this text be rendered struck through.
     * 
     * @since 4.0.9
     */
    public void setStrikethrough(boolean setting) {
        setPropertyBoolean("strikethrough", setting);
    }

    /**
     * Specify the background colour via a String description.
     * 
     * <p>
     * See {@link #setForeground(String) setForeground()} for discussion of
     * allowable colour names.
     * 
     * <p>
     * The default is no explicit setting.
     * 
     * @since 4.0.9
     */
    public void setBackground(String color) {
        setPropertyString("background", color);
    }

    /**
     * Specify the background colour to be used by the [rectangular] space
     * behind the current paragraph as a whole? Contrast to
     * {@link #setBackground(String) setBackground()} which sets the
     * background colour of of just the text itself.
     * 
     * @since 4.1.1
     */
    public void setParagraphBackground(String color) {
        setPropertyString("paragraph-background", color);
    }

    /**
     * Specify the foreground colour by name.
     * 
     * <p>
     * Colours can be specified either:
     * 
     * <ul>
     * <li>as hex, in the form <code>"#<i>rrggbb</i>"</code> where
     * <code><i>rr</i></code>, <code><i>gg</i></code>, and
     * <code><i>bb</i></code> are two hexadecimal characters expressing a
     * values between <code>0x00</code> and <code>0xFF</code> for red, green,
     * and blue respectively; or
     * <li>as a symbolic name, such as <code>"blue"</code> and
     * <code>"medium sea green"</code>, depending on what constants have been
     * built into your X server. You can likely see a list at
     * <code>/usr/share/X11/rgb.txt</code>. Obviously these are unreliable
     * between different systems, but they are undeniably easy to use.
     * </ul>
     * 
     * <p>
     * The default is no explicit setting.
     * 
     * @since 4.0.9
     */
    public void setForeground(String colour) {
        setPropertyString("foreground", colour);
    }

    /**
     * Set whether the region of text covered by this TextTag is editable by
     * the user.
     * 
     * @since 4.0.9
     */
    /*
     * FIXME The default is true what happens if a TextView is
     * setEditable(false)? Needs a test case.
     */
    public void setEditable(boolean setting) {
        setPropertyBoolean("editable", setting);
    }

    /**
     * Specify the font <i>style</i> to be used (
     * {@link org.gnome.pango.Style#NORMAL NORMAL},
     * {@link org.gnome.pango.Style#OBLIQUE OBLIQUE} and
     * {@link org.gnome.pango.Style#ITALIC ITALIC}s).
     * 
     * @since 4.0.9
     */
    public void setStyle(Style style) {
        setPropertyInteger("style", GtkTextTagOverride.valueOf(style));
    }

    /**
     * Specify the font family to be used. This is a family name like
     * "Bitstream Vera" or "DejaVu" or "Liberation".
     * 
     * <p>
     * In general, it is better to use the standard aliases "Serif", "Sans",
     * and "Monospaced" than naming a family by hand as this lets the user
     * assign their own meanings to those terms via the Fonts tab in <b>
     * <code>gnome-appearance-properties</code></b>.
     * 
     * <p>
     * Note that you need to specify this early; if you set this after setting
     * other propertes on the TextTag, it may reset them.
     * 
     * @since 4.0.10
     */
    public void setFamily(String font) {
        setPropertyString("font", font);
    }

    /**
     * Hide the text formatted with this TextTag.
     * 
     * <p>
     * FIXME what happens when you insert at a point that is marked invisible?
     * Backspace into it? What is the interaction with the <var>editable</var>
     * property and <code>insertInteractive()</code>?
     * 
     * <p>
     * <i>GTK further notes there are problems with invisible text and
     * programmatic navigation of TextBuffers.</i>
     * 
     * @since <span style="color: red">Unstable</span>
     */
    /*
     * FIXME The signature is correct, but the implications for the developer
     * of employing this are not, and that needs fixing. We've exposed it so
     * that people can play with it and maybe infer some of the answers to
     * these questions.
     */
    public void setInvisible(boolean setting) {
        setPropertyBoolean("invisible", setting);
    }

    public String toString() {
        final String name;
        final StringBuilder str;
        final Style style;
        final Weight weight;

        str = new StringBuilder(super.toString());

        name = getPropertyString("name");
        if ((name != null) && (name.length() > 0)) {
            str.append(' ');
            str.append('\"');
            str.append(name);
            str.append('\"');
        }

        if (getPropertyBoolean("style-set")) {
            style = (Style) getPropertyEnum("style");
            if (style != Style.NORMAL) {
                str.append("\n\tstyle: " + style);
            }
        }
        if (getPropertyBoolean("underline-set")) {
            str.append("\n\tunderline: " + getPropertyEnum("underline"));
        }
        /*
         * weight always seems to be set. What's up with that?
         */
        if (getPropertyBoolean("weight-set")) {
            weight = GtkTextTagOverride.weightFor(getPropertyInteger("weight"));
            if (weight != Weight.NORMAL) {
                str.append("\n\tweight: " + weight);
            }
        }

        if (getPropertyBoolean("pixels-above-lines-set")) {
            str.append("\n\tpadding above paragraph: " + getPropertyInteger("pixels-above-lines"));
        }
        if (getPropertyBoolean("pixels-below-lines-set")) {
            str.append("\n\tpadding below paragraph: " + getPropertyInteger("pixels-below-lines"));
        }
        if (getPropertyBoolean("left-margin-set")) {
            str.append("\n\tmargin left:  " + getPropertyInteger("left-margin"));
        }
        if (getPropertyBoolean("right-margin-set")) {
            str.append("\n\tmargin right: " + getPropertyInteger("right-margin"));
        }

        return str.toString();
    }

    /**
     * Set the font size, in points.
     * 
     * @since 4.0.10
     */
    /*
     * Using "size-points" instead of "size" allowed us to keep Pango.SCALE
     * default instead of public. There is no huge imperative to keep it that
     * way.
     */
    public void setSize(double size) {
        setPropertyDouble("size-points", size);
    }

    /**
     * Pass a FontDescription specifying the metrics and characteristics of
     * the font you wish to be active when this TextTag is applied.
     * 
     * @since 4.0.10
     */
    public void setFontDescription(FontDescription desc) {
        setPropertyBoxed("font-desc", desc);
    }

    /**
     * Pass a string that describes the font you wish to use. This is
     * essentially a convenience wrapper around creating a FontDescription
     * with FontDescription's {@link FontDescription#FontDescription(String)
     * &lt;init&gt;(String)} constructor; see there for details of the syntax
     * allowed.
     * 
     * @since 4.0.10
     */
    public void setFont(String str) {
        setPropertyString("font", str);
    }

    /*
     * This is allows us to keep the Pango.SCALE constant restricted
     * visibility while still having the actual value only in one place.
     */

    private static final double SCALE;

    static {
        final Class<?> cls;
        final Field field;

        try {
            cls = Class.forName("org.gnome.pango.Pango");

            field = cls.getDeclaredField("SCALE");
            field.setAccessible(true);

            SCALE = field.getDouble(cls);
        } catch (Exception e) {
            throw new Error(e);
        }
    }

    /**
     * Indicate that a span of characters is to be positioned at other than
     * the baseline. This is typically used to create superscripts and
     * subscripts, although you want to be careful because you are likely also
     * changing font sizes when doing so.
     * 
     * <p>
     * The measurement is in points. A negative number will take you below the
     * baseline.
     * 
     * <p>
     * Be aware that whenever non-uniform sizing is used on a line, the
     * TextView will render that line as higher than the other lines in a
     * document. This can often be an unwanted (but hard to trivially avoid)
     * side-effect.
     * 
     * <p>
     * See also {@link org.gnome.pango.RiseAttribute RiseAttribute} which is
     * the underlying mechanism which powers this in Pango.
     * 
     * @since 4.0.14
     */
    public void setRise(double rise) {
        setPropertyDouble("rise", (int) (rise * SCALE));
    }

    /**
     * Set the padding that will be put below each paragraph of text. See
     * TextView's {@link TextView#setPaddingBelowParagraph(int)
     * setPaddingBelowParagraph()}.
     * 
     * @since 4.1.1
     */
    public void setPaddingBelowParagraph(int pixels) {
        setPropertyInteger("pixels-below-lines", pixels);
    }

    /**
     * Set the padding that will be put above each paragraph of text. See
     * TextView's {@link TextView#setPaddingAboveParagraph(int)
     * setPaddingAboveParagraph()}.
     * 
     * @since 4.1.1
     */
    public void setPaddingAboveParagraph(int pixels) {
        setPropertyInteger("pixels-above-lines", pixels);
    }

    /**
     * Set the padding that will be put between each line in a paragraph if
     * wrapping is turned on. See TextView's
     * {@link TextView#setPaddingInsideParagraph(int)
     * setPaddingInsideParagraph()}.
     * 
     * @since 4.1.1
     */
    public void setPaddingInsideParagraph(int pixels) {
        setPropertyInteger("pixels-inside-wrap", pixels);
    }

    /**
     * Set the wrapping to be applied within this section of text.
     * 
     * @since 4.1.1
     */
    public void setWrapMode(WrapMode mode) {
        setPropertyEnum("wrap-mode", mode);
    }

    /**
     * Does the background colouring specified by
     * {@link #setBackground(String) setBackground()} fills the entire line
     * height or only the height of the tagged characters.
     * 
     * @since 4.1.1
     */
    public void setBackgroundFullHeight(boolean setting) {
        super.setPropertyBoolean("background-full-height", setting);
    }

    /**
     * Adopt the given justification for a given passage of text.
     * 
     * @since 4.1.1
     */
    /*
     * As with TextView, match Label's setJustify() name.
     */
    public void setJustify(Justification setting) {
        super.setPropertyEnum("justification", setting);
    }
}
