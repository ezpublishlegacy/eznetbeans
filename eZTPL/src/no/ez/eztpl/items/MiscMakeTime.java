package no.ez.eztpl.items;

import javax.swing.text.BadLocationException;
import javax.swing.text.JTextComponent;
import org.openide.text.ActiveEditorDrop;

public class MiscMakeTime implements ActiveEditorDrop {

    public boolean handleTransfer(JTextComponent targetComponent) {

        String body = "maketime( [hour [, minute [, second [, month [, day [, year [, dst ] ] ] ] ] ] ] )";
        try {
            JavaSourceFilePaletteUtilities.insert(body, targetComponent);
        } catch (BadLocationException ble) {
            return false;
        }

        return true;

    }
}

