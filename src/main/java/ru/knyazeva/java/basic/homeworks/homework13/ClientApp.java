package ru.knyazeva.java.basic.homeworks.homework13;

import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class ClientApp {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        try (Socket socket = new Socket("localhost", 8080)) {
            ClientExample client = new ClientExample(socket.getInputStream(), socket.getOutputStream());

            var reply = client.receive();
            System.out.println("На сервере доступны операции: " + reply);

            while (true) {
                System.out.print("Введите операцию и операнды через пробел или exit для выхода: ");
                String userMessage = scanner.nextLine();
                if (userMessage.equals("exit")) {
                    break;
                }
                client.send(userMessage);

                reply = client.receive();
                System.out.println("Ответ сервера: " + reply);
            }
        } catch (IOException e) {
            throw new IOException(e);
        }
    }
}
