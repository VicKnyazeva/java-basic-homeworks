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
        if(!file.isDirectory()) {
            out.println("Переданный путь не является директорией.");
            return;
        }
        File[] textFiles = getTextFiles(file);
        if(textFiles.length == 0) {
            out.println("Текстовых файлов в текущей рабочей директории проекта не найдено.");
            return;
        }

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

    /**
     * Lists all text files in directory
     * @param file instance of File (directory) for listing text files
     * @return array of files with .txt extension
     */
    private static File[] getTextFiles(File file) {
        return file.listFiles((dir, name) -> name.toLowerCase().endsWith(".txt"));
    }

    /**
     * Reads data from a file
     * @param file file for reading data
     */
    private static void readFile(File file) {
        if (!file.canRead()) {
            out.println("Файл закрыт на чтение.");
            return;
        }

        try (InputStreamReader in = new InputStreamReader(new BufferedInputStream(new FileInputStream(file)))) {
            int n = in.read();
            while (n != -1) {
                out.print((char) n);
                n = in.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Writes data to a file
     * @param file file for writing data
     * @param data data to write
     */
    private static void writeToFile(File file, String data) {
        if (!file.canWrite()) {
            out.println("Файл закрыт на запись.");
            return;
        }
        try (BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(file, true))) {
            byte[] buffer = data.getBytes(StandardCharsets.UTF_8);

            if (file.length() > 0) {
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
