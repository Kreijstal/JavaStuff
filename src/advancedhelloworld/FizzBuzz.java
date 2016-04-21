package helloworld;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;

public class FizzBuzz implements Runnable {

    public static void main(String[] fag) throws ClassNotFoundException {

        FizzBuzz textTransfer = new FizzBuzz();

        //display what is currently on the clipboard
        System.out.println("Clipboard contains:" + textTransfer.getClipboardContents());
    }

    public String getClipboardContents() throws ClassNotFoundException {
        String result = "";
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        //odd: the Object param of getContents is not currently used
        DataFlavor[] hue;
        Transferable contents;
        contents = clipboard.getContents(null);
        hue = contents.getTransferDataFlavors();
        for (int r = 0; r < hue.length; r++) {
            //System.out.println(hue[r].getMimeType());
        }
        boolean hasTransferableText = (contents != null) && contents.isDataFlavorSupported(DataFlavor.stringFlavor);

        if (hasTransferableText) {
            for (int r = 0; r < hue.length; r++) {
                try {
                    System.out.println((hue[r]));
                    result = (String) contents.getTransferData(DataFlavor.stringFlavor);
                    System.out.println(contents.getTransferData(hue[r]));
                } catch (UnsupportedFlavorException | IOException ex) {                //highly unlikely since we are using a standard DataFlavor
                    //  System.out.println(ex);
                }
                System.out.println("-------------------------------");
            }
        }
        return result;
    }
    
    public void run(){
    System.out.println("SUCESS");
    }
    
    
}
