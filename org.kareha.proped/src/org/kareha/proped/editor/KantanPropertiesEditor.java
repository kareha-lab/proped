package org.kareha.proped.editor;

import org.eclipse.ui.editors.text.TextEditor;

public class KantanPropertiesEditor extends TextEditor {

    private ColorManager colorManager;

    public KantanPropertiesEditor() {
        super();
        colorManager = new ColorManager();
        setSourceViewerConfiguration(new PropertiesConfiguration(colorManager));
        setDocumentProvider(new PropertiesDocumentProvider());
    }

    @Override
    public void dispose() {
        colorManager.dispose();
        super.dispose();
    }
}
