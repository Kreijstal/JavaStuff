/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package advancedhelloworld;

import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author JNICOLAS
 */
public class AdvancedHelloWorld {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws URISyntaxException {
        // TODO code application logic here

        HTTP req=new HTTP();
        String[] httpHeaders = new String[]{"Host:127.0.0.1"};
        byte[] result=req.createHttpRequests("/upload", "GET", httpHeaders, null);
        System.out.print(new String(result));
        
        req.connect("127.0.0.1",80);
        req.request(result);
        req.read();
        req.request(result);
        System.out.println("\r\n\r\n");
        try {
            Thread.sleep(4000);
        } catch (InterruptedException ex) {
            Logger.getLogger(AdvancedHelloWorld.class.getName()).log(Level.SEVERE, null, ex);
        }
        req.read();
        
        for(int i=0;i<args.length;i++) {
            System.out.println(args[i]);
        }
        //System.out.println("LOLOLOL"+req.hostname);
    }
    
    public String multipartData(byte[][] byteData){
        
        return "";    
    }
}
