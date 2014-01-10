#!/bin/bash
mkdir -p src/main/resources
mkdir -p resources
make
cp tmp/*.so resources/.
cp tmp/bindings/*.properties src/main/resources/.
mvn package install 
#cp tmp/gtk-4.1.jar ~/.m2/repository/org/gnome/gtk/4.1/.
#cp tmp/libgtkjni-4.1.3-dev.so ~/.m2/repository/org/gnome/gtk/4.1/.

