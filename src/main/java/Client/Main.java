package Client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Main {
    public static void main(String[] args) {

        String host = "127.0.0.1";
        int port = 8088;

        try (Socket clientSocket = new Socket(host, port);
             PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
             BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()))) {

            out.println("Junior Java Developer");

            String resp = in.readLine();
            System.out.println(resp);
        } catch (IOException ex) {
            ex.printStackTrace();
        }


    }
}
