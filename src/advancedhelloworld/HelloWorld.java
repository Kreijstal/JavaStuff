/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;

/**
 *
 * @author JNICOLAS
 */
public class HelloWorld {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] hahaHAHAHAFUCKERSSHITFUCKLOLZFUCKYOUSHIFUCK) throws IOException {
        System.out.println("HELLO WORLD BITCH!");
       
        
Socket s;
        
s = new Socket();
  
s.connect(new InetSocketAddress(InetAddress.getByName("www.whatsmyip.org"), 80),3000);
PrintWriter pw = new PrintWriter(s.getOutputStream());
pw.println("GET / HTTP/1.1");
pw.print("Connection: close\r\nHost: www.whatsmyip.org\r\nHTTP_X_FORWARDED_FOR:1.1.1.1\r\n\r\n");
pw.flush();
BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
String t;
BufferedWriter out = new BufferedWriter(new FileWriter("lel.html"));
while((t = br.readLine()) != null) {System.out.println(t);out.write(t+"\n");}

out.close();
br.close();
    }
}
