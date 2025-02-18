package com.mx.development.module02.lesson19;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.time.LocalDateTime;

public class TimeServer {
    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(4546)) {
            System.out.println("Server is listening on port " + 4546);

            while (true) {
                Socket socket = serverSocket.accept();
                System.out.println("New client connected");

                OutputStream output = socket.getOutputStream();
                PrintWriter writer = new PrintWriter(output, true);
                writer.println("Enviando desde el servidor: " + LocalDateTime.now());
            }

        } catch (IOException ex) {
            System.out.println("Server exception: " + ex.getMessage());
            ex.printStackTrace();
        }

    }
}
