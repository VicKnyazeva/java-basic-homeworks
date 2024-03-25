package ru.knyazeva.java.basic.homeworks.homework12;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.*;

public class Application {
    public static void main(String[] args) {
        String currentWorkingDir = getProperty("user.dir");

        File file = new File(currentWorkingDir);
        File[] textFiles = file.listFiles((dir, name) -> name.toLowerCase().endsWith(".txt"));
        out.println("Текстовые файлы в текущей рабочей директории проекта:\n" + Arrays.toString(textFiles));

        out.print("\nВведите имя файла, с которым хотите работать: ");
        Scanner sc = new Scanner(in);
        String fileName = sc.nextLine();

        File currentFile = new File(fileName);
        if (!currentFile.exists()) {
            out.println("Файла с таким именем и/или расширением не обнаружено.");
        } else {
            readFile(currentFile);

            out.print("\nВведите любой текст для записи в текущий файл: ");
            String userData = sc.nextLine();

            writeToFile(currentFile, userData);
        }
    }

    private static void readFile(File currentFile) {
        if (!currentFile.canRead()) {
            out.println("Файл закрыт на чтение.");
            return;
        }

        try (FileInputStream fis = new FileInputStream(currentFile);
             BufferedInputStream bis = new BufferedInputStream(fis);
             InputStreamReader in = new InputStreamReader(bis)) {
            int n = in.read();
            while (n != -1) {
                out.print((char) n);
                n = in.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void writeToFile(File currentFile, String userData) {
        if (!currentFile.canWrite()) {
            out.println("Файл закрыт на закрыт на запись.");
            return;
        }
        try (BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(currentFile, true))) {
            byte[] buffer = userData.getBytes(StandardCharsets.UTF_8);

            if (currentFile.length() > 0) {
                out.write(' ');
            }

            for (int i = 0; i < buffer.length; i++) {
                out.write(buffer[i]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
