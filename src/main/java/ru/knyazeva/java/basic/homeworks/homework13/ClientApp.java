package ru.knyazeva.java.basic.homeworks.homework13;

import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class ClientApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try (Socket socket = new Socket("localhost", 8080)) {
            ClientExample client = new ClientExample(socket.getInputStream(), socket.getOutputStream());
            while (true) {
                System.out.println("Enter message:");
                String userMessage = scanner.nextLine();
                if (userMessage.equals("exit")) {
                    break;
                }
                client.send(userMessage);

                var reply = client.receive();
                System.out.println(reply);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
