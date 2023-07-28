package Seminars.Seminar2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Locale;

public class FileSystem {
    public static void main(String[] args) throws IOException {
        // старый подход в пакете java.io InputOutput
        // новый в пакете java.nio, рассматриваем его!
//        Path path = Path.of("file.txt"); // путь куда-то
//        boolean exists = Files.exists(path); // проверили, что файл существует
//        boolean isFile = Files.isRegularFile(path); // проверяет, что это файл
//        boolean isDir = Files.isDirectory(path); // проверяет, что директория
//        Path absolutePath = path.toAbsolutePath(); // показывает абсолютный путь

        // Создаем структуру Dir/file.txt
        Path Dir = Path.of("Dir"); // 1. описали путь до 'Dir'
        if (Files.notExists(Dir)) {
            Files.createDirectory(Dir); // создаем директорию
        }
        Path file = Path.of("Dir", "file.txt"); // путь к файлу
        if (Files.notExists(file)) {
            Files.createFile(file); // создаем файл
        }

//        Files.delete(file); // удаление. не удаляет не пустую директорию
//        Files.writeString(file, "Колбаса"); // записывает и перезаписывает строки
//        Files.writeString(file, " Root", StandardOpenOption.APPEND); // записывает и дописывает строку

//        String content = Files.readString(file); // прочитали строку (символы). Это для строк
//        System.out.println(content);

//        String cont = "345365errewe";
//        byte[] bytes = cont.getBytes(StandardCharsets.UTF_8);
//        Files.write(file, bytes); // записывает и перезаписывает байты
//        byte[] con = Files.readAllBytes(file);
//        System.out.println(Arrays.toString(con));

//        LocalDateTime now = LocalDateTime.now();
//        String format = now.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"));
//        System.out.println(format);

            // Старый способ
//        File file = new File("Dir/file.txt");
//        FileWriter fileWriter = new FileWriter(file);
//        fileWriter.write("my text");
//        fileWriter.write(" qweqwe");
//        fileWriter.write(" rtyrtytrt");
//        fileWriter.flush();
//        fileWriter.close();


    }
}
