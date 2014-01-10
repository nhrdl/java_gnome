/*
 * java-gnome, a UI library for writing GTK and GNOME programs from Java!
 *
 * Copyright © 2010 Operational Dynamics Consulting, Pty Ltd and Others
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
package org.freedesktop.icons;

/**
 * Named icons representing devices.
 * 
 * @author Guillaume Mazoyer
 * @author Andrew Cowie
 * @since 4.0.17
 */
public class DeviceIcon extends Icon
{
    protected DeviceIcon(String name) {
        super(name);
    }

    public static final Icon AC_ADAPTER = new DeviceIcon("ac-adapter");

    public static final Icon AUDIO_CARD = new DeviceIcon("audio-card");

    public static final Icon AUDIO_INPUT_MICROPHONE = new DeviceIcon("audio-input-microphone");

    public static final Icon BATTERY = new DeviceIcon("battery");

    public static final Icon CAMERA_PHOTO = new DeviceIcon("camera-photo");

    public static final Icon CAMERA_VIDEO = new DeviceIcon("camera-video");

    public static final Icon CAMERA_WEB = new DeviceIcon("camera-web");

    public static final Icon COMPUTER = new DeviceIcon("computer");

    public static final Icon DRIVE_HARDDISK = new DeviceIcon("drive-harddisk");

    public static final Icon DRIVE_OPTICAL = new DeviceIcon("drive-optical");

    public static final Icon DRIVE_REMOVABLE_MEDIA = new DeviceIcon("drive-removable-media");

    public static final Icon INPUT_GAMING = new DeviceIcon("input-gaming");

    public static final Icon INPUT_KEYBOARD = new DeviceIcon("input-keyboard");

    public static final Icon INPUT_MOUSE = new DeviceIcon("input-mouse");

    public static final Icon INPUT_TABLET = new DeviceIcon("input-tablet");

    public static final Icon INPUT_TOUCHPAD = new DeviceIcon("input-touchpad");

    public static final Icon MEDIA_FLASH = new DeviceIcon("media-flash");

    public static final Icon MEDIA_FLOPPY = new DeviceIcon("media-floppy");

    public static final Icon MEDIA_OPTICAL = new DeviceIcon("media-optical");

    public static final Icon MEDIA_TAPE = new DeviceIcon("media-tape");

    public static final Icon MODEM = new DeviceIcon("modem");

    public static final Icon MULTIMEDIA_PLAYER = new DeviceIcon("multimedia-player");

    public static final Icon NETWORK_WIRED = new DeviceIcon("network-wired");

    public static final Icon NETWORK_WIRELESS = new DeviceIcon("network-wireless");

    public static final Icon PDA = new DeviceIcon("pda");

    public static final Icon PHONE = new DeviceIcon("phone");

    public static final Icon PRINTER = new DeviceIcon("printer");

    public static final Icon SCANNER = new DeviceIcon("scanner");

    public static final Icon VIDEO_DISPLAY = new DeviceIcon("video-display");
}
