/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package advancedhelloworld;

/**
 *
 * @author JNICOLAS
 */
public class HTTP {
    public String HTTPVER = "1.1";
    public String hostname = null;
    private java.nio.channels.SocketChannel server;
    public String MULTIPARTrandomString;
    public String[] headerGuide;
    public boolean configureBlocking=false;
    public java.nio.channels.WritableByteChannel destination = java.nio.channels.Channels.newChannel(System.out);

    public void connect(String hstname, int port) {
        Boolean scontinue = true;
        int RemainingTries = 4;
        while (scontinue) {
            try {
                scontinue = false;
                hostname = new StringBuilder(hstname).append(":").append(port).toString();
                server = java.nio.channels.SocketChannel.open(new java.net.InetSocketAddress(hstname, port));
                server.configureBlocking(configureBlocking);

            } catch (java.io.IOException ex) {
                if (RemainingTries-- > 0) {
                    scontinue = true;
                }
                java.util.logging.Logger.getLogger(HTTP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);

            }
        }

    }

    public void request(byte[] request) {
        try {
            java.nio.ByteBuffer buf=java.nio.ByteBuffer.allocate(request.length);
            buf.clear();
            buf.put(request);
            buf.flip();
            while(buf.hasRemaining()) {
    server.write(buf);
           }
            
        } catch (java.io.IOException ex) {
            java.util.logging.Logger.getLogger(HTTP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }
    public void request(String Path, String Method, String[] headers, byte[] Post){
        request(this.createHttpRequests(Path, Method, headers, Post));    
    };
    public void readUpdate(){
        try {
            java.nio.ByteBuffer data = java.nio.ByteBuffer.allocateDirect(32 * 1024);
            //System.out.print("server is connected: "+server.isConnected());
            if(server.read(data) != -1){
            data.flip();
            while (data.hasRemaining()) {
                System.out.print("data.hasRemaining is TRUEEE");
                    destination.write(data);
                }
            
            data.clear();
            }
        } catch (java.io.IOException ex) {
            java.util.logging.Logger.getLogger(HTTP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }
static String[] concantenate(String[]... arrays){
int totalength=0;
for(String[] as:arrays){
if(as!=null) {
        totalength+=as.length;
    }
}
String[] result = new String[totalength];
int currentIndex = 0;
    for (int i = 0; i < arrays.length; i++)
    {
        if(arrays[i]!=null){
        System.arraycopy(arrays[i], 0, result, currentIndex, arrays[i].length);
        currentIndex += arrays[i].length;}
    }

    return result;

}


    public byte[] /*byte[]*/ createHttpRequests(String Path, String Method, String[] headers, byte[] Post) {
        StringBuilder request = new StringBuilder(Method).append(" ").append(Path).append(" ").append("HTTP/").append(HTTPVER).append("\r\n");
        String[] hoders = concantenate(headerGuide,headers);
        for (int i = 0, l = hoders.length; i < l; i++) {
            request.append(hoders[i]).append("\r\n\r\n");
        }
        java.io.ByteArrayOutputStream outstr=new java.io.ByteArrayOutputStream();
        if (Post != null) {
            try {
                outstr.write( request.toString().getBytes());
                outstr.write(Post);
                outstr.write("\r\n\r\n".getBytes());
            } catch (java.io.IOException ex) {
                java.util.logging.Logger.getLogger(HTTP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
        } else {
            try {
                outstr.write( request.toString().getBytes());
            } catch (java.io.IOException ex) {
                java.util.logging.Logger.getLogger(HTTP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
        }

        return outstr.toByteArray();



    }

    public class netfiles {

        java.net.URI uri;
        String filename, contentType;
        byte[] content;
        boolean hasContent;
        

        public netfiles(java.net.URI uri2) {
            uri = uri2;
            String url = uri2.toString();
            String fileName = url.substring(url.lastIndexOf('/') + 1, url.length());
            if (fileName.equals("")) {
                filename = null;
            } else {
                filename = fileName;
            }
        }

        public netfiles(java.net.URI uri2, String f) {
            uri = uri2;
            filename = f;
        }

        public netfiles(String uri) throws java.net.URISyntaxException {
            this(new java.net.URI(uri));
        }
    }

    public void createMultipartcontent(java.util.Map<String, String> values, netfiles[] URILIST) {
    }

    public byte[] readFile(java.net.URI aInputFileName) {
        if ("file".equals(aInputFileName.getScheme())) {
            java.io.File file = new java.io.File(aInputFileName);
            System.out.println("File size: " + file.length());
            byte[] result = new byte[(int) file.length()];
            try {
                java.io.InputStream input = null;
                try {
                    int totalBytesRead = 0;
                    input = new java.io.BufferedInputStream(new java.io.FileInputStream(file));
                    while (totalBytesRead < result.length) {
                        int bytesRemaining = result.length - totalBytesRead;
                        //input.read() returns -1, 0, or more :
                        int bytesRead = input.read(result, totalBytesRead, bytesRemaining);
                        if (bytesRead > 0) {
                            totalBytesRead = totalBytesRead + bytesRead;
                        }
                    }
                    /*
                     the above style is a bit tricky: it places bytes into the 'result' array; 
                     'result' is an output parameter;
                     the while loop usually has a single iteration only.
                     */
                    System.out.println("Num bytes read: " + totalBytesRead);
                } finally {
                    System.out.println("Closing input stream.");
                    input.close();
                }
            } catch (java.io.FileNotFoundException ex) {
                System.err.println("File not found.");
            } catch (java.io.IOException ex) {
                System.err.println(ex);
            }
            return result;
        }
        return null;
    }

    public void disconnect() {
    }
}
