/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package no.ez.eztpl.items;

import javax.swing.text.BadLocationException;
import javax.swing.text.JTextComponent;
import org.openide.text.ActiveEditorDrop;

public class ArrayInsert implements ActiveEditorDrop {

    public boolean handleTransfer(JTextComponent targetComponent) {

        String body = "input|insert( offset, element1 [, element2 [, ... ] ] )";
        try {
            JavaSourceFilePaletteUtilities.insert(body, targetComponent);
        } catch (BadLocationException ble) {
            return false;
        }

        return true;

    }
}
