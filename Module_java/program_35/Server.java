package program_35;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    //sockets basically used for connection building in java
    //use Socket class in client and SocketServer in server
    //for each client server need to have one Socket class
    //input stream is used to send input and output stream is used to get the output
    public static void main(String[] args) throws Exception {
        ServerSocket serverSocket = new ServerSocket(9999);
         System.out.println("Server started and waiting for client");
         Socket socket = serverSocket.accept();
         System.out.println("Client has been connected");
         //read and send op using streams
         BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
         PrintWriter output = new PrintWriter(socket.getOutputStream(),true);
         String msg = input.readLine();
         System.out.println("client says "+msg);
         output.println("hello i am server");
         socket.close();
         serverSocket.close();
    }
}
