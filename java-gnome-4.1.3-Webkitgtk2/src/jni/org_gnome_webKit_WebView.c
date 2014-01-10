#include <jni.h>
#include <gtk/gtk.h>
#include <glib/gprintf.h>

#include <webkit2/webkit2.h>
#include "bindings_java.h"

JNIEXPORT void JNICALL Java_org_gnome_webKit_WebView_setExtensionsDirectory
  (JNIEnv *env, jclass cls, jstring _directory)
{
  	gchar* directory;
	directory = (gchar*) bindings_java_getString(env, _directory);
	if (directory == NULL) {
		return; // Java Exception already thrown
	}

    g_printf("Extensions Directory:%s\n", directory);

    webkit_web_context_set_web_extensions_directory(webkit_web_context_get_default (), directory);

    bindings_java_releaseString(directory);
}


WebKitWebView*      createWebView                      (WebKitWebView  *web_view,
                                                        gpointer        user_data)
{
  /*   WebKitWebView* newWnd = (WebKitWebView*)user_data;
       return newWnd;
  */
  jlong viewPtr = (long)web_view;
  
  JNIEnv* env = bindings_java_getEnv();
  jclass cls;
  cls = (*env)->FindClass(env, "org/gnome/webKit/WebView");
  if (cls != 0)
    {
      jmethodID mid = mid = (*env)->GetStaticMethodID(env, cls, "JNICreateWebView", "(J)J");
      if(mid !=0)
        {
          // printf("Result of JNICreateWebView: %l\n", view);
          jlong view = (*env)->CallStaticLongMethod(env, cls, mid, viewPtr);
          g_printf("JNICreateWebView method succeded\n");
          return (WebKitWebView*) view;
        }
      else
        {
          g_printf("JNICreateWebView method failed\n");
        }
    }
  else
    {
      puts("Could not find the class");
    }
  return 0;
}


JNIEXPORT void JNICALL Java_org_gnome_webKit_WebView_initNewWindowSignal
(JNIEnv *env, jobject thisObj, jlong thisPtr)
{
  g_printf("Using Webkit version %d.%d.%d\n", webkit_get_major_version(), webkit_get_minor_version(), webkit_get_micro_version());
  g_printf("Connecting new window signal\n");
  WebKitWebView* thisWnd = (WebKitWebView*)thisPtr;
 

  g_signal_connect(G_OBJECT(thisWnd), "create", G_CALLBACK(createWebView), 0);
  g_printf("Connected to create-web-view signal\n");
  fflush(stdout);
}

