package no.ez.eztpl.items;

import javax.swing.text.BadLocationException;
import javax.swing.text.JTextComponent;
import org.openide.text.ActiveEditorDrop;

public class LogicalEq implements ActiveEditorDrop {

    public boolean handleTransfer(JTextComponent targetComponent) {

        String body = "input|eq( value1 [, value2 ] )";
        try {
            JavaSourceFilePaletteUtilities.insert(body, targetComponent);
        } catch (BadLocationException ble) {
            return false;
        }

        return true;

    }
}

