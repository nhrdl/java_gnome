package org.gnome.webKit;

import org.gnome.glib.GlibException;

public class DOMHTMLInputElement extends DOMHTMLElement
{

    protected DOMHTMLInputElement(long pointer) {
        super(pointer);
    }

    public DOMNodeList getLabels() {
        return WebKitDOMHTMLInputElement.getLabels(this);
    }

    public String getValidationMessage() {
        return WebKitDOMHTMLInputElement.getValidationMessage(this);
    }

    public DOMValidityState getValidity() {
        return WebKitDOMHTMLInputElement.getValidity(this);
    }

    public boolean getWillValidate() {
        return WebKitDOMHTMLInputElement.getWillValidate(this);
    }

    public void setAutofocus(boolean arg1) {
        WebKitDOMHTMLInputElement.setAutofocus(this, arg1);
    }

    public void setCustomValidity(String arg1) {
        WebKitDOMHTMLInputElement.setCustomValidity(this, arg1);
    }

    public void setDisabled(boolean arg1) {
        WebKitDOMHTMLInputElement.setDisabled(this, arg1);
    }

    public boolean checkValidity() {
        return WebKitDOMHTMLInputElement.checkValidity(this);
    }

    public boolean getAutofocus() {
        return WebKitDOMHTMLInputElement.getAutofocus(this);
    }

    public DOMHTMLFormElement getForm() {
        return WebKitDOMHTMLInputElement.getForm(this);
    }

    public boolean getDisabled() {
        return WebKitDOMHTMLInputElement.getDisabled(this);
    }

    public boolean getChecked() {
        return WebKitDOMHTMLInputElement.getChecked(this);
    }

    public String getDirName() {
        return WebKitDOMHTMLInputElement.getDirName(this);
    }

    public DOMFileList getFiles() {
        return WebKitDOMHTMLInputElement.getFiles(this);
    }

    public String getAutocomplete() {
        return WebKitDOMHTMLInputElement.getAutocomplete(this);
    }

    public String getFormAction() {
        return WebKitDOMHTMLInputElement.getFormAction(this);
    }

    public String getFormEnctype() {
        return WebKitDOMHTMLInputElement.getFormEnctype(this);
    }

    public String getFormMethod() {
        return WebKitDOMHTMLInputElement.getFormMethod(this);
    }

    public boolean getFormNoValidate() {
        return WebKitDOMHTMLInputElement.getFormNoValidate(this);
    }

    public String getFormTarget() {
        return WebKitDOMHTMLInputElement.getFormTarget(this);
    }

    public boolean getIncremental() {
        return WebKitDOMHTMLInputElement.getIncremental(this);
    }

    public boolean getIndeterminate() {
        return WebKitDOMHTMLInputElement.getIndeterminate(this);
    }

    public boolean getDefaultChecked() {
        return WebKitDOMHTMLInputElement.getDefaultChecked(this);
    }

    public String getAlt() {
        return WebKitDOMHTMLInputElement.getAlt(this);
    }

    public DOMHTMLElement getList() {
        return WebKitDOMHTMLInputElement.getList(this);
    }

    public String getMax() {
        return WebKitDOMHTMLInputElement.getMax(this);
    }

    public long getMaxLength() {
        return WebKitDOMHTMLInputElement.getMaxLength(this);
    }

    public String getMin() {
        return WebKitDOMHTMLInputElement.getMin(this);
    }

    public boolean getMultiple() {
        return WebKitDOMHTMLInputElement.getMultiple(this);
    }

    public String getPattern() {
        return WebKitDOMHTMLInputElement.getPattern(this);
    }

    public String getPlaceholder() {
        return WebKitDOMHTMLInputElement.getPlaceholder(this);
    }

    public boolean getReadOnly() {
        return WebKitDOMHTMLInputElement.getReadOnly(this);
    }

    public boolean getRequired() {
        return WebKitDOMHTMLInputElement.getRequired(this);
    }

    public String getAccept() {
        return WebKitDOMHTMLInputElement.getAccept(this);
    }

  

    public String getAlign() {
        return WebKitDOMHTMLInputElement.getAlign(this);
    }

    public void setAlign(String arg1) {
        WebKitDOMHTMLInputElement.setAlign(this, arg1);
    }

    public String getSrc() {
        return WebKitDOMHTMLInputElement.getSrc(this);
    }

    public String getStep() {
        return WebKitDOMHTMLInputElement.getStep(this);
    }

    public String getUseMap() {
        return WebKitDOMHTMLInputElement.getUseMap(this);
    }

    public double getValueAsNumber() {
        return WebKitDOMHTMLInputElement.getValueAsNumber(this);
    }

    public boolean getWebkitGrammar() {
        return WebKitDOMHTMLInputElement.getWebkitGrammar(this);
    }

    public boolean getWebkitSpeech() {
        return WebKitDOMHTMLInputElement.getWebkitSpeech(this);
    }

    public boolean getWebkitdirectory() {
        return WebKitDOMHTMLInputElement.getWebkitdirectory(this);
    }

    public boolean isEdited() {
        return WebKitDOMHTMLInputElement.isEdited(this);
    }

    public void select() {
        WebKitDOMHTMLInputElement.select(this);
    }

    public void setAccept(String arg1) {
        WebKitDOMHTMLInputElement.setAccept(this, arg1);
    }

    public void setAlt(String arg1) {
        WebKitDOMHTMLInputElement.setAlt(this, arg1);
    }

    public void setAutocomplete(String arg1) {
        WebKitDOMHTMLInputElement.setAutocomplete(this, arg1);
    }

    public void setChecked(boolean arg1) {
        WebKitDOMHTMLInputElement.setChecked(this, arg1);
    }

    public void setDefaultChecked(boolean arg1) {
        WebKitDOMHTMLInputElement.setDefaultChecked(this, arg1);
    }

    public void setDefaultValue(String arg1) {
        WebKitDOMHTMLInputElement.setDefaultValue(this, arg1);
    }

    public void setDirName(String arg1) {
        WebKitDOMHTMLInputElement.setDirName(this, arg1);
    }

    public void setFormAction(String arg1) {
        WebKitDOMHTMLInputElement.setFormAction(this, arg1);
    }

    public void setFormEnctype(String arg1) {
        WebKitDOMHTMLInputElement.setFormEnctype(this, arg1);
    }

    public void setFormMethod(String arg1) {
        WebKitDOMHTMLInputElement.setFormMethod(this, arg1);
    }

    public void setFormNoValidate(boolean arg1) {
        WebKitDOMHTMLInputElement.setFormNoValidate(this, arg1);
    }

    public void setFormTarget(String arg1) {
        WebKitDOMHTMLInputElement.setFormTarget(this, arg1);
    }

    public void setIncremental(boolean arg1) {
        WebKitDOMHTMLInputElement.setIncremental(this, arg1);
    }

    public void setIndeterminate(boolean arg1) {
        WebKitDOMHTMLInputElement.setIndeterminate(this, arg1);
    }

    public void setMax(String arg1) {
        WebKitDOMHTMLInputElement.setMax(this, arg1);
    }

    public void setMaxLength(long arg1) throws GlibException {
        WebKitDOMHTMLInputElement.setMaxLength(this, arg1);
    }

    public void setMin(String arg1) {
        WebKitDOMHTMLInputElement.setMin(this, arg1);
    }

    public void setMultiple(boolean arg1) {
        WebKitDOMHTMLInputElement.setMultiple(this, arg1);
    }

    public void setPattern(String arg1) {
        WebKitDOMHTMLInputElement.setPattern(this, arg1);
    }

    public void setPlaceholder(String arg1) {
        WebKitDOMHTMLInputElement.setPlaceholder(this, arg1);
    }

    public void setRequired(boolean arg1) {
        WebKitDOMHTMLInputElement.setRequired(this, arg1);
    }

    public void setSrc(String arg1) {
        WebKitDOMHTMLInputElement.setSrc(this, arg1);
    }

    public void setStep(String arg1) {
        WebKitDOMHTMLInputElement.setStep(this, arg1);
    }

    public void setUseMap(String arg1) {
        WebKitDOMHTMLInputElement.setUseMap(this, arg1);
    }

    public void setValueAsNumber(double arg1) throws GlibException {
        WebKitDOMHTMLInputElement.setValueAsNumber(this, arg1);
    }

    public void setValueForUser(String arg1) {
        WebKitDOMHTMLInputElement.setValueForUser(this, arg1);
    }

    public void setWebkitGrammar(boolean arg1) {
        WebKitDOMHTMLInputElement.setWebkitGrammar(this, arg1);
    }

    public void setWebkitSpeech(boolean arg1) {
        WebKitDOMHTMLInputElement.setWebkitSpeech(this, arg1);
    }

    public void setWebkitdirectory(boolean arg1) {
        WebKitDOMHTMLInputElement.setWebkitdirectory(this, arg1);
    }

    public void stepDown(long arg1) throws GlibException {
        WebKitDOMHTMLInputElement.stepDown(this, arg1);
    }

    public void stepUp(long arg1) throws GlibException {
        WebKitDOMHTMLInputElement.stepUp(this, arg1);
    }

    public String getName() {
        return WebKitDOMHTMLInputElement.getName(this);
    }

    public String getValue() {
        return WebKitDOMHTMLInputElement.getValue(this);
    }

    public void setReadOnly(boolean arg1) {
        WebKitDOMHTMLInputElement.setReadOnly(this, arg1);
    }

    public void setName(String arg1) {
        WebKitDOMHTMLInputElement.setName(this, arg1);
    }

    public String getDefaultValue() {
        return WebKitDOMHTMLInputElement.getDefaultValue(this);
    }

    public long getSize() {
        return WebKitDOMHTMLInputElement.getSize(this);
    }

 
    public void setValue(String arg1) {
        WebKitDOMHTMLInputElement.setValue(this, arg1);
    }

}
