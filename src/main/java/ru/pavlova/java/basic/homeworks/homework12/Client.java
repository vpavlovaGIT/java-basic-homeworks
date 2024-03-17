package ru.pavlova.java.basic.homeworks.homework12;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 8080);
            System.out.println("Подключено к серверу.");

            DataInputStream inputStream = new DataInputStream(socket.getInputStream());
            DataOutputStream outputStream = new DataOutputStream(socket.getOutputStream());
            Scanner scanner = new Scanner(System.in);
            count(inputStream, outputStream, scanner);
            close(inputStream, outputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void count(DataInputStream inputStream, DataOutputStream outputStream, Scanner scanner) throws IOException {
        while (true) {
            System.out.print("Введите операцию (+, -, *, /): ");
            String operation = scanner.nextLine();
            System.out.print("Введите первое число: ");
            int num1 = Integer.parseInt(scanner.nextLine());
            System.out.print("Введите второе число: ");
            int num2 = Integer.parseInt(scanner.nextLine());

            outputStream.writeUTF(operation);
            outputStream.writeInt(num1);
            outputStream.writeInt(num2);

            int result = inputStream.readInt();
            outputStream.flush();
            System.out.println("Результат: " + result);
        }
    }

    private static void close(DataInputStream inputStream, DataOutputStream outputStream) throws IOException {
        inputStream.close();
        outputStream.close();
    }
}
