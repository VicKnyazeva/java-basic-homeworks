package ru.knyazeva.java.basic.homeworks.homework13;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class ServerApp {
    private static final List<ClientHandler> clientHandlers = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        try (ServerSocket socket = new ServerSocket(8080)) {
            Socket clientSocket = socket.accept();
            DataInputStream inputStream = new DataInputStream(clientSocket.getInputStream());
            DataOutputStream outputStream = new DataOutputStream(clientSocket.getOutputStream());
            ClientHandler clientHandler = new ClientHandler(clientSocket, inputStream, outputStream);
            clientHandlers.add(clientHandler);

            while (true) {
                String userInput = inputStream.readUTF();
                System.out.println(userInput);
                String result = transform(userInput);
                outputStream.writeUTF(result);
                outputStream.flush();
                System.out.println(result);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static String transform(String input) {
        return input.toUpperCase();
    }
}