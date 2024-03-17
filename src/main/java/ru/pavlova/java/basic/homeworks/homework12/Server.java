package ru.pavlova.java.basic.homeworks.homework12;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(8080);
            System.out.println("Сервер запущен. Ожидание подключения клиента...");

            Socket socket = serverSocket.accept();
            System.out.println("Клиент подключен.");

            DataInputStream inputStream = new DataInputStream(socket.getInputStream());
            DataOutputStream outputStream = new DataOutputStream(socket.getOutputStream());

            calculate(inputStream, outputStream);
            close(inputStream, outputStream);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void calculate(DataInputStream inputStream, DataOutputStream outputStream) throws IOException {
        while (true) {
            String operation = inputStream.readUTF();
            int num1 = inputStream.readInt();
            int num2 = inputStream.readInt();
            int result = 0;

            switch (operation) {
                case "+":
                    result = num1 + num2;
                    break;
                case "-":
                    result = num1 - num2;
                    break;
                case "*":
                    result = num1 * num2;
                    break;
                case "/":
                    result = num1 / num2;
                    break;
            }
            outputStream.writeInt(result);
            outputStream.flush();
        }
    }

    private static void close(DataInputStream inputStream, DataOutputStream outputStream) throws IOException {
        inputStream.close();
        outputStream.close();
    }
}
