package server;

import java.io.IOException;

public class main {
    
    public static void main(String[] args) throws IOException {
        TCPServer s = new TCPServer();//inizializzo il server
        s.startServer(8080);//setto la porta del server
        
    }
}
