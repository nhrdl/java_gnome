Java-gnome with WebkitGtk2
=========================

If your distribution has WebkitGtk2 installed at standard locations, you don't have to do anything else. Just run configure and proceed with make command. Your build will be ready.

On my distribution (Ubuntu 12.04) I had installed in separate directory as it needs many other libraries which are not part of standard distribution.

For compilation of java-gnome you will have to set following enviornment variable.
PKG_CONFIG_PATH

For running the application you will have to set following variables
LD_LIBRARY_PATH
WEBKIT_INJECTED_BUNDLE_PATH
WEBKIT_EXEC_PATH

Assuming that you have installed your webkitgtk2 libraries under /usr/share/webkit2, above environment variable look like following on my system

PKG_CONFIG_PATH=/usr/share/webkit2/lib/pkgconfig
LD_LIBRARY_PATH=/usr/share/webkit2/lib
WEBKIT_EXEC_PATH=/usr/share/webkit2/libexec
WEBKIT_INJECTED_BUNDLE_PATH=/usr/share/webkit2/lib/webkit2gtk-3.0/injected-bundle

There is a sample application Browser in the code. It accepts a url as a command line argument and displays browser window. Its capable of displaying web inspector as well as adding tabs.

