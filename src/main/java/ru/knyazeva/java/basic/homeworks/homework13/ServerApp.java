package ru.knyazeva.java.basic.homeworks.homework13;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ServerApp {
    private static final List<ClientHandler> clientHandlers = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        try (ServerSocket socket = new ServerSocket(8080)) {
            Socket clientSocket = socket.accept();
            DataInputStream inputStream = new DataInputStream(clientSocket.getInputStream());
            DataOutputStream outputStream = new DataOutputStream(clientSocket.getOutputStream());
            ClientHandler clientHandler = new ClientHandler(clientSocket, inputStream, outputStream);
            clientHandlers.add(clientHandler);

            String toSend = availableOperations();
            outputStream.writeUTF(toSend);
            outputStream.flush();

            while (true) {
                String userInput = inputStream.readUTF();
                System.out.printf("Client input: %s%n", userInput);

                String result = calculate(userInput);

                outputStream.writeUTF(result);
                outputStream.flush();

                System.out.println(result);
            }
        } catch (IOException e) {
            throw new IOException(e);
        }
    }

    public static String calculate(String input) throws IOException {
        boolean isEmpty = validateInput(input);
        if (isEmpty) {
            throw new IOException("Невозможно выполнить операцию: получена пустая строка.");
        }

        String operator = getOperator(input);
        if (operator == null) {
            throw new IOException("Невозможно выполнить операцию: в полученной строке отсутствует оператор.");
        }

        List<String> operandsList = getOperands(input);
        if (operandsList.isEmpty()) {
            throw new IOException("Невозможно выполнить операцию: в полученной строке отсутствуют операнды.");
        }
        double operand1 = Double.parseDouble(operandsList.get(0));
        double operand2 = Double.parseDouble(operandsList.get(1));

        double result;
        switch (operator) {
            case "*":
                result = operand1 * operand2;
                break;
            case "+":
                result = operand1 + operand2;
                break;
            case "-":
                result = operand1 - operand2;
                break;
            case "/":
                result = operand1 / operand2;
                break;
            default:
                result = Double.NaN;
        }
        return String.valueOf(result);
    }

    private static List<String> getOperands(String input) {
        Pattern operandsPattern = Pattern.compile("\\d+");
        Matcher operandsMatcher = operandsPattern.matcher(input);
        List<String> operandList = new ArrayList<>();

        while (operandsMatcher.find()) {
            operandList.add(input.substring(operandsMatcher.start(), operandsMatcher.end()));
        }

        return operandList;
    }

    private static String getOperator(String input) {
        Pattern operatorsPattern = Pattern.compile("[\\+\\*-/]");
        Matcher operatorsMatcher = operatorsPattern.matcher(input);
        List<String> operatorsList = new ArrayList<>();

        while (operatorsMatcher.find()) {
            operatorsList.add(input.substring(operatorsMatcher.start(), operatorsMatcher.end()));
        }

        if (operatorsList.isEmpty()) {
            return null;
        }

        return operatorsList.get(0);
    }

    private static boolean validateInput(String input) {
        return (input.isBlank() || input.isEmpty());
    }

    public static String availableOperations() {
        return "+ - / *";
    }
}