/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;

import java.io.BufferedReader;
import java.io.IOException;

import java.io.InputStreamReader;

import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author JNICOLAS
 */
public class HttpR {
    public static void main(String[] LEL){
        try {
            Socket tun = new Socket();
          //tun.connect(new InetSocketAddress(InetAddress.getByName("com.whois-servers.net"), 43), 3000);
           tun.connect(new InetSocketAddress(InetAddress.getByName("66.252.2.46"), 80), 3000);
           PrintWriter l=new PrintWriter(tun.getOutputStream());
           BufferedReader s=new BufferedReader(new  InputStreamReader(tun.getInputStream()));
          // l.print("GET / HTTP/1.1\r\nHost:pastebin.com\r\n\r\n");
           //l.print("help\r\n");
           l.flush();
           //System.out.print(ReadBufferedReader(s));
           ReadBufferedReader(s);
           
           tun.close();
           
          System.out.print((char)System.in.read());
        } catch (IOException ex) {
            Logger.getLogger(HttpR.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static String ReadBufferedReader(BufferedReader TheBuffer) {
        if(TheBuffer==null){
        return null;}
        StringBuilder str=new StringBuilder();
        
        try {
            int hue;
           while((hue=TheBuffer.read())>0){
                str.append((char)hue);
                System.out.print(Character.toChars(hue));
            }
            /*while((hue=TheBuffer.readLine())!=null){
                str.append(hue).append('\n');
                System.out.println(hue);
            }*/
        } catch (IOException ex) {
            Logger.getLogger(HttpR.class.getName()).log(Level.SEVERE, null, ex);
        }
        return str.toString();
    
    }
}
