/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package advancedhelloworld;

import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.SocketChannel;
import java.nio.channels.WritableByteChannel;




public class httpfag {
    
    public static void main (String[] lel) throws Exception{
    String hostname = new StringBuilder("google.com").append(":").append(80).toString();
    System.out.println("start");
    
        SocketChannel server=java.nio.channels.SocketChannel.open(new InetSocketAddress("95.211.8.153", 80));
        server.configureBlocking(false);
    server.write(ByteBuffer.wrap("GET /f/69807/69807a1d99/1386865672_69807a1d990459fa0a1452dae7ef2b1e.png HTTP/1.1\r\nHost:95.211.8.153\r\n\r\n".getBytes()));
 
       ByteBuffer data = ByteBuffer.allocateDirect(32 * 1024);
       System.out.print("server is connected: "+server.isConnected());
       WritableByteChannel out = Channels.newChannel(System.out);
       //server.configureBlocking(false);
       int returnRead,loop=0;
       while((returnRead=server.read(data)) != -1){
            System.out.println("loopstart and returnRead is "+returnRead+"loops are "+(++loop));
                data.flip();
            System.out.println("flipcomplete");
            while (data.hasRemaining()) {
                System.out.print("data.hasRemaining is TRUEEE");
                out.write(data);
            }
            System.out.println("past remaining");
 
            data.clear();
            System.out.println("cleared");
        }
 
    System.out.println("attempt second");
    server.write(ByteBuffer.wrap("GET / HTTP/1.1\r\nHost:google.com\r\n\r\n".getBytes())); //WRITE AGAIN
    //and READ again, this time it doesn't work
    data = ByteBuffer.allocateDirect(32 * 1024);
    System.out.print("server is connected: "+server.isConnected());
    while(server.read(data) != -1){
            data.flip();
            while (data.hasRemaining()) {
                System.out.print("data.hasRemaining is TRUEEE");
                    Channels.newChannel(System.out).write(data);
                }
 
            data.clear();
    }
 
}
}