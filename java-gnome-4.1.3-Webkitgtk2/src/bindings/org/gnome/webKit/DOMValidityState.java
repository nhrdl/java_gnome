
package org.gnome.webKit;


public class DOMValidityState
    extends DOMObject
{


    protected DOMValidityState(long pointer) {
        super(pointer);
    }

    public boolean getTypeMismatch() {
        return WebKitDOMValidityState.getTypeMismatch(this);
    }

    public boolean getValueMissing() {
        return WebKitDOMValidityState.getValueMissing(this);
    }

    public boolean getRangeOverflow() {
        return WebKitDOMValidityState.getRangeOverflow(this);
    }

    public boolean getRangeUnderflow() {
        return WebKitDOMValidityState.getRangeUnderflow(this);
    }

    public boolean getStepMismatch() {
        return WebKitDOMValidityState.getStepMismatch(this);
    }

    public boolean getValid() {
        return WebKitDOMValidityState.getValid(this);
    }

    public boolean getTooLong() {
        return WebKitDOMValidityState.getTooLong(this);
    }

    public boolean getCustomError() {
        return WebKitDOMValidityState.getCustomError(this);
    }

    public boolean getPatternMismatch() {
        return WebKitDOMValidityState.getPatternMismatch(this);
    }

}
