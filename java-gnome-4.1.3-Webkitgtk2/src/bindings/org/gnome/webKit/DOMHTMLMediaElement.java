package org.gnome.webKit;

import org.gnome.glib.GlibException;

public class DOMHTMLMediaElement extends DOMHTMLElement
{

    protected DOMHTMLMediaElement(long pointer) {
        super(pointer);
    }

    public String canPlayType(String arg1) {
        return WebKitDOMHTMLMediaElement.canPlayType(this, arg1);
    }

    public boolean getWebkitPreservesPitch() {
        return WebKitDOMHTMLMediaElement.getWebkitPreservesPitch(this);
    }

    public long getWebkitVideoDecodedByteCount() {
        return WebKitDOMHTMLMediaElement.getWebkitVideoDecodedByteCount(this);
    }

    public void pause() {
        WebKitDOMHTMLMediaElement.pause(this);
    }

    public void setAutoplay(boolean arg1) {
        WebKitDOMHTMLMediaElement.setAutoplay(this, arg1);
    }

    public void setControls(boolean arg1) {
        WebKitDOMHTMLMediaElement.setControls(this, arg1);
    }

    public void setCurrentTime(float arg1) throws GlibException {
        WebKitDOMHTMLMediaElement.setCurrentTime(this, arg1);
    }

    public void setDefaultMuted(boolean arg1) {
        WebKitDOMHTMLMediaElement.setDefaultMuted(this, arg1);
    }

    public void setDefaultPlaybackRate(float arg1) {
        WebKitDOMHTMLMediaElement.setDefaultPlaybackRate(this, arg1);
    }

    public void setMediaGroup(String arg1) {
        WebKitDOMHTMLMediaElement.setMediaGroup(this, arg1);
    }

    public void setMuted(boolean arg1) {
        WebKitDOMHTMLMediaElement.setMuted(this, arg1);
    }

    public void setPlaybackRate(float arg1) {
        WebKitDOMHTMLMediaElement.setPlaybackRate(this, arg1);
    }

    public void setPreload(String arg1) {
        WebKitDOMHTMLMediaElement.setPreload(this, arg1);
    }

    public void setVolume(float arg1) throws GlibException {
        WebKitDOMHTMLMediaElement.setVolume(this, arg1);
    }

    public void setWebkitClosedCaptionsVisible(boolean arg1) {
        WebKitDOMHTMLMediaElement.setWebkitClosedCaptionsVisible(this, arg1);
    }

    public void setWebkitPreservesPitch(boolean arg1) {
        WebKitDOMHTMLMediaElement.setWebkitPreservesPitch(this, arg1);
    }

    public float getDefaultPlaybackRate() {
        return WebKitDOMHTMLMediaElement.getDefaultPlaybackRate(this);
    }

    public float getPlaybackRate() {
        return WebKitDOMHTMLMediaElement.getPlaybackRate(this);
    }

    public DOMTimeRanges getPlayed() {
        return WebKitDOMHTMLMediaElement.getPlayed(this);
    }

    public String getPreload() {
        return WebKitDOMHTMLMediaElement.getPreload(this);
    }

    public short getReadyState() {
        return WebKitDOMHTMLMediaElement.getReadyState(this);
    }

    public DOMTimeRanges getSeekable() {
        return WebKitDOMHTMLMediaElement.getSeekable(this);
    }

    public boolean getSeeking() {
        return WebKitDOMHTMLMediaElement.getSeeking(this);
    }

    public float getStartTime() {
        return WebKitDOMHTMLMediaElement.getStartTime(this);
    }

    public float getVolume() {
        return WebKitDOMHTMLMediaElement.getVolume(this);
    }

    public long getWebkitAudioDecodedByteCount() {
        return WebKitDOMHTMLMediaElement.getWebkitAudioDecodedByteCount(this);
    }

    public boolean getWebkitClosedCaptionsVisible() {
        return WebKitDOMHTMLMediaElement.getWebkitClosedCaptionsVisible(this);
    }

    public boolean getWebkitHasClosedCaptions() {
        return WebKitDOMHTMLMediaElement.getWebkitHasClosedCaptions(this);
    }

    public boolean getDefaultMuted() {
        return WebKitDOMHTMLMediaElement.getDefaultMuted(this);
    }

    public float getDuration() {
        return WebKitDOMHTMLMediaElement.getDuration(this);
    }

    public boolean getEnded() {
        return WebKitDOMHTMLMediaElement.getEnded(this);
    }

    public DOMMediaError getError() {
        return WebKitDOMHTMLMediaElement.getError(this);
    }

    public double getInitialTime() {
        return WebKitDOMHTMLMediaElement.getInitialTime(this);
    }

    public String getMediaGroup() {
        return WebKitDOMHTMLMediaElement.getMediaGroup(this);
    }

    public boolean getMuted() {
        return WebKitDOMHTMLMediaElement.getMuted(this);
    }

    public boolean getPaused() {
        return WebKitDOMHTMLMediaElement.getPaused(this);
    }

    public boolean getAutoplay() {
        return WebKitDOMHTMLMediaElement.getAutoplay(this);
    }

    public DOMTimeRanges getBuffered() {
        return WebKitDOMHTMLMediaElement.getBuffered(this);
    }

    public boolean getControls() {
        return WebKitDOMHTMLMediaElement.getControls(this);
    }

    public float getCurrentTime() {
        return WebKitDOMHTMLMediaElement.getCurrentTime(this);
    }

    public short getNetworkState() {
        return WebKitDOMHTMLMediaElement.getNetworkState(this);
    }

    public String getCurrentSrc() {
        return WebKitDOMHTMLMediaElement.getCurrentSrc(this);
    }

    public void play() {
        WebKitDOMHTMLMediaElement.play(this);
    }

    public String getSrc() {
        return WebKitDOMHTMLMediaElement.getSrc(this);
    }

    public void setSrc(String arg1) {
        WebKitDOMHTMLMediaElement.setSrc(this, arg1);
    }

    public void setLoop(boolean arg1) {
        WebKitDOMHTMLMediaElement.setLoop(this, arg1);
    }

    public boolean getLoop() {
        return WebKitDOMHTMLMediaElement.getLoop(this);
    }

   

}
