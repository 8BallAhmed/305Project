package cpit305project;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerSide {

    public static void main(String[] args) {
        try {
            ServerSocket server = new ServerSocket(8900);
            Socket client;
            while (true) {
                System.out.println("Server waiting connection...");
                client = server.accept();
                ServerThread s = new ServerThread(client);
                s.start();
            }
        } catch (IOException ex) {

        } catch (ClassNotFoundException ex) {

        }
    }
}
