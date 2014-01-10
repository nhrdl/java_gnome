/*
 * java-gnome, a UI library for writing GTK and GNOME programs from Java!
 *
 * Copyright © 2012-2013 Operational Dynamics Consulting, Pty Ltd and Others
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
package org.gnome.glib;

import org.freedesktop.bindings.Constant;

/**
 * Flags to modify the format of the string returned by
 * {@link Glib#formatSize(long, FormatSizeFlags) formatSize()} method.
 * 
 * @author Guillaume Mazoyer
 * @since 4.1.3
 */
public class FormatSizeFlags extends Constant
{
    protected FormatSizeFlags(int ordinal, String nickname) {
        super(ordinal, nickname);
    }

    /**
     * Behave the same as {@link Glib#formatSize(long) formatSize()}.
     */
    public static final FormatSizeFlags DEFAULT = new FormatSizeFlags(GlibFormatSizeFlags.DEFAULT,
            "DEFAULT");

    /**
     * Include the exact number of bytes as part of the returned string. For
     * example, "45.6 kB (45,612 bytes)".
     */
    public static final FormatSizeFlags LONG_FORMAT = new FormatSizeFlags(
            GlibFormatSizeFlags.LONG_FORMAT, "LONG_FORMAT");

    /**
     * Use IEC (base 1024) units with "KiB"-style suffixes. IEC units should
     * only be used for reporting things with a strong "power of 2" basis,
     * like RAM sizes. Network and storage sizes should be reported in the
     * normal SI units.
     */
    public static final FormatSizeFlags IEC_UNITS = new FormatSizeFlags(GlibFormatSizeFlags.IEC_UNITS,
            "IEC_UNITS");
}
