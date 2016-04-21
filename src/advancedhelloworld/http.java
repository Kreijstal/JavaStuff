/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 * SPAGHETTI CODE, DO NNNNOOOOT READ;
 */
package helloworld;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import java.io.*;
import java.net.*;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.HandshakeCompletedEvent;
import javax.net.ssl.HandshakeCompletedListener;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocket;
import javax.swing.Timer;

public class http implements Runnable {
public static http z;
public Thread k;
Object[] STRL;
http(Object[] s) {
        STRL = s;
    }
http(){
}
@SuppressWarnings("empty-statement")
    public static void main(String[] s) throws Exception {

        //Https or not?
        Boolean HTTPS = true;





// js:document.body.innerText.match(/([0-9]{1,3}\.)+[0-9]{1,3}\:[0-9]{1,7}/gi).join(';')
//IMPROVED:
//JS:Array.prototype.map.call(document.body.innerText.match(/([0-9]{1,3}\.)+[0-9]{1,3}(\:|\s{1,3})[0-9]{1,7}/gi),function(x){return x.replace(/\s+/gi,":")}).join(';')
//        String noob = "188.26.131.173:8080;188.26.131.173:8080;152.92.137.18:8080;152.92.137.18:8080;152.92.137.18:8080;82.208.58.119:80;82.208.58.119:80;82.208.58.119:80;201.187.107.26:80;201.187.107.26:80;201.187.107.26:80;178.33.181.120:8080;178.33.181.120:8080;178.33.181.120:8080;201.187.107.27:80;201.187.107.27:80;201.187.107.27:80;141.0.169.12:3128;141.0.169.12:3128;141.0.169.12:3128;122.160.17.121:3128;122.160.17.121:3128;122.160.17.121:3128;71.190.195.124:3128;71.190.195.124:3128;71.190.195.124:3128;71.8.238.154:80;71.8.238.154:80;71.8.238.154:80;49.0.96.48:80;49.0.96.48:80;49.0.96.48:80;217.16.9.173:3128;217.16.9.173:3128;217.16.9.173:3128;41.202.160.190:80;41.202.160.190:80;41.202.160.190:80;199.21.149.33:3128;199.21.149.33:3128;199.21.149.33:3128;186.101.65.115:80;186.101.65.115:80;186.101.65.115:80;112.133.201.69:3128;112.133.201.69:3128;112.133.201.69:3128;198.27.117.187:143;198.27.117.187:143;198.27.117.187:143;198.27.100.200:3128;198.27.100.200:3128;198.27.100.200:3128;211.167.112.15:82;211.167.112.15:82;211.167.112.15:82;211.167.112.14:80;211.167.112.14:80;211.167.112.14:80;78.9.46.148:3128;78.9.46.148:3128;78.9.46.148:3128;95.80.92.52:3128;95.80.92.52:3128;95.80.92.52:3128;72.18.151.70:80;72.18.151.70:80;72.18.151.70:80;93.166.121.107:8118;93.166.121.107:8118;93.166.121.107:8118;115.25.216.6:80;115.25.216.6:80;115.25.216.6:80;198.27.126.139:8080;198.27.126.139:8080;198.27.126.139:8080;146.255.9.124:3128;146.255.9.124:3128;146.255.9.124:3128;173.213.108.113:3128;173.213.108.113:3128;173.213.108.113:3128;198.100.159.69:8080;198.100.159.69:8080;198.100.159.69:8080;199.119.76.111:8080;199.119.76.111:8080;199.119.76.111:8080;61.145.121.124:88;61.145.121.124:88;61.145.121.124:88";
        //String noob ="46.4.56.205:3128";
        String noob = getContents(new File("proxiesandshit.txt")) + ';';
        String[] r = splitString(";", noob);
        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i]);
        }
        int delim;
        String heh;
        for (int dd = 0; dd < r.length; dd++) {
            heh = r[dd];
            delim = heh.indexOf(':');
            if (delim != -1) {
                if (HTTPS) {
                    System.out.print("SSL ");
                }
                System.out.print(heh + " > ");
                //String faggotJavaWhyYouSuckAtThisShitIFuckingHateYouFuckShitDamn ="\x13\x10";
                //JOptionPane.showMessageDialog(null, faggotJavaWhyYouSuckAtThisShitIFuckingHateYouFuckShitDamn.matches(heh), "InfoBox: " + "noob", JOptionPane.INFORMATION_MESSAGE);
                //System.out.println((heh.codePointAt(0)));
                if (heh.length() > 0 && (heh.codePointAt(0)) == 13) {
                    JOptionPane.showMessageDialog(null, "It's over", "InfoBox: " + "noob", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    //System.out.print(faggotJavaWhyYouSuckAtThisShitIFuckingHateYouFuckShitDamn.matches(heh));
                    System.out.println(CheckProxy("https://www.4chan.org:443/banned", heh.substring(0, delim), getInteger(heh.substring(delim + 1)), "Fuck", true, HTTPS));
                }
                System.out.println("---------------------------");
            }
        }



    }

    static public String getContents(File aFile) {
        //...checks on aFile are elided
        StringBuilder contents = new StringBuilder();

        try {
            //use buffering, reading one line at a time
            //FileReader always assumes default encoding is OK!
            BufferedReader input = new BufferedReader(new FileReader(aFile));
            try {
                String line = null; //not declared within while loop
        /*
                 * readLine is a bit quirky :
                 * it returns the content of a line MINUS the newline.
                 * it returns null only for the END of the stream.
                 * it returns an empty String if two newlines appear in a row.
                 */
                while ((line = input.readLine()) != null) {
                    contents.append(line);
                    contents.append(System.getProperty("line.separator"));
                }
            } finally {
                input.close();
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        return contents.toString();
    }

    public static String getSubstringBetween(String haystack, String start, String end, Boolean Inclusive) {
        //char[] fag;
        if (haystack == null) {
            return null;
        }
        int a = haystack.indexOf(start);
        //for(int i=a;i<a+strtoFind.length;i++){
        if (0 == ~a) {
            return null;
        } else {
            // }      
            String heh = haystack.substring(a);
            a = heh.indexOf(end);
            if (0 == ~a) {
                return null;
            } else {
                heh=heh.substring(Inclusive?0:start.length(),a);
                if(Inclusive){
                return heh+end;
                }else{
                return heh;}
            }
        }
    }

    public static String[] splitString(String strDelimeter, String sourceString) {
        String[] n;
        n = new String[countSubstrings(strDelimeter, sourceString)];
        int d = -1;
        int k = 0;
        for (int z = 0; 0 != ~k; z++) {
            k = sourceString.indexOf(strDelimeter, d + 1);
            if (0 == ~k) {
                n[z] = sourceString.substring(d + 1);
                break;
            }
            n[z] = sourceString.substring(d + 1, k);
            d = sourceString.indexOf(strDelimeter, d + 1);

        }
        return n;
    }

    public static int countSubstrings(String needle, String haystack) {
        if (haystack == null || haystack.length() == 0) {
            return 0;
        }
        int count = 0;
        // start at the beginning of the string
        int nextIndex = 0;
        while (0 != ~nextIndex) {
            nextIndex++;
            count++;
            nextIndex = haystack.indexOf(needle, nextIndex);
        }
        return count;
    }

    public static int getInteger(String a) {
        int c = a.length();
        String d = "";
        for (int b = 0; b < c; b++) {
            if (Character.isDigit(a.charAt(b))) {
                d += a.charAt(b);
            }
        }
        if ("".equals(d)) {
            System.out.println("Couldn't get integer in:" + a)
        }
        return Integer.parseInt(("".equals(d)) ? "0" : d);
    }

    public static Boolean CheckProxy(String turl, String proxy, int portProxy, String fileName, Boolean XX, Boolean HTTPS) throws MalformedURLException, IOException {
        URL url = new URL(turl);
        int numnum = 0;
        //if(portProxy==80){System.out.println("port 80 ignore..");return false;}
        String res = "", lol;
        BufferedReader br = null;
        try {
            String ss = "GET " + url.toString() + " HTTP/1.1\r\nConnection: close\r\nHost: " + url.getHost() + "\r\nHTTP_X_FORWARDED_FOR:1.1.1.1\r\n\r\n";
            PrintWriter pw;
            if (HTTPS) {
                Socket tun = new Socket();
                tun.connect(new InetSocketAddress(InetAddress.getByName(proxy), portProxy), 3000);
                (new http()).doTunnelHandshake(tun, url.getHost(), url.getPort());

                SSLSocket s;
                s = (SSLSocket) (HttpsURLConnection.getDefaultSSLSocketFactory()).createSocket(tun, url.getHost(), url.getPort(), true);
                s.addHandshakeCompletedListener(
                        new HandshakeCompletedListener() {
                            public void handshakeCompleted(
                                    HandshakeCompletedEvent event) {
                                System.out.println("Handshake finished!");
                                System.out.println(
                                        "\t CipherSuite:" + event.getCipherSuite());
                                System.out.println(
                                        "\t SessionId " + event.getSession());
                                System.out.println(
                                        "\t PeerHost " + event.getSession().getPeerHost());
                            }
                        });
                s.startHandshake();
                System.out.println("Handshaking Complete");
                pw = new PrintWriter(s.getOutputStream());
                pw.print(ss);
                pw.flush();
                br = new BufferedReader(new InputStreamReader(s.getInputStream()));
            } else {
                Socket s;
                s = new Socket();
                s.connect(new InetSocketAddress(InetAddress.getByName(proxy), portProxy), 3000);
                pw = new PrintWriter(s.getOutputStream());
                pw.print(ss);
                pw.flush();
                br = new BufferedReader(new InputStreamReader(s.getInputStream()));
            }
        } catch (Exception asdxc) {
            System.out.println(asdxc.getMessage());
            if (!asdxc.getMessage().contains("timed out") && !asdxc.getMessage().contains("refused")) {
                Logger.getLogger(http.class.getName()).log(Level.SEVERE, null, asdxc);
            }
        }
        if (br != null) {
            try {
                while ((lol = br.readLine()) != null) {
                    System.out.print("Read lapse")
                    res += lol + '\n';
                }
            } catch (Exception EEEXCeption) {
                System.out.println(EEEXCeption.getMessage());
            }

            br.close();
        }

        if (!"".equals(res)) {
            numnum = getInteger(res.substring(res.indexOf(" "), res.indexOf('\n')));
            System.out.println(numnum);
        } else {
            numnum = 0;
        }

        System.out.println("numnum >= 200:" + (numnum >= 200));
        if (numnum >= 200) {
            if (HTTPS) {
                fileName += " SSL";
            }
            fileName += " " + url.getHost() + " " + proxy + " - " + Integer.toString(portProxy) + "v";
            if (fileName != null) {
                String filename = fileName + ".txt";
                System.out.println("Does file \"" + filename + "\" exists?? :" + ((new File(filename)).isFile()));

                for (int xxfile = 0; ((new File(filename)).isFile()); xxfile++) {
                    filename = fileName + xxfile + ".txt";
                    System.out.println("Does file " + filename + " exists?? :" + ((new File(filename)).isFile()));
                }

                if (!res.contains("The URL you requested has been blocked")) {
                    System.out.println("Is the page empy as \"\"? :" + ("".equals(res.substring(res.indexOf("\n\n")))));
                    if (!("".equals(res.substring(res.indexOf("\n\n"))))) {
                        BufferedWriter out = new BufferedWriter(new FileWriter(filename));
                        if (XX) {
                            out.write(res);
                        } else {
                            out.write(res.substring(res.indexOf("\n\n")));
                        }
                        out.close();
                    }
                } else {
                    System.out.println("Fuckers blocked the fucking page, shit fuck shit.");
                    return false;
                }
            }
        }



        if (numnum > 200) {

            return true;

        } else if (numnum == 200) {

            return true;
        } else {
            return false;
        }


    }

    

    public final void run() {
         boolean error = false;
         int newlinesSeen = 0;
         boolean headerDone = false;
        int FAGGOT = 0;
        
        ActionListener taskPerformer = new ActionListener() {
      public void actionPerformed(ActionEvent evt)   {
      //throw new IOException("Too fucking loong");
          System.out.println("Fuck... it's taking toooo long.. :/");
          
      }};
         Timer theTime=new Timer(10000, taskPerformer);
         theTime.setRepeats(false);
                 theTime.start();
                 InputStream in=(InputStream) STRL[1];
                 byte[] reply=(byte[]) STRL[2];
                 int replyLen=(int) STRL[3];
        while (newlinesSeen < 2) {
            FAGGOT++;
            int i = 0;
            try {
                i = in.read();
            } catch (IOException ex) {
                System.err.println(ex.getMessage());
                
                if(ex.getMessage().contains("Connection reset")||ex.getMessage().contains("Read timed out")){theTime.stop();STRL[0]=true;
                Thread.stop();}
                Logger.getLogger(http.class.getName()).log(Level.SEVERE, null, ex);
            } 
            if (i < 0) {

                if (FAGGOT > 255) {
                    theTime.stop();
                    break;
                }
            }
            if (i == '\n') {
                headerDone = true;
                ++newlinesSeen;
            } else if (i != '\r') {
                newlinesSeen = 0;
                if (!headerDone && replyLen < reply.length) {
                    reply[replyLen++] = (byte) i;
                }
            }
        }theTime.stop();STRL[1]=in;
        /*
         * Converting the byte array to a string is slightly wasteful
         * in the case where the connection was successful, but it's
         * insignificant compared to the network overhead.
         */
        String replyStr;
        try {
            replyStr = new String(reply, 0, replyLen, "ASCII7");
        } catch (UnsupportedEncodingException ignored) {
            replyStr = new String(reply, 0, replyLen);
        }

        /* We check for Connection Established because our proxy returns 
         * HTTP/1.1 instead of 1.0 */
        //if (!replyStr.startsWith("HTTP/1.0 200")) {
        if (replyStr.indexOf(
                "200") == -1) {
            System.err.println("Unable to tunnel through "
                    //+ "127.0.0.1" + ":" + 8050
                    + ".  Proxy returns \"" + replyStr + "\"");
            STRL[0]=true;
            //Thread.stop();
            
        }else{
        System.out.println("Proxy returns \"" + replyStr + "\"");}
        /* tunneling Handshake was successful! */
        STRL[2]=reply;
        STRL[3]=replyLen;
        STRL[0]=true;
        
        System.out.println("end of thread");
        System.out.println(reply);
    }

    public boolean doTunnelHandshake(Socket tunnel, String host, int port)
            throws IOException, InterruptedException {
        OutputStream out = tunnel.getOutputStream();
        String msg = "CONNECT " + host + ":" + port + " HTTP/1.0"
                //            + "User-Agent: "
                //            + sun.net.www.protocol.http.HttpURLConnection.userAgent
                + "\r\n\r\n";
        System.out.print(msg);
        byte b[];
        try {
            /*
             * We really do want ASCII7 -- the http protocol doesn't change
             * with locale.
             */
            b = msg.getBytes("ASCII7");
        } catch (UnsupportedEncodingException ignored) {
            /*
             * If ASCII7 isn't there, something serious is wrong, but
             * Paranoia Is Good (tm)
             */
            b = msg.getBytes();
        }
        out.write(b);
        out.flush();
        System.out.println("Request Flushed");
        /*
         * We need to store the reply so we can create a detailed
         * error message to the user.
         */
        byte reply[] = new byte[200];
        int replyLen = 0;
        
             /* Done on first newline */

        InputStream in = tunnel.getInputStream();
       
        System.out.println("Starting to read reply from server");
         
         Object[] lel={false,in,reply,replyLen};        
         http a=new http(lel);
         k=new Thread(a);
         System.out.println("Thread has started");
         k.start();         
         Boolean cont=false;
         int coount=0;
         while(!cont){
        cont=(Boolean) a.STRL[0];
        Thread.sleep(30);
        //System.out.println("HUELOOP");
        if(coount++>5500){
            System.out.println("TOOOOOOOOO FUCKING LONG");
        k.stop()
                ;return false;}
        }
         in=(InputStream) a.STRL[1];
         reply= (byte[]) a.STRL[2];
         replyLen=(int) a.STRL[3];
        return true;
        
    }
}
