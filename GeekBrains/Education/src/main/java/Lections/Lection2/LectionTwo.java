package Lections.Lection2;

import java.util.logging.*;

public class LectionTwo {
    public static void main(String[] args) {
        // Создать строку из 1 млн плюсиков.
//        var s = System.currentTimeMillis();
//        String str = ""; // Создание строки вариант 1
//        StringBuilder sb = new StringBuilder(); // Создание строки вариант 2
//        for (int i = 0; i < 1_000_000; i++) {
//            str += "+"; // итерации для 1 варианта
//            sb.append("+"); // итераци для 2 варианта. операция добавления
//        }
//        System.out.println(System.currentTimeMillis() - s); // показывает затраченное время
//        System.out.println(str); // вывод 1 варианта 200000 mСек
//        System.out.println(sb);  // вывод 2 варианта 35 mСек

/*
        String[] name = { "C", "е", "р", "г", "е", "й" };
        String sk = "СЕРГЕЙ КА.";
        System.out.println(sk.toLowerCase()); // сергей ка. // в нижний регистр
        System.out.println(String.join("", name)); // Cергей // объединение элементов в массиве в строку без разделителя
        System.out.println(String.join("", "C", "е", "р", "г", "е", "й"));
        // объединение элементов в массиве в строку без разделителя
        System.out.println(String.join(",", "C", "е", "р", "г", "е", "й"));
        // C,е,р,г,е,й. разделитель ','
*/


        // Работа с файловой системой. Файлы

         // File <имя> = new File(<полный путь к файлу>);
        /*
        File f0 = new File("D:\\Works\\IT\\Java_start\\GeekBrains\\Seminars\\src\\main\\java\\Lection\\Lection2\\input.txt");
        File f1 = new File("1file.txt");
        File f2 = new File("/Users/sk/vscode/java_projects/1file.txt");
        System.out.println(f0);

        String pathProject = System.getProperty("1user.dir");
        String pathFile = pathProject.concat("/1file.txt");
        File f3 = new File(pathFile);
        System.out.println(f3.getAbsolutePath ());
        // /Users/sk/vscode/java_projects/1file.txt
        // C:/Users/Sk/Documents/xxx/brainexplosion/java/1file.txt
*/

        // Работа с файловой системой. Файлы. Ошибки

//        try {                   // Код, в котором может появиться ошибка
//        }
//        catch (Exception e) {   // Обработка, если ошибка случилась
//        }
//        finally {               // Код, который выполнится в любом случае
//        }

//        try {
//            String pathProject = System.getProperty("user.dir");
//            String pathFile = pathProject.concat("/file.txt");
//            File f3 = new File(pathFile);
//            System.out.println("try"); // выдает, если нет ошибок
//        } catch (Exception e) {System.out.println("catch");} // если есть ошибка
//        finally {System.out.println("finally");} // выдает всегда

//        try {
//            String pathProject = System.getProperty("user.dir");
//            String pathFile = pathProject.concat("/file.txt");
//            File file = new File(pathFile);
//            if (file.createNewFile()) {System.out.println("file.created");} // если file.txt нет, то создает
//            else {System.out.println("file.existed");} // если файл есть, то выводит это
//        }
//        catch (Exception e) {System.out.println("catch");}
//        finally {System.out.println("finally");}

//        String line = "empty";
//        try {
//            String pathProject = System.getProperty("user.dir");
//            String pathFile = pathProject.concat("/file.txt");
//            File file = new File(pathFile);
//            if (file.createNewFile()) {System.out.println("file.created");}
//            else {
//                BufferedReader bufReader = new BufferedReader(new FileReader(file));
//                System.out.println("file.existed");
//                line = bufReader.readLine();
//                bufReader.close();
//            }
//        }
//        catch (Exception e) {e.printStackTrace();}
//        finally {System.out.println(line);}

//        Работа с файловой системой. Каталоги

//        String pathProject = System.getProperty("user.dir");
//        String pathDir = pathProject.concat("/files");
//        File dir = new File(pathDir);
//        System.out.println(dir.getAbsolutePath ());
//        if (dir.mkdir()) {System.out.println("+");}
//        else {System.out.println("-");}
//        for (String fname : dir.list()) {System.out.println(fname);}

        // Логирование. Использование. Основы
//        Logger logger = Logger.getLogger(LectionTwo.class.getName());
//        logger.setLevel(Level.INFO);
//        ConsoleHandler ch = new ConsoleHandler ();
//        logger.addHandler(ch);
//        SimpleFormatter sFormat = new SimpleFormatter ();
//        ch.setFormatter(sFormat);
//        logger.log(Level.WARNING, "Тестовое логирование" );
//        logger.info("Тестовое логирование" );

        Logger logger = Logger.getLogger(LectionTwo.class.getName());
        logger.setLevel(Level.INFO);
        ConsoleHandler ch = new ConsoleHandler();
        logger.addHandler(ch);
        //SimpleFormatter sFormat = new SimpleFormatter();
        XMLFormatter xml = new XMLFormatter();
        //ch.setFormatter(sFormat);
        ch.setFormatter(xml);
        logger.log(Level.WARNING, "Тестовое логирование");
        logger.info("Тестовое логирование");



    }
}

